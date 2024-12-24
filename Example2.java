package Laba3;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите день недели");
        String A = in.nextLine();
        switch (A){
            case "понедельник":
                System.out.println("понедельник - это 1 день недели");
                break;
            case "Вторник":
                System.out.println("Вторник - это 2 день недели");
                break;
            case "среда":
                System.out.println("среда - это 3 день недели");
                break;
            case "четверг":
                System.out.println("четверг - это 4 день недели");
                break;
            case "пятница":
                System.out.println("пятница - это 5 день недели");
                break;
            case "суббота":
                System.out.println("суббота - это 6 день недели");
                break;
            case "воскресенье":
                System.out.println("воскресенье - это 7 день недели");
                break;
            default:
                System.out.println("нет такого дня недели");
        }
    }
}