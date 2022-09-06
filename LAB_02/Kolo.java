package com.company.obliczanieFigur;

public class Kolo {

    public int promien;

    public Kolo(int promien)
    {
        this.promien=promien;
    }

    public double polekola(int promien)
    {
        double pole=3.14*(promien^2);
        return pole;
    }
    public double obwodkola(int promien)
    {
        double obwod = (2*3.14*promien);
        return obwod;
    }

    public void pokazDane()
    {
        System.out.println("Koło: ");
        System.out.println("Pole koła o zadanym promieniu: "+polekola(promien));
        System.out.println("Obwód koła o zadanym promieniu: "+obwodkola(promien));
    }
}
