
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;




public class Main {
    public static void main(String[] args)
    {
        //Zadanie1();
        //Zadanie2();
        //Zadanie3();
        //Zadanie4();



        //Zadanie 5 - 2 sposób?
        String a="ala", b="aleksander", c="KAJAK", d="12321";
        System.out.println("Palindrom "+a+" ? = "+czyPalidrom(a));
        System.out.println("Palindrom "+b+" ? = "+czyPalidrom(b));
        System.out.println("Palindrom "+c+" ? = "+czyPalidrom(c));
        System.out.println("Palindrom "+d+" ? = "+czyPalidrom(d));

    }//Koniec main

    public static double Input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj n: ");
        double n = input.nextDouble();
        return n;
    }


//Zadanie 1
public static void  Zadanie1()
{
    double ilStud = Input();
    double pkt, suma =0;
    int a=0, b=40, ile =0;
    if (ilStud>0)
    {
      while (ilStud>0)
      {
          System.out.println("Podaj lp. plt 0 - 40");
          pkt = Input();
          if(pkt >=a && pkt<=b)
          {
              suma +=pkt;
              ile++;
              ilStud--;
          }
      }//koniec while
        System.out.println("Ile: "+ile);
        System.out.println("Suma pkt = "+suma);
        System.out.println("Srednia = "+suma/ile);
    }
    else System.out.println("Grupa musi liczyc co najmniej 1-go studenta");
}

    //Zadanie 2
    public static void Zadanie2()
    {
        double sumad = 0, sumau = 0, iledot=0, ileu=0, liczba;
        for (int i = 0; i < 10; i++) {
            liczba = Input();
            if (liczba >= 0) {
                sumad += liczba;
                iledot++;
            } else {
                ileu++;
                sumau += liczba;
            }
        }//koniec for

        System.out.println("Suma liczb dodatnich wynosi "+sumad+" ilosc liczb: "+iledot);
        System.out.println("Suma liczb dodatnich wynosi "+sumau+" ilosc liczb: "+ileu);

    }

    //Zadanie 3
    public static void Zadanie3()
    {
        double n = Input();
        double liczba, suma=0;


        if(n>0)
        {
            while(n>0)
            {
                liczba = Input();
                if (liczba % 2 == 0) suma += liczba;
                n--;
            }
            System.out.println("Suma liczb parzystych: "+suma);
        }
        else System.out.println("Ciag musi miec co najmniej jedna liczbe");
    }


//Zadanie 4
    public static void Zadanie4()
    {
        double n = Input();
        int liczba, suma=0;

        Random rand = new Random();

        if(n>0)
        {
            while(n>0)
            {
                liczba = rand.nextInt(56)-10; //-10 -45
                //System.out.println("Wylosowana: "+liczba);
                if (liczba % 2 == 0) suma += liczba;
                n--;
            }
            System.out.println("Suma liczb parzystych: "+suma);
        }
        else System.out.println("Ciag musi miec co najmniej jedna liczbe");
    }


//Zadanie 5
public static boolean czyPalidrom(String text)
{
    int end = text.length()-1;
    text.toLowerCase(Locale.ROOT);
    for (int i = 0; i < text.length()/2; i++)
    {
        if(text.charAt(i) != text.charAt(end)) return false;
        end --;
    }
    return true;
}
}




