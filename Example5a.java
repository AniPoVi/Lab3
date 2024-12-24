package Laba3;

import java.util.Scanner;

public class Example5a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел, которые необходимо просуммировать");
        int a =in.nextInt();
        int n=0;
        int sum=0;
        int i = 1;
        while (n < a)
        {if (i%5==2 & i%3==1)
        { System.out.printf("%d ", +i);
            sum+= i;
            n++;}
            i++;}
        System.out.printf("%nСумма: %d", +sum);

    }

}
