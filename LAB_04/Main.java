package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Osoba osoba1 = new Osoba("Jan","Kowalski","01-03-1999","Mężczyzna");
        Student student1 = new Student("Maksymilian","Konieczny","08-06-2002","Mężczyzna",985475,"Stacjonarne","Informatyka",2);
        Wykladowca wykladowca1 = new Wykladowca("Andrzej","Nowak","15-03-1972","Mężczyzna","Doktor habilitowany","Kolegium Nauk Przyrodniczych","Instytut Informatyki","Programowanie w JAVA",5,"Uniwersytet Rzeszowski",2);
        Punkt2D punktDwuwymiarowy1 = new Punkt2D(9,8);
        Punkt3D punktTrojwymiarowy1 = new Punkt3D(8,6,3);
        Random generator = new Random();
        Punkt2D punktDwuwymiarowy2 = new Punkt2D(generator.nextInt(20), generator.nextInt(20));
        Punkt3D punktTrojwymiarowy2 = new Punkt3D(generator.nextInt(20),generator.nextInt(20),generator.nextInt(20));




        System.out.println("------------------------------------------------------------------");
        System.out.println("Zadanie 1:");
        System.out.println(osoba1);
        System.out.println(student1);
        System.out.println(wykladowca1);
        System.out.println("------------------------------------------------------------------");
        System.out.println("Zadanie 2:");
        System.out.println("Obiekty stworzone bez generatora liczb pseudolosowych: ");
        System.out.println(punktDwuwymiarowy1);
        System.out.println(punktTrojwymiarowy1);
        System.out.println("Obiekty stworzone z wykorzystaniem generatora liczb pseudolosowych: ");
        System.out.println(punktDwuwymiarowy2);
        System.out.println(punktTrojwymiarowy2);

    }
}
