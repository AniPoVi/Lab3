package Laba3;

import java.util.Scanner;

public class Example2a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите день недели");
        String A = in.nextLine();
        if (A.equals("понедельник"))
        System.out.println("понедельник - это 1 день недели");
        else if (A.equals("вторник"))
        {System.out.println("вторник - это 2 день недели");}
        else if (A.equals("среда"))
        {System.out.println("среда - это 3 день недели");}
        else if (A.equals("четверг"))
        {System.out.println("четверг - это 4 день недели");}
        else if (A.equals("пятница"))
        {System.out.println("пятница - это 5 день недели");}
        else if (A.equals("суббота"))
        {System.out.println("суббота - это 6 день недели");}
        else if (A.equals("воскресенье"))
        {System.out.println("восквесенье - это 7 день недели");}
        else
        {System.out.println("нет такого дня недели");}

                         }
    }
