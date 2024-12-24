package Laba3;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ведите первое число");
        int a = in.nextInt();
        System.out.println("ведите второе число");
        int b = in.nextInt();
        if (a<b)
        {
            System.out.print(a);
            for (int i = a+1; i < b+1; i++) {
                System.out.print(", " + i);
                 }
        }
        else {
            System.out.print(b);
            for (int i = b+1; i <  a+1; i++) {
                System.out.print(", " + i);
            }
        }
        }
    }
