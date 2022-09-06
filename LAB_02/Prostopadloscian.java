package com.company.obliczanieFigur;

public class Prostopadloscian {
    public int krawedz1;
    public int krawedz2;
    public int krawedz3

    public Szescian(int bok)
    {
        this.krawedz1=krawedz1;
        this.krawedz2=krawedz2;
        this.krawedz3=krawedz3;
    }

    public double poleprostopadloscianu(int krawedz1, int krawedz2, int krawedz3)
    {
        double pole=(2*krawedz1*krawedz2)+(2*krawedz1*krawedz3)+(2*krawedz2*krawedz3);
        return pole;
    }
    public double obwodprostopadloscianu(int krawedz1, int krawedz2, int krawedz3)
    {
        double obwod =(4*krawedz1)+(4*krawedz2)+(4*krawedz3);
        return obwod;
    }
    public double objetoscprostopadloscianu(int krawedz1, int krawedz2, int krawedz3)
    {
        double objetosc =krawedz1*krawedz2*krawedz3;
        return objetosc;
    }

    public void pokazDane()
    {
        System.out.println("Prostopadłościan: ");
        System.out.println("Pole prostopadłościanu o zadanych krawędziach: "+poleprostopadloscianu(krawedz1,krawedz2,krawedz3));
        System.out.println("Obwód prostopadłościanu o zadanych krawędziach: "+obwodprostopadloscianu(krawedz1,krawedz2,krawedz3));
        System.out.println("Objętość prostopadłościanu o zadanych krawędziach: "+objetoscprostopadloscianu(krawedz1,krawedz2,krawedz3));
    }
}
