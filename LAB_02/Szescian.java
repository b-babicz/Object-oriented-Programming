package com.company.obliczanieFigur;

public class Szescian {

    public int krawedz;

    public Szescian(int bok)
    {
        this.krawedz=krawedz;
    }

    public double poleszescianu(int krawedz)
    {
        double pole=6*(krawedz*krawedz);
        return pole;
    }
    public double obwodszescianu(int krawedz)
    {
        double obwod = 12*krawedz;
        return obwod;
    }
    public double objetoscszescianu(int krawedz)
    {
        double objetosc = (krawedz*krawedz*krawedz);
        return objetosc;
    }

    public void pokazDane()
    {
        System.out.println("Sześcian: ");
        System.out.println("Pole sześcianu o zadanej krawędzi: "+poleszescianu(krawedz));
        System.out.println("Obwód sześcianu o zadanej krawędzi: "+obwodszescianu(krawedz));
        System.out.println("Objętość sześcianu o zadanej krawędzi: "+objetoscszescianu(krawedz));
    }
}
