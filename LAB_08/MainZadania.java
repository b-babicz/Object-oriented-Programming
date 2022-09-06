import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class MainZadania {

    public static void main(String[] args) {

        Osoba o1 = new Osoba("Tomek","Tester",25,184,84.5);

        ArrayList<Osoba> lista = new ArrayList<>();
        lista.add(o1);
        lista.add(new Osoba("Henryk","Haker",32,176,78));
        lista.add(new Osoba("Kaja","Kowalska",22,175,53.1));
        lista.add(new Osoba("Natalia","Nowak",19,210,54));

        Iterator<Osoba> it = lista.iterator();

        String nazwis = "Tester";
        int wie = 22;
        int wzros = 210;
        double wag = 84.5;

        System.out.println("-----------------------------------------------------------");

        System.out.println("Początek wyszukiwania po zadanym kryterium");
        System.out.println("-----------------------------------------------------------");

        System.out.println("Wyszukiwanie po nazwisku: ");
        while(it.hasNext())
        {
            Osoba o = it.next();
            if(o.getNazwisko().equals(nazwis))
                System.out.println(o);

        }
        it = lista.iterator();
        System.out.println("Wyszukiwanie po wieku: ");
        while(it.hasNext())
        {
            Osoba op1 = it.next();
            if(op1.getWiek() == wie)
                System.out.println(op1);

        }
        it = lista.iterator();
        System.out.println("Wyszukiwanie po wzroście: ");
        while(it.hasNext())
        {
            Osoba op2 = it.next();
            if(op2.getWzrost() == wzros)
                System.out.println(op2);

        }
        it = lista.iterator();
        System.out.println("Wyszukiwanie po wadze: ");
        while(it.hasNext())
        {
            Osoba op3 = it.next();
            if(op3.getWaga()==wag)
                System.out.println(op3);

        }

        System.out.println("----------------------------------------------");
        System.out.println("Koniec wyszukiwania po zadanym kryterium");

        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");

        System.out.println("Wyszukiwanie cech najstarszy-najmłodszy, najwyższy-najniższy, najcięższy-najlżejszy");
        System.out.println("----------------------------------------------");

        System.out.println("Wyszukiwanie osoby najstarszej: ");
        System.out.println(Collections.max(lista, new Comparator<Osoba>() {
            @Override
            public int compare(Osoba t1, Osoba t2) {
                return t1.getWiek() - t2.getWiek();
            }
        }));

        System.out.println("Wyszukiwanie osoby najmłodszej: ");
        System.out.println(Collections.max(lista, new Comparator<Osoba>() {
            @Override
            public int compare(Osoba t1, Osoba t2) {
                return t2.getWiek() - t1.getWiek();
            }
        }));

        System.out.println("Wyszukiwanie osoby najwyższej: ");
        System.out.println(Collections.max(lista, new Comparator<Osoba>() {
            @Override
            public int compare(Osoba t1, Osoba t2) {
                return t1.getWzrost() - t2.getWzrost();
            }
        }));
        System.out.println("Wyszukiwanie osoby najniższej: ");
        System.out.println(Collections.max(lista, new Comparator<Osoba>() {
            @Override
            public int compare(Osoba t1, Osoba t2) {
                return t2.getWzrost() - t1.getWzrost();
            }
        }));
        System.out.println("Wyszukiwanie osoby najcięższej: ");
        System.out.println(Collections.max(lista, new Comparator<Osoba>() {
            @Override
            public int compare(Osoba t1, Osoba t2) {
                return (int) (t1.getWaga() - t2.getWaga());
            }
        }));
        System.out.println("Wyszukiwanie osoby najlżejszej: ");
        System.out.println(Collections.max(lista, new Comparator<Osoba>() {
            @Override
            public int compare(Osoba t1, Osoba t2) {
                return (int) (t2.getWaga() - t1.getWaga());
            }
        }));

        System.out.println("------------------------------------------------------");
        System.out.println("Koniec wyszukiwania par cech");
        System.out.println("------------------------------------------------------");
        System.out.println("------------------------------------------------------");

        System.out.println("Wygląd ArrayList przed sortowaniem: ");
        System.out.println("------------------------------------------------------");
        it = lista.iterator();

        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println("-------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Wygląd ArrayList po poszczególnych sortowaniach: ");
        System.out.println("-------------------------------------------------------------------");


        Collections.sort(lista, new Comparator<Osoba>() {
            @Override
            public int compare(Osoba t1, Osoba t2) {
                return t1.getWiek() - t2.getWiek();
            }
        });

        System.out.println("Po posortowaniu po wieku: ");
        it = lista.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }


        Collections.sort(lista, new Comparator<Osoba>() {
            @Override
            public int compare(Osoba t1, Osoba t2) {
                return t1.getWzrost()-t2.getWzrost();
            }
        });

        System.out.println("Po posortowaniu po wzroście: ");
        it = lista.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        Collections.sort(lista, new Comparator<Osoba>() {
            @Override
            public int compare(Osoba t1, Osoba t2) {
                return (int) (t1.getWaga()-t2.getWaga());
            }
        });

        System.out.println("Po posortowaniu po wadze: ");
        it = lista.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println("-------------------------------------------------------------------");



    }

}
