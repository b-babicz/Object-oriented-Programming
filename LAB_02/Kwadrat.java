package com.company.obliczanieFigur;

public class Kwadrat {

    public int bok;

    public Kwadrat(int bok)
    {
        this.bok=bok;
    }

    public double polekwadratu(int bok)
    {
        double pole=bok*bok;
        return pole;
    }
    public double obwodkwadratu(int bok)
    {
        double obwod = 4*bok;
        return obwod;
    }

    public void pokazDane()
    {
        System.out.println("Kwadrat: ");
        System.out.println("Pole kwadratu o zadanym boku: "+polekwadratu(bok));
        System.out.println("Obwód kwadratu o zadanym boku: "+obwodkwadratu(bok));
    }
}
