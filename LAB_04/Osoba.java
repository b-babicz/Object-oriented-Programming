package com.company;

public class Osoba {

    private String imie;
    private String nazwisko;
    private String dataUrodzenia;
    private String plec;

    public Osoba(String imie, String nazwisko, String dataUrodzenia, String plec)
    {
        this.nazwisko = nazwisko;
        this.imie = imie;
        this.dataUrodzenia = dataUrodzenia;
        this.plec = plec;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(String dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    public String toString() {
        return "Osoba: " +
                "Imię:'" + this.imie + '\'' +
                ", nazwisko: '" + this.nazwisko + '\'' +
                ", data urodzenia: '" + this.dataUrodzenia + '\'' +
                ", płeć:'" + this.plec + '\'';
    }
}
