package lab1;

public class NewMain {

    public static void main(String[] args) {

        /*
        System.out.println("Hello world");

        int pierwszaZmienna;
        double drugaZmienna;


        Scanner pierwszyObiekt = new Scanner(System.in);

        pierwszaZmienna = pierwszyObiekt.nextInt();
        drugaZmienna = pierwszyObiekt.nextDouble();

        System.out.println(pierwszaZmienna+drugaZmienna);

        System.out.println("Suma wynosi: " + (pierwszaZmienna+drugaZmienna));


        System.out.println("Suma wynosi: " + sumaDwochZmiennych(pierwszaZmienna,drugaZmienna));

        System.out.println("Suma wynosi: " + sumaZmiennych2(pierwszaZmienna,drugaZmienna));

        NewMain ob = new NewMain();

        System.out.println("Suma wynosi: " + ob.sumaZmiennychBezStatic());

        Wprowadzenie do języka obiektowego JAVA

        */



        /* ZADANIE 2.1 i 2.2

        Scanner obiektZadanie1 = new Scanner(System.in);
        int zmienna1Zadanie1;
        int zmienna2Zadanie1;

        System.out.println("Wprowadz zmienne zatwierdzając je po kolei klawiszem enter: ");

        zmienna1Zadanie1 = obiektZadanie1.nextInt();
        zmienna2Zadanie1 = obiektZadanie1.nextInt();


        System.out.println("Suma wynosi: " + sumaZmiennychCalkowitych(zmienna1Zadanie1,zmienna2Zadanie1));
        System.out.println("Roznica wynosi: "+ roznicaZmiennychCalkowitych(zmienna1Zadanie1,zmienna2Zadanie1));
        System.out.println("Iloczyn wynosi: "+ iloczynZmiennychCalkowitych(zmienna1Zadanie1,zmienna2Zadanie1));
        System.out.println("Iloraz wynosi: "+ ilorazZmiennychCalkowitych(zmienna1Zadanie1,zmienna2Zadanie1));
        */

        /*

        ZADANIE 2.3 i 2.4

        Scanner obiektZadanie3 = new Scanner(System.in);

        double zmienna1Zadanie3;
        double zmienna2Zadanie3;


        System.out.println("Wprowadz zmienne zatwierdzając je po kolei klawiszem enter: ");

        zmienna1Zadanie3 = obiektZadanie3.nextDouble();
        zmienna2Zadanie3 = obiektZadanie3.nextDouble();

        System.out.println("Suma wynosi: " + sumaZmiennychRzeczywistych(zmienna1Zadanie3,zmienna2Zadanie3));
        System.out.println("Roznica wynosi: "+ roznicaZmiennychRzeczywistych(zmienna1Zadanie3,zmienna2Zadanie3));
        System.out.println("Iloczyn wynosi: "+ iloczynZmiennychRzeczywistych(zmienna1Zadanie3,zmienna2Zadanie3));
        System.out.println("Iloraz wynosi: "+ ilorazZmiennychRzeczywistych(zmienna1Zadanie3,zmienna2Zadanie3));
        */

        /*

        ZADANIE 2.5. i 2.6


    Scanner obiektZadanie5 = new Scanner(System.in);

    System.out.println("Wprowadz zmienną zatwierdzając enterem: ");

    double x;

    x = obiektZadanie5.nextDouble();

    System.out.println("Wartość pierwszego równania wynosi: " + (x+(1/x)));
    System.out.println("Wartość drugiego równania wynosi: " + (java.lang.Math.sin(2*x)+(java.lang.Math.cos(x))*java.lang.Math.cos(x)));
    System.out.println("Wartość trzeciego równania wynosi: "+ java.lang.Math.sqrt((x*x)+(3*x)-8));
    System.out.println("Wartośc bezwzględna dla zmiennej x wynosi: " + java.lang.Math.abs(x));
    System.out.println("Część całkowita z dzielenia wartości bezwzględnej przez 2 wynosi: "+java.lang.Math.floorDiv((long) Math.abs(x),2));
    System.out.println("Reszta z dzielenia liczby przez 5 wynosi: " + java.lang.Math.floorMod((long) Math.abs(x),5));
    */
        double a = 3.0;
        double b = 4.0;
        double c = 32.0;

        System.out.println("Wynik: " + rownanieKwadratowe(a,b,c));
    }
    /*
    /**
     *
     * @param a zmienna a
     * @param b zmienna b
     * @return zwraca sumę dwóch zmiennych


    public static int sumaDwochZmiennych(int a, double b)
    {
      return a+(int)b;
    };

    /**
     *
     * @param a zmienna a
     * @param b zmienna b
     * @return zwraca sumę dwóch zmiennych

    public int sumaZmiennychBezStatic(int a, double b)
    {
        return a+(int)b;
    };

    public static double sumaZmiennych2(int c, double d)
    {
        return c+d;
    };

    Metody utworzone dla wprowadzenia

     */
/*
    public static int sumaZmiennychCalkowitych(int a, int b)
    {
        return a+b;
    };
    public static int roznicaZmiennychCalkowitych(int a, int b)
    {
        return a-b;
    };
    public static int iloczynZmiennychCalkowitych(int a, int b)
    {
        return a*b;
    };
    public static int ilorazZmiennychCalkowitych(int a, int b)
    {
        if (b!=0)
            return a/b;
        else
           return 0;
    };
    public static double sumaZmiennychRzeczywistych(double a, double b)
    {
        return a+b;
    };
    public static double roznicaZmiennychRzeczywistych(double a, double b)
    {
        return a-b;
    };
    public static double iloczynZmiennychRzeczywistych(double a, double b)
    {
        return a*b;
    };
    public static double ilorazZmiennychRzeczywistych(double a, double b)
    {
        if (b!=0.0)
            return a/b;
        else
            return 0;
    };

 */
    public static double rownanieKwadratowe(double a, double b, double c)
    {
        if(a!=0) {
            double delta = (b * b) - 4 * a * c;
            double x1 = (((-1) * b) - Math.sqrt(delta)) / 2 * a;
            double x2 = (((-1) * b) + Math.sqrt(delta)) / 2 * a;
            return x1, x2;
        }
        else
        {
            double x0 = c/b;
            return x0;
        }
    }
}
