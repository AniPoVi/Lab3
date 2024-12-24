package Laba3;

import java.util.Scanner;

public class Example3a {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                System.out.println("Введите количество чисел Фибоначчи");
                int a =in.nextInt();
                int b = 1;
                int c = 1;
                int d;
                int i = 3;
                System.out.print(b +", "+c);
                while (i < a+1)
                { d = b+c;
                        System.out.print(", "+d);
                        i++;
                        b=c;
                        c=d;
                }

        }
}
