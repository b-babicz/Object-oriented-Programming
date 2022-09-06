package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner obiekt1 = new Scanner(System.in);

        //System.out.println("Wynik dzialania programu: " + dodawanieLiczbUzytkownika()); - ZADANIE 2.1
        /*
        ZADANIE 2.2 i 2.3
        System.out.println("Wprowadz, którą potęgę liczby 2 chcesz obliczyć: ");
        int n = obiekt1.nextInt();
        System.out.println("Wynik działania programu 2^n metodą iteracyjną: " + iteracyjnaMetoda2DoN(n));
        System.out.println("Wynik działania programu 2^n metodą rekurencyjną: " + rekurencyjnaMetoda2DoN(n));
        System.out.println("Wynik działania programu n! metodą iteracyjną: " + silniaNIteracja(n));
        System.out.println("Wynik działania programu 2^n metodą rekurencyjną: " + silniaNRekurencja(n));
        */
        /*
        ZADANIE 2.5
        int n = obiekt1.nextInt();
        System.out.println("Wynik działania programu dla pierwszej rekurencji: "+ rekurencjaJeden(n));
        System.out.println("Wynik działania programu dla drugiej rekurencji: "+ rekurencjaDwa(n));
        */
        // System.out.println("Wynik działania programu: "+ najwiekszaZ10()); ZADANIE 2.6
        // System.out.println("Wynik działania programu: "+ liczbyZPrzedzialu()); ZADANIE 2.7
        /*
        ZADANIE 2.4
        System.out.println("Wynik działania programu: " + szeregJeden());
        System.out.println("Wynik działania programu: " + szeregDwa());
        System.out.println("Wynik działania programu: " + szeregTrzy());
        System.out.println("Wynik działania programu: " + szeregCztery());
        */
        
    }

    /*public static int dodawanieLiczbUzytkownika() {
        int a;
        int suma = 0;
        Scanner obiektMetoda1 = new Scanner(System.in);

        do {
            a = obiektMetoda1.nextInt();
            suma = suma + a;
        }while(a!=0);
        return suma;
    }*/
    /*
    public static int iteracyjnaMetoda2DoN(int n) {
        int i;
        int potega2 = 1;
        for (i = 1; i <= n; i++) {
            potega2 = potega2 * 2;
        }
        return potega2;
    }

    public static int rekurencyjnaMetoda2DoN(int n) {
        int potega21 = 0;
        if (n == 0) potega21 = 1;
        else potega21 = 2*rekurencyjnaMetoda2DoN(n - 1);
        return potega21;
    }

    public static int silniaNIteracja(int n) {
        int i;
        int silnia = 1;
        for (i = 1; i <= n; i++) {
            silnia = silnia * i;
        }
        return silnia;
    }
    public static int silniaNRekurencja(int n)
    {
        int silnia = 0;
        if (n==0) silnia=1;
        else silnia = n*silniaNRekurencja(n-1);
        return silnia;
    }
    */
    public static int rekurencjaJeden(int n) {
        int wyrazenie = 0;
        if (n == 0) wyrazenie = 2;
        else wyrazenie = rekurencjaJeden(n - 1) + 3 * n;
        return wyrazenie;
    }

    public static int rekurencjaDwa(int n) {
        int wyrazenie = 0;
        if (n == 0) wyrazenie = 1;
        else {
            if (n == 1) wyrazenie = 3;
            else wyrazenie = (2 * rekurencjaDwa(n - 1)) + (3 * rekurencjaDwa(n - 2));
        }
        ;
        return wyrazenie;
    }

    public static int najwiekszaZ10() {
        Scanner obiektMetoda1 = new Scanner(System.in);
        int[] tablica = new int[10];
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println("Podaj element nr: " + (i + 1));
            tablica[i] = obiektMetoda1.nextInt();
        }
        int maksimum = tablica[0];
        int j;
        for (j = 0; j < 10; j++) {
            if (maksimum < tablica[j]) maksimum = tablica[j];
            else maksimum = maksimum;
        }
        return maksimum;
    }

    public static int liczbyZPrzedzialu() {
        Scanner obiektMetoda1 = new Scanner(System.in);
        int[] tablica = new int[5];
        int i;
        for (i = 0; i < 5; i++) {
            System.out.println("Podaj element nr: " + (i + 1));
            tablica[i] = obiektMetoda1.nextInt();
        }
        int j;
        int ilosc = 0;
        for (j = 0; j < 5; j++) {
            if (tablica[j] >= -1 && tablica[j] <= 1) ilosc++;
            else ilosc = ilosc;
        }
        return ilosc;
    }

    public static double szeregJeden() {
        int i;
        double sumawyrazen = 0;
        for (i = 1; i <= 30; i++) {
            sumawyrazen = i / (i + 2);
        }
        return sumawyrazen;
    }

    public static double szeregDwa() {
        int j;
        double sumawyrazen = 0;
        for (j = 1; j <= 5; j++) {
            sumawyrazen = 2 * j;
        }
        return sumawyrazen;
    }
        public static double szeregTrzy()
        {
            int i, j;
            double sumawyrazen = 0;
            for (i = 1; i <= 20; i++) {
                for (j = 1; j <= 10; j++) {
                    sumawyrazen = (i + j) / 2 * i;
                }
            }
            return sumawyrazen;
        }

    public static double szeregCztery() {
        int i, j;
        double sumawyrazen = 0;
        for (i = 1; i <= 40; i++) {
            for (j = 1; j <= 20; j++) {
                sumawyrazen = i+(2*j);
            }
        }
        return sumawyrazen;
    }

}

