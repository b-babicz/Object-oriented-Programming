package matematyka;

public class LiczbaZespolona {

    static int re;
    static int im;
    static char jednostkaUrojona = 'I';

    public LiczbaZespolona(int re, int im) {
        this.re = re;
        this.im = im;
    }

    public String toString() {
        return "LiczbaZespolona: "+re + " + "+im+jednostkaUrojona;
    }

    public static class Modul
    {
        static double modul;
        static int a;
        static int b;

        public Modul(int a, int b) {
            this.a = a;
            this.b=b;
        }

        static double wyliczanieModulu(int a, int b)
        {
            return modul = java.lang.Math.sqrt(((a*b)+(b*b)));
        }

        public String toString() {
            return "Modul: " + modul;
        }
    }



}
