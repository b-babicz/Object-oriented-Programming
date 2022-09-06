package com.company;

public class Student extends Osoba{
    private int nrIndeksu;
    private String typStudiow;
    private String kierunekStudiow;
    private int rokStudiow;

    public Student (String imie, String nazwisko, String dataUrodzenia, String plec, int nrIndeksu, String typStudiow, String kierunekStudiow, int rokStudiow)
    {
        super(imie,nazwisko,dataUrodzenia,plec);
        this.nrIndeksu = nrIndeksu;
        this.typStudiow = typStudiow;
        this.kierunekStudiow = kierunekStudiow;
        this.rokStudiow = rokStudiow;
    }

    public int getNrIndeksu() {
        return nrIndeksu;
    }

    public void setNrIndeksu(int nrIndeksu) {
        this.nrIndeksu = nrIndeksu;
    }

    public String getTypStudiow() {
        return typStudiow;
    }

    public void setTypStudiow(String typStudiow) {
        this.typStudiow = typStudiow;
    }

    public String getKierunekStudiow() {
        return kierunekStudiow;
    }

    public void setKierunekStudiow(String kierunekStudiow) {
        this.kierunekStudiow = kierunekStudiow;
    }

    public int getRokStudiow() {
        return rokStudiow;
    }

    public void setRokStudiow(int rokStudiow) {
        this.rokStudiow = rokStudiow;
    }

    @Override
    public String toString() {
        return super.toString() + ", numer indeksu: " + this.nrIndeksu + '\'' + ", typ studiów: " + this.typStudiow + '\'' + ", kierunek studiów: " + this.kierunekStudiow + '\'' + ", rok studiów: " + this.rokStudiow;
    }
}
