package com.company;

public class Zmiennocieplne extends Zwierze{

    private String nazwaZwierzecia;
    private double temperaturaMinimalna;
    private double temperaturaMaksymalna;

    public Zmiennocieplne(String nazwaZwierzecia, double temperaturaMinimalna, double temperaturaMaksymalna) {
        super();
        this.nazwaZwierzecia = nazwaZwierzecia;
        this.temperaturaMinimalna = temperaturaMinimalna;
        this.temperaturaMaksymalna = temperaturaMaksymalna;
    }

    public String getNazwaZwierzecia() {
        return nazwaZwierzecia;
    }

    public void setNazwaZwierzecia(String nazwaZwierzecia) {
        this.nazwaZwierzecia = nazwaZwierzecia;
    }

    public double getTemperaturaMinimalna() {
        return temperaturaMinimalna;
    }

    public void setTemperaturaMinimalna(double temperaturaMinimalna) {
        this.temperaturaMinimalna = temperaturaMinimalna;
    }

    public double getTemperaturaMaksymalna() {
        return temperaturaMaksymalna;
    }

    public void setTemperaturaMaksymalna(double temperaturaMaksymalna) {
        this.temperaturaMaksymalna = temperaturaMaksymalna;
    }

    @Override
    public String toString() {
        return "Zmiennocieplne: " +
                "nazwa zwierzęcia: " + nazwaZwierzecia + '\'' +
                super.toString()+'\''+ ", temperatura maksymalna: " + temperaturaMaksymalna;
    }

    @Override
    public void podajTemperature() {
        super.setTemperatura(temperaturaMinimalna);
    }


}
