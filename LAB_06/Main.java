package com.company;

import javax.sound.sampled.Port;

public class Main {

    public static void main(String[] args) {

        Kwadrat kwadrat = new Kwadrat(0,0,3.0);
        System.out.println("Zadanie 1 - klasa abstrakcyjna figura i metody abstrakcyjne obwód i pole");
        System.out.println(kwadrat);
        kwadrat.obliczanieObwoduFigury();
        kwadrat.obliczaniePolaPowierzchniFigury();
        System.out.println(kwadrat);
        System.out.println("------------------------------------------------");
        Kolo kolo = new Kolo(0,0,5.0);
        System.out.println(kolo);
        kolo.obliczanieObwoduFigury();
        kolo.obliczaniePolaPowierzchniFigury();
        System.out.println(kolo);
        System.out.println("--------------------------------------------------------------");
        Figura[] baza = new Figura[3];
        baza[0] = new Kwadrat(0,0,3.0);
        baza[1] = new Kolo(0,0,5.0);
        baza[2] = new Prostokat(0,0,25.0,36.0);
        for(Figura element: baza)
        {
            element.obliczanieObwoduFigury();
            element.obliczaniePolaPowierzchniFigury();
            System.out.println(element);
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Zadanie 2 - klasa abstrakcyjna zwierze i metoda abstrakcyjna podajtemperaturę");
        Zwierze[] tablica1 = new Zwierze[2];
        tablica1[0] = new Stalocieplne("Sęp",37.0);
        tablica1[1] = new Zmiennocieplne("Pirania", 10.0, 25.0);

        for(Zwierze element: tablica1)
        {
            element.podajTemperature();
            System.out.println(element);
        }
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Zadanie 3 - interfejs wypisywanie");
        Wypisywanie[] tablica2 = new Wypisywanie[8];
        tablica2[0] = new Samochod("BMW",2001,"diesel");
        tablica2[1] = new Samochod("Fiat",1984,"LPG");
        tablica2[2] = new Samochod("Tesla", 2020,"Elektryczny");
        tablica2[3] = new Samochod("Opel Astra",1999,"Benzyna");
        tablica2[4] = new Ksiazka("1984","Warszawa",1999);
        tablica2[5] = new Ksiazka("Pan Tadeusz ","Księga",1932);
        tablica2[6] = new Ksiazka("Metro","Warszawa",2002);
        tablica2[7] = new Ksiazka("Programowanie obiektowe","Uniwersytet Rzeszowski",2010);

        for(Wypisywanie element: tablica2)
        {
            element.pole();
            element.poleNazwa();
            System.out.println(element);
        }


    }
}
