public abstract class Bankier {

    private String imie;

    public Bankier(String imie) {
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public abstract float Licz(float a, float b);



}
