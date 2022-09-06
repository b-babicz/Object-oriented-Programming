package com.company;

public class Ksiazka implements Wypisywanie{

    private String tytul;
    private String wydawnictwo;
    private int rokWydania;

    public Ksiazka(String tytul, String wydawnictwo, int rokWydania) {
        this.tytul = tytul;
        this.wydawnictwo = wydawnictwo;
        this.rokWydania = rokWydania;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getWydawnictwo() {
        return wydawnictwo;
    }

    public void setWydawnictwo(String wydawnictwo) {
        this.wydawnictwo = wydawnictwo;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }

    @Override
    public void pole() {
        System.out.println("wydawnictwo: " + this.wydawnictwo + ", rok wydania: " + this.rokWydania);
    }

    @Override
    public void poleNazwa() {
        System.out.println("Tytuł: " + this.tytul + ", wydawnictwo: " + this.wydawnictwo + ", rok wydania: " + this.rokWydania);
    }
}
