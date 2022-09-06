import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {


        //ZADANIE 1 w odpowiednio nazwanych klasach, interfejsach

        //ZADANIE 2

        System.out.println("--------------------------------Zadanie z bankierem---------------------------");

        UczciwyBankier bankier1 = new UczciwyBankier("Jan");
        PodstepnyBankier bankier2 = new PodstepnyBankier("Ignacy");

        System.out.println("Wynik dla uczciwego bankiera: " + bankier1.getImie());
        System.out.println(bankier1.Licz(3,6));
        System.out.println("Wynik dla nieuczciwego bankiera: " + bankier2.getImie());
        System.out.println(bankier2.Licz(3,6));
        System.out.println("----------------------------------------------------------------------------------------------------");


        //ZADANIE 4


        ArrayList<Samochod> lista = new ArrayList<>();

        lista.add(new Samochod("BMW","x3",210,221000,"Hybrydowy"));
        lista.add(new Samochod("Renault","Clio",180,67900,"Hybrydowy/Benzyna"));
        lista.add(new Samochod("Tesla","model 3",261,244990,"Elektryczny"));
        lista.add(new Samochod("Mercedes","GLC",250,236200,"Hybrydowy"));
        lista.add(new Samochod("Tesla", "Model Y", 265, 256900, "Elektryczny"));


        System.out.println("--------------------------------Wyświetlanie zawartości kolekcji---------------------------");
        Iterator<Samochod> its = lista.iterator();

        while(its.hasNext())
        {
            System.out.println(its.next());
        }

        System.out.println("----------------------------------------------------------------------------------------------------");

        String silnik = "Hybrydowy/Benzyna";

        System.out.println("--------------------------------Wyszukiwanie samochodu o zadanym silniku---------------------------");

        Iterator <Samochod> its2 = lista.iterator();
        while (its2.hasNext())
        {
            Samochod o = its2.next();
            if (o.getRodzajSilnika().equals(silnik)) System.out.println(o);
            else;
        }

        System.out.println("----------------------------------------------------------------------------------------------------");

        System.out.println("--------------------------------Wyszukiwanie samochodu zadanego producenta ---------------------------");

        String wyszukajMarka = "Tesla";

        Iterator <Samochod> its4 = lista.iterator();
        while (its4.hasNext())
        {
            Samochod o = its4.next();
            if (o.getMarka().equals(wyszukajMarka)) System.out.println(o);
            else;
        }
        System.out.println("----------------------------------------------------------------------------------------------------");


        //ZADANIE 3

        ArrayList<ListaPlac> lp = new ArrayList<>();

        lp.add(new ListaPlac("Kowalski",5300));
        lp.add(new ListaPlac("Nowak",4500));
        lp.add(new ListaPlac("Brzęczyszczykiewicz",7500));
        lp.add(new ListaPlac("Jędrzejczyk",7500));
        lp.add(new ListaPlac("Guzik",6200));
        lp.add(new ListaPlac("Kowalczyk",8450));


      Iterator <ListaPlac> it = lp.iterator();

        System.out.println("--------------------------------Wypisywanie informacji o stawce dla każdej osoby---------------------------");
       while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------Wypisywanie informacji o stawce dla osoby o określonym nazwisku---------------------------");

       String nazwis = "Kowalczyk";

       Iterator <ListaPlac> it2 = lp.iterator();
       while(it2.hasNext())
       {
           ListaPlac prac = it2.next();
           if(prac.getNazwisko().equals(nazwis)) System.out.println(prac);
           else;
       }
        System.out.println("----------------------------------------------------------------------------------------------------");


        System.out.println("--------------------------------Wypisywanie informacji o występujących stawkach---------------------------");

        Iterator <ListaPlac> it3 = lp.iterator();
       while(it3.hasNext())
       {
           System.out.println(it3.next().getPlacaPracownika());
       }
        System.out.println("----------------------------------------------------------------------------------------------------");

    }



}
