import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Value;
/*

 - See https://openjdk.java.net/jeps/358
 - Does not work for NPEs you throw (as you don't need help with those)
*/
public class HelpfulNPEs {

    @Value
    static class A {
        B b;
    }

    @Getter
    @NoArgsConstructor
    static class B {
        C c;
    }

    @Value
    static class C {
        String s;
    }

    public static void main(String[] args) {
        new A(new B()).getB().getC().getS();
    }

}
