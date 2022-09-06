package com.company;

public class Wykladowca extends Osoba {
    private String tytulNaukowy;
    private String kolegium;
    private String instytut;
    private String wykladanyPrzedmiotGlowny;
    private int liczbaWykladanychPrzedmiotow;
    private String glownaUczelniaZatrudnienia;
    private int iloscPozostalychUczelniZatrudniajacych;

    public Wykladowca(String imie, String nazwisko, String dataUrodzenia, String plec, String tytulNaukowy, String kolegium, String instytut, String wykladanyPrzedmiotGlowny, int liczbaWykladanychPrzedmiotow, String glownaUczelniaZatrudnienia, int iloscPozostalychUczelniZatrudniajacych)
    {
        super(imie,nazwisko,dataUrodzenia,plec);
        this.tytulNaukowy = tytulNaukowy;
        this.kolegium = kolegium;
        this.instytut = instytut;
        this.wykladanyPrzedmiotGlowny = wykladanyPrzedmiotGlowny;
        this.liczbaWykladanychPrzedmiotow = liczbaWykladanychPrzedmiotow;
        this.glownaUczelniaZatrudnienia = glownaUczelniaZatrudnienia;
        this.iloscPozostalychUczelniZatrudniajacych = iloscPozostalychUczelniZatrudniajacych;

    }

    public String getTytulNaukowy() {
        return tytulNaukowy;
    }

    public void setTytulNaukowy(String tytulNaukowy) {
        this.tytulNaukowy = tytulNaukowy;
    }

    public String getKolegium() {
        return kolegium;
    }

    public void setKolegium(String kolegium) {
        this.kolegium = kolegium;
    }

    public String getInstytut() {
        return instytut;
    }

    public void setInstytut(String instytut) {
        this.instytut = instytut;
    }

    public String getWykladanyPrzedmiotGlowny() {
        return wykladanyPrzedmiotGlowny;
    }

    public void setWykladanyPrzedmiotGlowny(String wykladanyPrzedmiotGlowny) {
        this.wykladanyPrzedmiotGlowny = wykladanyPrzedmiotGlowny;
    }

    public int getLiczbaWykladanychPrzedmiotow() {
        return liczbaWykladanychPrzedmiotow;
    }

    public void setLiczbaWykladanychPrzedmiotow(int liczbaWykladanychPrzedmiotow) {
        this.liczbaWykladanychPrzedmiotow = liczbaWykladanychPrzedmiotow;
    }

    public String getGlownaUczelniaZatrudnienia() {
        return glownaUczelniaZatrudnienia;
    }

    public void setGlownaUczelniaZatrudnienia(String glownaUczelniaZatrudnienia) {
        this.glownaUczelniaZatrudnienia = glownaUczelniaZatrudnienia;
    }

    public int getIloscPozostalychUczelniZatrudniajacych() {
        return iloscPozostalychUczelniZatrudniajacych;
    }

    public void setIloscPozostalychUczelniZatrudniajacych(int iloscPozostalychUczelniZatrudniajacych) {
        this.iloscPozostalychUczelniZatrudniajacych = iloscPozostalychUczelniZatrudniajacych;
    }

    @Override
    public String toString() {
        return super.toString() +", tytuł naukowy: " + this.tytulNaukowy + '\''+ ", nazwa kolegium: " + this.kolegium + '\'' + ", nazwa instytutu: " + this.instytut + '\'' + ", główny przedmiot wykładany: " + this.wykladanyPrzedmiotGlowny + '\'' + ", ilość przedmiotów wykładanych: " + this.liczbaWykladanychPrzedmiotow + '\'' + ", główna uczelnia zatrudniająca: " + this.glownaUczelniaZatrudnienia + '\'' + ", liczba pozostałych uczelni zatrudniających: " + this.iloscPozostalychUczelniZatrudniajacych;
    }
}
