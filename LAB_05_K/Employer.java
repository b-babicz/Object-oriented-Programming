package com.company;

public class Employer extends Person{

    private String nazwaFirmy;

    public Employer(String imie, String nazwisko, String nazwaFirmy) {
        super(imie, nazwisko);
        this.nazwaFirmy=nazwaFirmy;
    }

    public String getNazwaFirmy() {
        return nazwaFirmy;
    }

    public void setNazwaFirmy(String nazwaFirmy) {
        this.nazwaFirmy = nazwaFirmy;
    }

    @Override
    public String toString() {
        return super.toString() + '\''+", nazwa firmy: "+nazwaFirmy;
    }
}
