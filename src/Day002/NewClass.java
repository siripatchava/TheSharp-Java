package Day002;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class NewClass {
    int x = 5;

    static void method1() {
        int x = 5;
        System.out.println("Hello abc");
        System.out.println("X Value" +x);
    }

    // System.out.println("abc");

    public static void main(String[] args) {
        NewClass mynewobj = new NewClass();
        System.out.println("Print any thing");
        System.out.println();
        System.out.println(mynewobj.x);
       method1();



    }
}
