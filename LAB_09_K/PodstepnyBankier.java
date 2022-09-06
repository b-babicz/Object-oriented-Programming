public class PodstepnyBankier extends Bankier{

    public PodstepnyBankier(String imie) {
        super(imie);
    }

    @Override
    public float Licz(float a, float b) {
        return (float) ((a+b)*0.8);
    }


}
