package com.company;

public class Student {

    public String imie;
    public String nazwisko;
    public int nrIndeksu;
    public String nazwaSpecjalnosci;
    public int rokStudiow;

    public Student(String imie)
    {
        this.imie = imie;
    }

    public Student(String imie, String nazwisko)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Student(String imie, String nazwisko, int nrIndeksu)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrIndeksu = nrIndeksu;
    }
    public Student(String imie, String nazwisko, int nrIndeksu, String nazwaSpecjalnosci)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrIndeksu = nrIndeksu;
        this.nazwaSpecjalnosci = nazwaSpecjalnosci;
    }
    public Student(String imie, String nazwisko, int nrIndeksu, String nazwaSpecjalnosci, int rokStudiow)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrIndeksu = nrIndeksu;
        this.nazwaSpecjalnosci = nazwaSpecjalnosci;
        this.rokStudiow = rokStudiow;
    }

    public void pokazDaneStudenta()
    {
        System.out.println("Student: ");
        System.out.println("Imie studenta: "+imie);
        System.out.println("Nazwisko studenta: "+nazwisko);
        System.out.println("Numer indeksu studenta: "+nrIndeksu);
        System.out.println("Nazwa specjalności studiowanej przez studenta: "+nazwaSpecjalnosci);
        System.out.println("Rok studiów rozpoczęty przez studenta: "+rokStudiow);
    }
}
