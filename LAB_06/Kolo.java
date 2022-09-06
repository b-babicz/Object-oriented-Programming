package com.company;

public class Kolo extends Figura{

    private double promien;

    public Kolo(double obwodFigury, double polePowierzchniFigury, double promien) {
        super(obwodFigury, polePowierzchniFigury);
        this.promien = promien;
    }

    public double getPromien() {
        return promien;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }

    @Override
    public String toString() {
        return "Kolo:  "+ "promień: " + promien +
                '\'' + super.toString();
    }

    @Override
    public void obliczanieObwoduFigury() {
        super.setObwodFigury(2*Math.PI*promien);
    }

    @Override
    public void obliczaniePolaPowierzchniFigury() {
        super.setPolePowierzchniFigury(Math.PI*promien*promien);
    }
}
