package Laba3;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива не больше 16");
        int a =in.nextInt();
        if (a<=16){
            char mass[] = new char[a];
            int i;
            char b = 'а'; //задаем значение массива 10-ю нечетными буквам алфавита (я хочу русскими)
            for (i = 0; i < a; b++) {
                if (b % 2 != 1) {
                    mass[i] = b;
                    i++;
                }
            } // выводим значение массива по порядку
            for (i = 0; i < mass.length; i++) {
                System.out.print(mass[i]+" ");
            }
            //выводим значение масива в обратном порядке
            for (i = mass.length-1; i >0; i--) {
                System.out.print(mass[i]+" ");
            }
        }
        else {
            System.out.print("в русском алфавите нет столько нечетных букв");
        }
    }

}