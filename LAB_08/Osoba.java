public class Osoba {

    private String imie;
    private String nazwisko;
    private int wiek;
    private int wzrost;
    private double waga;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getWzrost() {
        return wzrost;
    }

    public void setWzrost(int wzrost) {
        this.wzrost = wzrost;
    }

    public double getWaga() {
        return waga;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }

    public Osoba(String imie, String nazwisko, int wiek, int wzrost, double waga) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.wzrost = wzrost;
        this.waga = waga;
    }

    public String toString() {
        return "Osoba: " +
                "imię:" + imie + '\'' +
                ", nazwisko: " + nazwisko + '\'' +
                ", wiek: " + wiek +
                ", wzrost: " + wzrost +
                ", waga: " + waga;
    }
}
