public class UczciwyBankier extends Bankier{

    public UczciwyBankier(String imie) {
        super(imie);
    }

    @Override
    public float Licz(float a, float b) {
        return a+b;
    }


}
