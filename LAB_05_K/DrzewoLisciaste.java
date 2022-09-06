package com.company;

public class DrzewoLisciaste extends Drzewo{
    private int kształtLiscia;

    public DrzewoLisciaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int kształtLiscia) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.kształtLiscia = kształtLiscia;
    }

    public int getKształtLiscia() {
        return kształtLiscia;
    }

    public void setKształtLiscia(int kształtLiscia) {
        this.kształtLiscia = kształtLiscia;
    }

    @Override
    public String toString() {
        return super.toString() + '\'' + ", kształt liścia: " + kształtLiscia;
    }
}
