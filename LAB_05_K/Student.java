package com.company;

public class Student {
    private String imieStudenta;
    private String nazwiskoStudenta;
    private String nazwaSpecjalnosci;
    private int nrIndeksu;

    public Student (String imieStudenta)
    {
        this.imieStudenta=imieStudenta;
    }
    public Student (String imieStudenta,String nazwiskoStudenta)
    {
        this.imieStudenta=imieStudenta;
        this.nazwiskoStudenta = nazwiskoStudenta;
    }
    public Student (String imieStudenta,String nazwiskoStudenta,String nazwaSpecjalnosci)
    {
        this.imieStudenta=imieStudenta;
        this.nazwiskoStudenta = nazwiskoStudenta;
        this.nazwaSpecjalnosci = nazwaSpecjalnosci;
    }

    public Student(String imieStudenta, String nazwiskoStudenta, String nazwaSpecjalnosci, int nrIndeksu) {
        this.imieStudenta = imieStudenta;
        this.nazwiskoStudenta = nazwiskoStudenta;
        this.nazwaSpecjalnosci = nazwaSpecjalnosci;
        this.nrIndeksu = nrIndeksu;
    }

    public String getImieStudenta() {
        return imieStudenta;
    }

    public void setImieStudenta(String imieStudenta) {
        this.imieStudenta = imieStudenta;
    }

    public String getNazwiskoStudenta() {
        return nazwiskoStudenta;
    }

    public void setNazwiskoStudenta(String nazwiskoStudenta) {
        this.nazwiskoStudenta = nazwiskoStudenta;
    }

    public String getNazwaSpecjalnosci() {
        return nazwaSpecjalnosci;
    }

    public void setNazwaSpecjalnosci(String nazwaSpecjalnosci) {
        this.nazwaSpecjalnosci = nazwaSpecjalnosci;
    }

    public int getNrIndeksu() {
        return nrIndeksu;
    }

    public void setNrIndeksu(int nrIndeksu) {
        this.nrIndeksu = nrIndeksu;
    }

    @Override
    public String toString() {
        return "Student: " +
                "imię studenta:'" + imieStudenta + '\'' +
                ", nazwisko studenta: '" + nazwiskoStudenta + '\'' +
                ", nazwa specjalności: '" + nazwaSpecjalnosci + '\'' +
                ", nr indeksu: " + nrIndeksu;
    }
}
