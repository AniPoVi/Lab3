package Laba3;

import java.util.Scanner;

public class Example4a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ведите первое число");
        int a = in.nextInt();
        System.out.println("ведите второе число");
        int b = in.nextInt();
        if (a < b) {
            System.out.print(a);
            while (a!=b)
            {a++;
                System.out.print(", " + a);
                            }
        } else {
            System.out.print(b);
             while (b!=a)
            {b++;
                System.out.print(", " + b);

            }
        }
    }
}

