package Laba3;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int a =in.nextInt();
        int mas[];
        if (a >0)
            mas = new int [a];
        else
        {System.out.println("Неверный размер массива");
            return;}
        int n=0;
        for (int i=0; n < a; i++)
            if (i%5==2)
            { mas[n]= i;
                System.out.printf("%d ", mas[n]);
                n++;}

    }

}
