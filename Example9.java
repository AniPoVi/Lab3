package Laba3;
import java.util.Random;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int a = in.nextInt();
        Random r = new Random();
        int mas[] = new int[a];
        int min = 10;
        for (int i = 0; i < a ; i++)
        {
            mas[i] = r.nextInt(10);
            System.out.print(mas[i] +" ");
        }
        System.out.println(" ");
        for (int i = 0; i < a ; i++) {
            if (mas[i] < min) {
                min = mas[i];
            }
        }
        System.out.println("минимальное значение в масиве:" +min);
        System.out.print("Индекс(ы) с минимальным занчением:");
        for (int i = 0; i < a ; i++) {
            if (mas[i] == min) {
                System.out.print(i+ " ");
            }
        }
        }

    }
