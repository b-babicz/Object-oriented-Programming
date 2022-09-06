package com.company;
import java.lang.Math;

public class DataKlasa {
    private int rok;
    private int miesiac;
    private int dzien;


    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        if (rok < 0) this.rok = (-1) * rok;
        else {
            if (rok == 0) this.rok = 2022;
            else this.rok = rok;
        }
    }

    public int getMiesiac() {
        return miesiac;
    }

    public void setMiesiac(int miesiac) {
        if (miesiac < 0) this.miesiac = (-1) * miesiac;
        else {
            if (miesiac == 0) this.miesiac = 1;
            else this.miesiac = miesiac;
        }
    }

    public int getDzien() {
        return dzien;
    }

    public void setDzien(int dzien) {
        if (dzien<32) {
            if (dzien < 0) this.dzien = (-1) * dzien;
            else {
                if (dzien == 0) this.dzien = 1;
                else this.dzien = dzien;
            }
        }
        else this.dzien=java.lang.Math.abs(31-dzien);
    }

    public String toString() {
        return "DATA: " +
                "ROK: " + rok +
                ", MIESIĄC: " + miesiac +
                ", DZIEŃ: " + dzien;
    }
    public String tydzienWTyl()
    {
        return "DATA oddalona o 7 dni w tył: "+
                "ROK: " + rok +
                ", MIESIĄC: " + miesiac +
                ", DZIEŃ: " + (java.lang.Math.abs(dzien-7));
    }
    public String tydzienWPrzod() {
        return "DATA oddalona o 7 dni w przód: " +
                " ROK: " + rok +
                ", MIESIĄC: " + miesiac +
                ", DZIEŃ: " + (java.lang.Math.abs(dzien+7));
    }
}

