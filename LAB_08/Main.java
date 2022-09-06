import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {


        ArrayList<Integer> lis = new ArrayList<>();
        lis.add(3);
        lis.add(4);
        lis.add(7);
        lis.add(19);

        //traktowanie ArrayList jako grupy elementów [x,y,z,c]
        System.out.println(lis);

        System.out.println("---------------------------------------------");

        // wypisywanie po kolei elementów ArrayList 3 \n 4\n 7\n 19
        Iterator<Integer> it = lis.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println("---------------------------------------------");


        System.out.println(Collections.binarySearch(lis, 7));
        System.out.println(Collections.binarySearch(lis, 18));

        System.out.println("---------------------------------------------");





    }
}
