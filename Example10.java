package Laba3;
import java.util.Random;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int a = in.nextInt();
        Random r = new Random();
        int mas[] = new int[a];
        int i;
        for (i = 0; i < a; i++) {
            mas[i] = r.nextInt(10);
            System.out.print(mas[i] + " ");
        }
        for(i = mas.length-1 ; i >= 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (mas[j] < mas[j + 1]) {
                    int tmp = mas[j];
                    mas[j] =mas[j + 1];
                    mas[j + 1] = tmp;
                }
            }
        }
        System.out.println(" ");
        System.out.print("Произведена сортировка массива:");
        for (i = 0 ; i < mas.length ; i++ ){
            System.out.print( mas[i]+" ");
        }
}
}
