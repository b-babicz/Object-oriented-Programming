package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        /*
        ZADANIE 2 - klasa opisująca pozycje książkowe w księgarni

        Ksiegozbior ksiazka1 = new Ksiegozbior();
        ksiazka1.setTytul("Skazanie");
        ksiazka1.setAutor("Remigiusz Mróz");
        ksiazka1.setLiczbaStron(488);
        ksiazka1.setRokWydania(2022);
        ksiazka1.setCena(23.99);
        System.out.println(ksiazka1);
        ksiazka1.cena = 58.25;
        System.out.println(ksiazka1);
        Ksiegozbior ksiazka2 = new Ksiegozbior();
        ksiazka2.setTytul("Przykładowy tytuł książki, czyli test programu w języku programowania JAVA");
        ksiazka2.setAutor("Jan Kowalski");
        ksiazka2.setLiczbaStron(785);
        ksiazka2.setRokWydania(2018);
        ksiazka2.setCena(49.98);
        System.out.println(ksiazka2);
        ksiazka2.cena = 23.87;
        System.out.println(ksiazka2);

        */
        /*ZADANIE 3 - stos

        Scanner scanner = new Scanner(System.in);
        int[] tablica;
        System.out.println("Wprowadz jak wielki ma byc stos: ");
        int n = scanner.nextInt();
        System.out.println("------------------------------------------");
        System.out.println("Wprowadz kolejne elementy stosu zatwierdzając je klawiszem ENTER");
        tablica = new int[n];
        for (int i = 0; i < n; i++) {
            tablica[i] = scanner.nextInt();
        }
        Stos stos1 = new Stos();
        stos1.setTabRepStos(tablica);
        stos1.setWskaznikStosu(tablica[tablica.length-1]);
        System.out.println("------------------------------------------");
        System.out.println(stos1);
        */


        //ZADANIE 4 - klasa z datą

        Scanner scanner = new Scanner(System.in);
        DataKlasa data = new DataKlasa();
        System.out.println("Wprowadź dzień: ");
        data.setDzien(scanner.nextInt());
        System.out.println("------------------------------------------");
        System.out.println("Wprowadz miesiąc: ");
        data.setMiesiac(scanner.nextInt());
        System.out.println("------------------------------------------");
        System.out.println("Wprowadź rok: ");
        data.setRok(scanner.nextInt());
        System.out.println("------------------------------------------");
        System.out.println(data);
        System.out.println("------------------------------------------");
        System.out.println(data.tydzienWTyl());
        System.out.println("------------------------------------------");
        System.out.println(data.tydzienWPrzod());
    }
}

