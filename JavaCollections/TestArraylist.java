package JavaCollections;
import java.util.*;


public class TestArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();


        //Add element operation
        list.add(1);
        list.add(2);
        list.add(3);

//        System.out.println(list);
//
//        //Get element operation
//
//        int element = list.get(2);
//
//        System.out.println(element);
//
//        // remove element operation
//
//        System.out.println(list.remove(1));
//
//        System.out.println(list);

        // Set element operation
        for(int i = 0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println();
    }

}
