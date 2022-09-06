package com.company.obliczanieFigur;

public class Prostokat {

    public int bok1;
    public int bok2;

    public Prostokat(int bok1, int bok2) {
        this.bok1 = bok1;
        this.bok2 = bok2;
    }

    public double poleprostokatu(int bok1, int bok2) {
        double pole = bok1 * bok2;
        return pole;
    }

    public double obwodprostokatu(int bok1, int bok2) {
        double obwod = bok1 + bok1 + bok2 + bok2;
        return obwod;
    }

    public void pokazDane() {
        System.out.println("Prostokąt: ");
        System.out.println("Pole prostokąta o zadanych bokach: " + poleprostokatu(bok1, bok2));
        System.out.println("Obwód prostokąta o zadanych bokach: " + obwodprostokatu(bok1, bok2));
    }
}
