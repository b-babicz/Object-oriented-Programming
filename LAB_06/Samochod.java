package com.company;

public class Samochod implements Wypisywanie{

    private String marka;
    private int rokProdukcji;
    private String rodzajSilnika;

    public Samochod(String marka, int rokProdukcji, String rodzajSilnika) {
        this.marka = marka;
        this.rokProdukcji = rokProdukcji;
        this.rodzajSilnika = rodzajSilnika;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public String getRodzajSilnika() {
        return rodzajSilnika;
    }

    public void setRodzajSilnika(String rodzajSilnika) {
        this.rodzajSilnika = rodzajSilnika;
    }

    @Override
    public void pole() {
        System.out.println("rok produckji samochodu: " + this.rokProdukcji + ", rodzaj silnika: " + this.rodzajSilnika);
    }

    @Override
    public void poleNazwa() {
        System.out.println("Marka samochodu: " + this.marka + ", rok produckji samochodu: " + this.rokProdukcji + ", rodzaj silnika: " + this.rodzajSilnika);
    }
}
