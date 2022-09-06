package com.company;

public class Prostokat extends Figura{

    private double bok1;
    private double bok2;

    public Prostokat(double obwodFigury, double polePowierzchniFigury, double bok1, double bok2) {
        super(obwodFigury, polePowierzchniFigury);
        this.bok1 = bok1;
        this.bok2 = bok2;
    }

    public double getBok1() {
        return bok1;
    }

    public void setBok1(double bok1) {
        this.bok1 = bok1;
    }

    public double getBok2() {
        return bok2;
    }

    public void setBok2(double bok2) {
        this.bok2 = bok2;
    }

    @Override
    public String toString() {
        return "Prostokat: " +
                "bok1: " + bok1 +
                ", bok2: " + bok2 +
                '\'' + super.toString();
    }

    @Override
    public void obliczanieObwoduFigury() {
        super.setObwodFigury(bok1+bok1+bok2+bok2);
    }

    @Override
    public void obliczaniePolaPowierzchniFigury() {
        super.setPolePowierzchniFigury(bok1*bok2);
    }
}
