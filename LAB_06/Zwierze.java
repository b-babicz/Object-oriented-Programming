package com.company;

public abstract class Zwierze {
    private double temperatura;

    public Zwierze() {}


        public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return ", temperatura:" + temperatura;
    }

    public abstract void podajTemperature();
}
