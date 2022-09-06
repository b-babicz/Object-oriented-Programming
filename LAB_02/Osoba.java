package com.company;

public class Osoba {

    public String imie;
    public String nazwisko;
    public int wiek;

    public Osoba(String imie, String nazwisko, int wiek )
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public Osoba(String imie, String nazwisko)
    {
        this.imie = imie;
        this.nazwisko=nazwisko;
    }

    public Osoba()
    {

    }
    public void pokazDane()
    {
        System.out.println("Osoba: ");
        System.out.println("Imie osoby: "+this.imie);
        System.out.println("Nazwisko osoby: "+this.nazwisko);
        System.out.println("Wiek osoby: "+this.wiek);
    }
}
