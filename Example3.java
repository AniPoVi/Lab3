package Laba3;

import java.util.Scanner;

public class Example3 {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                System.out.println("Введите количество чисел Фибоначчи");
                int a =in.nextInt();
                int b = 1;
                int c = 1;
                int d;
                System.out.print(b +", "+c);
                for (int i = 3; i < a+1; i++)
                { d = b+c;
                        System.out.print(", "+d);
                        b=c;
                        c=d;
                }

        }
}
