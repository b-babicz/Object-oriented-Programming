package com.company;

public class Stalocieplne extends Zwierze{

    private String nazwaZwierzecia;
    private double temperaturaZwierzecia;

    public Stalocieplne(String nazwaZwierzecia, double temperaturaZwierzecia) {
        super();
        this.nazwaZwierzecia = nazwaZwierzecia;
        this.temperaturaZwierzecia = temperaturaZwierzecia;
    }

    public String getNazwaZwierzecia() {
        return nazwaZwierzecia;
    }

    public void setNazwaZwierzecia(String nazwaZwierzecia) {
        this.nazwaZwierzecia = nazwaZwierzecia;
    }

    public double getTemperaturaZwierzecia() {
        return temperaturaZwierzecia;
    }

    public void setTemperaturaZwierzecia(double temperaturaZwierzecia) {
        this.temperaturaZwierzecia = temperaturaZwierzecia;
    }

    @Override
    public String toString() {
        return "Stalocieplne:" +
                "nazwa zwierzęcia: " + nazwaZwierzecia + '\'' +super.toString();
    }

    @Override
    public void podajTemperature() {
        super.setTemperatura(temperaturaZwierzecia);
    }
}
