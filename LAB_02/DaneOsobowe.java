package com.company;

import com.company.obliczanieFigur.*;

import java.util.Scanner;

public class DaneOsobowe {

    public static void main(String[] args) {

        /*
        ZADANIE 1
        Osoba osoba1 = new Osoba("Jan","Kowalski",15);
        osoba1.pokazDane();
        System.out.println("------------------------------------------");
        Osoba osoba2 = new Osoba("Adam","Nowak");
        osoba2.pokazDane();
        System.out.println("------------------------------------------");
        osoba2.imie = "Stefan";
        osoba2.wiek = 70;
        osoba2.pokazDane();
        System.out.println("------------------------------------------");
        Osoba osoba3 = new Osoba();
        osoba3.imie = "Anna";
        osoba3.nazwisko = "Wiśniewska";
        osoba3.wiek = 45;
        osoba3.pokazDane();*/

        /*
        ZADANIE 2
        Student student1 = new Student("Jan");
        student1.pokazDaneStudenta();
        System.out.println("------------------------------------------");
        Student student2 = new Student("Anna","Wiśniewska-Chrząszcz");
        student2.pokazDaneStudenta();
        System.out.println("------------------------------------------");
        Student student3 = new Student("Grzegorz","Brzęczyszczykiewicz",585125);
        student3.pokazDaneStudenta();
        System.out.println("------------------------------------------");
        Student student4 = new Student("Ewelina","Makowska",984562,"Ochrona danych osobowych w cyberprzestrzenii");
        student4.pokazDaneStudenta();
        System.out.println("------------------------------------------");
        Student student5 = new Student("Marcin","Nowak",854662,"Informatyka stosowana",3);
        student5.pokazDaneStudenta();
        System.out.println("------------------------------------------");

        */

        Scanner obiekt = new Scanner(System.in);

        /*
        ZADANIE 3
        String imieZmienna = obiekt.nextLine();
        String nazwiskoZmienna = obiekt.nextLine();
        int indeksZmienna = obiekt.nextInt();
        String specjalnoscZmienna = obiekt.next();
        int rokStudiowZmienna = obiekt.nextInt();

        Student studentwprowadzany = new Student(imieZmienna,nazwiskoZmienna,indeksZmienna,specjalnoscZmienna,rokStudiowZmienna);
        studentwprowadzany.pokazDaneStudenta();*/

        int promienZmienna = obiekt.nextInt();
        Kolo kolo1 = new Kolo(promienZmienna);
        kolo1.pokazDane();
        System.out.println("------------------------------------------");
        int bokZmienna = obiekt.nextInt();
        Kwadrat kwadrat1 = new Kwadrat(bokZmienna);
        kwadrat1.pokazDane();
        System.out.println("------------------------------------------");
        int bok1Zmienna = obiekt.nextInt();
        int bok2Zmienna = obiekt.nextInt();
        Prostokat prostokat1 = new Prostokat(bok1Zmienna,bok2Zmienna);
        prostokat1.pokazDane();
        System.out.println("------------------------------------------");
        int krawedzZmienna = obiekt.nextInt();
        Szescian szescian1 = new Szescian(krawedzZmienna);
        szescian1.pokazDane();
        System.out.println("------------------------------------------");
        int krawedz1Zmienna = obiekt.nextInt();
        int krawedz2Zmienna = obiekt.nextInt();
        int krawedz3Zmienna = obiekt.nextInt();
        Prostopadloscian prostopadloscian1 = new Prostopadloscian(krawedz1Zmienna,krawedz2Zmienna,krawedz3Zmienna);
        prostopadloscian1.pokazDane();
        System.out.println("------------------------------------------");


    }
}
