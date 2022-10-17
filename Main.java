import java.util.Random;

import java.util.Scanner;
//import java.util.*; - import wszystkiego poprzez *

// psv - skrót do public class
// psvm - skrót do public class

public class Main {
    public static void main(String[] args)
    {
        // System.out.println(); - Wyświetlanie na ekranie - SKRÓT SOUT!!!!
/*        System.out.println("Hello world!");
        System.out.print("Witaj");
        System.out.print("Witaj print");
        System.out.printf("Witaj printf");*/
        // zadanie1();
        //zadanie2();
        //zadanie3();
        //zadanie4();
        //zadanie5_1();
        zadanie5();

    }



    public static void zadanie0()
    {
        int a, b=23;
        double c=23.43434;
        //float c= (float) 23.43434;
        String imie = "Dawid";
        boolean wartosc = true;

        System.out.println("Imie: "+imie+ " wartosc b = " +b);

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj a: ");
        a = input.nextInt();
        System.out.println(a+" + "+b +" = "+ (a+b));
    }

/*    public static void zadanie1()
    {
        int a=2;
        a++; ++a; a--;
        a+=a;
        //&& || ! == > < >= <= !=
        //if (warunek) // Jeżeli 1 linia instrukcji możemy nie dawać nawiasów
        {
            instrukcje
        } else {
            //...
        }
    }*/

    public static void zadanie2()
    {
        System.out.println(getName());
        System.out.println(getAge());

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj a = ");
        int a = in.nextInt();
        System.out.println("Podaj b = ");
        int b = in.nextInt();

        obliczenia(a,b);
    }

    public static String getName() {return "Jan";}

    public static int getAge() {return 23;}

    public static void obliczenia(int a, int b)
    {
        System.out.println((a+" + "+b +" = "+(a+b)));
        System.out.println((a+" - "+b +" = "+(a-b)));
        System.out.println((a+" * "+b +" = "+(a*b)));
    }

    public static void zadanie3()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int a = input.nextInt();
        if(a % 2 == 0)
        {
            System.out.println("True");;
        }else {
            System.out.println("False");;
        }
    }

    public static void zadanie4()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int a = input.nextInt();

        if(a%3==0 && a%5==0)
        {
            System.out.println("Ta liczba jest podzielna przez 3 i 5");
        }else{System.out.println("Ta liczba nie jest podzielna przez 3 i 5");}
    }

    public static void zadanie5_1()
    {
        Random rand = new Random();
        // [-5, 16]
/*        int a = rand.nextInt(bound: 16) -5;
        System.out.println("Wylosowana liczba: "+a);*/

        //int a=7, b=15;
        //[a,b]
        //int bound;
        //int wylosowana = rand.nextInt(bound: b-a+1)+a;
        //System.out.println(wylosowana);
    }

    public static void zadanie5()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj a: ");
        int a = in.nextInt();


    }




}