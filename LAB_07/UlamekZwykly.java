package matematyka;

public class UlamekZwykly {

    static int licznik;
    static int mianownik;
    static int ileUlamkow;
    static final char rozdzielaczUlamka = '/';

    public UlamekZwykly(int licznik, int mianownik, int ileUlamkow) {
        this.licznik = licznik;
        this.mianownik = mianownik;
        this.ileUlamkow = ileUlamkow;
    }
    public UlamekZwykly(int licznik, int mianownik) {
        this.licznik = licznik;
        this.mianownik = mianownik;
        }

    //public String toString() {

        //for(int i=1; i<ileUlamkow+1;i++)
      //  {return "UlamekZwykly: " + licznik + rozdzielaczUlamka + mianownik + " "+ileUlamkow;}
    //}

public static class UlamekDziesietny{

        static float ulamekReprezentacja;
        static int a;
        static int b;

    public UlamekDziesietny(int a, int b) {
    this.a=a;
    this.b=b;
    }

    public static float wyznaczanieUlamka(int a, int b)
        {
            ulamekReprezentacja = (a/b);
            return ulamekReprezentacja;
        }

    public String toString() {

        return "UlamekDziesietny: "+ulamekReprezentacja;
    }
}



}
