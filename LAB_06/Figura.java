package com.company;

public abstract class Figura {
    private double obwodFigury;
    private double polePowierzchniFigury;

    public Figura(double obwodFigury, double polePowierzchniFigury) {
        this.obwodFigury = obwodFigury;
        this.polePowierzchniFigury = polePowierzchniFigury;
    }

    public double getObwodFigury() {
        return obwodFigury;
    }

    public void setObwodFigury(double obwodFigury) {
        this.obwodFigury = obwodFigury;
    }

    public double getPolePowierzchniFigury() {
        return polePowierzchniFigury;
    }

    public void setPolePowierzchniFigury(double polePowierzchniFigury) {
        this.polePowierzchniFigury = polePowierzchniFigury;
    }

    @Override
    public String toString() {
        return "obwód figury: " + obwodFigury +
                ", pole powierzchni figury: " + polePowierzchniFigury;
    }

    public abstract void obliczanieObwoduFigury();
    public abstract void obliczaniePolaPowierzchniFigury();
}
