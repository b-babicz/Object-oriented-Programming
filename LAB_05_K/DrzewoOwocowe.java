package com.company;

public class DrzewoOwocowe extends DrzewoLisciaste{
    private String nazwaOwoca;

    public DrzewoOwocowe(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int kształtLiscia, String nazwaOwoca) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa, kształtLiscia);
        this.nazwaOwoca = nazwaOwoca;
    }

    public String getNazwaOwoca() {
        return nazwaOwoca;
    }

    public void setNazwaOwoca(String nazwaOwoca) {
        this.nazwaOwoca = nazwaOwoca;
    }

    @Override
    public String toString() {
        return super.toString()+'\''+", nazwa owoca: "+nazwaOwoca;
    }
}
