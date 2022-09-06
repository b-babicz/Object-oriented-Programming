package com.company;

public class Ksiegozbior
{

    private String tytul;
    private String autor;
    private int liczbaStron;
    private int rokWydania;
    public double cena;

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getLiczbaStron() {
        return liczbaStron;
    }

    public void setLiczbaStron(int liczbaStron) {
        this.liczbaStron = liczbaStron;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String toString() {
        return "Księgozbiór księgarni: " +
                "Tytuł Książki: " + this.tytul + '\'' +
                ", autor książki: " + this.autor + '\'' +
                ", liczba stron w książce: " + this.liczbaStron +
                ", rok wydania książki: " + this.rokWydania +
                ", cena książki: " + this.cena;
                };
    }

