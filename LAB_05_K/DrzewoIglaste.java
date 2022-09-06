package com.company;

public class DrzewoIglaste extends Drzewo{
    private int iloscIgiel;
    private double dlugoscSzyski;

    public DrzewoIglaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int iloscIgiel, double dlugoscSzyski) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.iloscIgiel = iloscIgiel;
        this.dlugoscSzyski = dlugoscSzyski;
    }

    @Override
    public String toString()
    {
        return super.toString() + '\'' + ", ilość igieł: " + iloscIgiel + '\'' + ", długość szyszki: " + dlugoscSzyski;
    }
}
