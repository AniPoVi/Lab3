package Laba3;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел, которые необходимо просуммировать");
        int a =in.nextInt();
        int n=0;
        int sum=0;
        for (int i=0; n < a; i++)
            if (i%5==2 & i%3==1)
            { System.out.printf("%d ", +i);
                sum+= i;
                n++;}
        System.out.printf("%nСумма: %d", +sum);

    }

}

