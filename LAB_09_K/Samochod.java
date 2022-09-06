public class Samochod {

    private String marka;
    private String nazwaSamochodu;
    private int maksymalnaPredkosc;
    private int cenaSamochodu;

    private String rodzajSilnika;

    public Samochod(String marka, String nazwaSamochodu, int maksymalnaPredkosc, int cenaSamochodu, String rodzajSilnika) {
        this.marka = marka;
        this.nazwaSamochodu = nazwaSamochodu;
        this.maksymalnaPredkosc = maksymalnaPredkosc;
        this.cenaSamochodu = cenaSamochodu;
        this.rodzajSilnika = rodzajSilnika;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getNazwaSamochodu() {
        return nazwaSamochodu;
    }

    public void setNazwaSamochodu(String nazwaSamochodu) {
        this.nazwaSamochodu = nazwaSamochodu;
    }

    public int getMaksymalnaPredkosc() {
        return maksymalnaPredkosc;
    }

    public void setMaksymalnaPredkosc(int maksymalnaPredkosc) {
        this.maksymalnaPredkosc = maksymalnaPredkosc;
    }

    public int getCenaSamochodu() {
        return cenaSamochodu;
    }

    public void setCenaSamochodu(int cenaSamochodu) {
        this.cenaSamochodu = cenaSamochodu;
    }

    public String getRodzajSilnika() {
        return rodzajSilnika;
    }

    public void setRodzajSilnika(String rodzajSilnika) {
        this.rodzajSilnika = rodzajSilnika;
    }

    @Override
    public String toString() {
        return "Samochod: " +
                "marka: '" + marka + '\'' +
                ", nazwa samochodu: '" + nazwaSamochodu + '\'' +
                ", maksymalna predkość: " + maksymalnaPredkosc +
                ", cena samochodu: " + cenaSamochodu +
                ", rodzaj silnika: '" + rodzajSilnika;
    }
}
