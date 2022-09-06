package com.company;

public class Kwadrat extends Figura{

   private double bok;

    public Kwadrat(double obwodFigury, double polePowierzchniFigury, double bok) {
        super(obwodFigury, polePowierzchniFigury);
        this.bok = bok;
    }

    public double getBok() {
        return bok;
    }

    public void setBok(double bok) {
        this.bok = bok;
    }

    @Override
    public String toString() {
        return "Kwadrat: " +
                "bok: " + bok + '\'' + super.toString();
    }

    @Override
    public void obliczanieObwoduFigury() {
        super.setObwodFigury(4*bok);
    }

    @Override
    public void obliczaniePolaPowierzchniFigury() {
        super.setPolePowierzchniFigury(bok*bok);
    }
}
