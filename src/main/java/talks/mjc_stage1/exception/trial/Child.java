package talks.mjc_stage1.exception.trial;

import java.io.IOException;

public class Child extends Parent {
    void msg() throws NumberFormatException // Compile-time error because the overriding method is throwing a checked exception.
    {
        System.out.println("msg-Child");
    }

    public static void main(String[] args) throws IOException {
        Parent p = new Child();
        p.msg();

        Child c = new Child();
        c.msg();
    }
}
