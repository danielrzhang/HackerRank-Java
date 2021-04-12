package java;

import java.util.*;

public class JavaStdinAndStdoutI {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        in.close();
    }
}
