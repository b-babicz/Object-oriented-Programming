import matematyka.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //System.out.println("Wprowadz ilosc ulamkow: ");
       // int iloscUlamkow = sc.nextInt();
        //UlamekZwykly[] ulamki = new UlamekZwykly[iloscUlamkow];
        //ulamki[1] = new UlamekZwykly(5,2,iloscUlamkow);
       // ulamki[2] = new UlamekZwykly(3,5);
        //System.out.println("Zadanie 2.2");
        //for (int i =1; i<iloscUlamkow+1; i++)
        {
           // System.out.println(ulamki[i]);
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Zadanie 2.3");
        System.out.println(matematyka.OperacjeNaUlamkach.dodawanieUlamkow(5,2,15,3));
        System.out.println(matematyka.OperacjeNaUlamkach.odejmowanieUlamkow(5,2,15,3));
        System.out.println(matematyka.OperacjeNaUlamkach.mnozenieUlamkow(5,2,15,3));
        System.out.println(matematyka.OperacjeNaUlamkach.dzielenieUlamkow(5,2,15,3));
        System.out.println(matematyka.OperacjeNaUlamkach.mnozenieUlamkaPrzezCalkowita(5,2,15));
        System.out.println("----------------------------------------------");
        System.out.println("Zadanie 2.4");
        UlamekZwykly.UlamekDziesietny ulamek3 = new UlamekZwykly.UlamekDziesietny(5,5);
        System.out.println(ulamek3);
        System.out.println("--------------------------------------------------------");
        System.out.println("Zadanie 2.5");
        LiczbaZespolona liczba1 = new LiczbaZespolona(5,3);
        System.out.println(liczba1);
        System.out.println("-----------------------------------");
        System.out.println("Zadanie 2.7");
        LiczbaZespolona.Modul modul1 = new LiczbaZespolona.Modul(5,3);
        System.out.println(modul1);

    }
}
