import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello");
        System.out.print(", World!");
        System.out.print(", World!\n");

        // Syntax, Variables, and Data Types
        String geoff = "Geoff";
        System.out.println("Line 8: " + geoff);

        // 12
        Object o = "three";
        System.out.println(o);
//        int three = (int) o; // This throws an issue

        // 9

//        float myNumber = 3.14F;
        float myNumber = (float) 3.14;

    }
}