package Timus;

import java.util.Scanner;

public class Zadacha1785 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n>0 && n<5)
        {System.out.println("few");}
            else if (n>4 && n<10)
            {System.out.println("several");}
            else if (n> 9 && n<20)
            {System.out.println("pack");}
            else if (n>19 && n<50)
            {System.out.println("lots");}
            else if (n>49 && n<100)
            {System.out.println("horde");}
            else if (n>99 && n<250)
            {System.out.println("throng");}
            else if (n>249 && n<500)
            {System.out.println("swarm");}
            else if (n>499 && n<1000)
            {System.out.println("zounds");}
            else
            {System.out.println("legion");}

        }
    }

