package com.company;


public class Main {

    public static void main(String[] args) {

        System.out.println("Zadanie 1 - suma i ilość liczb parzystych i nieparzystych");
        System.out.println(sumaParzyste());
        System.out.println(zliczanieParzyste());
        System.out.println(sumaNieparzyste());
        System.out.println(zliczanieNieparzyste());
        System.out.println("----------------------------------------------------------------");

        /*System.out.println("Zadanie 2 - zmiana liter NA ODWROTNĄ WIELKOŚĆ");
        char[] napis = new char[13];
        napis[0]= 'P';
        napis[1]= 'R';
        napis[2]= 'O';
        napis[3]= 'G';
        napis[4]= 'R';
        napis[5]= 'A';
        napis[6]= 'm';
        napis[7]= 'o';
        napis[8]= 'w';
        napis[9]= 'a';
        napis[10]= 'n';
        napis[11]= 'i';
        napis[12]= 'e';

        for (int i =0; i<13;i++)
        {
            if(napis[i]=="ABCDEFGHIJKLMNOPQRSTUVWXYZ")
                napis[i].UppertoLower;
            else
                napis[i].LowertoApper;
        }*/


        System.out.println("----------------------------------------------------------------");

        Student student1 = new Student("Jan");
        Student student2 = new Student("Andrzej","Nowak");
        Student student3 = new Student("Antoni","Kowalski","inżynieria materiałowa");
        Student student4 = new Student("Marian","Marecki","Informatyka w biznesie",587654);

        System.out.println("Zadanie 4 - student");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println("----------------------------------------------------------------");

        System.out.println("Zadanie 5 - las");
        Drzewo[] las = new Drzewo[6];

        las[0] = new DrzewoIglaste(true,250,"jasnobrązowy",2500,5.8);
        las[1] = new DrzewoIglaste(true,247,"ciemnobrązowy",2574,3.8);
        las[2] = new DrzewoLisciaste(false,240,"2.5 metra",4);
        las[3] = new DrzewoOwocowe(false,187,"2.22 metra",3,"Morela");
        las[4] = new DrzewoOwocowe(false,195,"2.57 metra",8,"śliwka");
        las[5] = new DrzewoLisciaste(false,187,"2.56 metra",5);

        System.out.println("Sosna " + las[0]);
        System.out.println("Modrzew " + las[1]);
        System.out.println("Dąb " + las[2]);
        System.out.println("Morelowiec " + las[3]);
        System.out.println("Śliwa " + las[4]);
        System.out.println("Osik " + las[5]);



    }
    public static int zliczanieParzyste()
    {
        int iloscparzystych=0;
         for(int i=10;i<=20;i++)
        {
            if(i%2==0)
            {
                iloscparzystych++;
            }
            else
            {
                iloscparzystych = iloscparzystych;
            }
        }
        return iloscparzystych;
    }
    public static int zliczanieNieparzyste() {
        int iloscnieparzystych = 0;
        for (int i = 10; i <= 20; i++) {
            if (i % 2 != 0) {
                iloscnieparzystych++;
            } else {
                iloscnieparzystych = iloscnieparzystych;
            }
        }
        return iloscnieparzystych;
    }
    public static int sumaParzyste()
        {
            int sumaparzystych=0;
            for(int i=10;i<=20;i++)
            {
                if(i%2==0)
                {
                    sumaparzystych=sumaparzystych+i;
                }
                else
                {
                    sumaparzystych=sumaparzystych;
                }
            }
            return sumaparzystych;
        }
    public static int sumaNieparzyste()
    {
        int sumanieparzystych=0;
        for(int i=10;i<=20;i++)
        {
            if(i%2!=0)
            {
                sumanieparzystych=sumanieparzystych+i;
            }
            else
            {
                sumanieparzystych=sumanieparzystych;
            }
        }
        return sumanieparzystych;
    }
}
