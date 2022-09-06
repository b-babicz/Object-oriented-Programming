public class ListaPlac {

    private String nazwisko;
    private int placaPracownika;

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getPlacaPracownika() {
        return placaPracownika;
    }

    public void setPlacaPracownika(int placaPracownika) {
        this.placaPracownika = placaPracownika;
    }

    public ListaPlac(String nazwisko, int placaPracownika) {
        this.nazwisko = nazwisko;
        this.placaPracownika = placaPracownika;
    }

    @Override
    public String toString() {
        return "ListaPlac: " +
                "nazwisko: '" + nazwisko + '\'' +
                ", placaPracownika: " + placaPracownika +
                '}';
    }
}
