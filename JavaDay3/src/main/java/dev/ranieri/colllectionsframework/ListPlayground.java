package dev.ranieri.colllectionsframework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPlayground {

    public static void main(String[] args) {

        List<Object> myList = ArrayFactory.createList(1);
        // ArrayList and LinkedList can do the same things when treated as a List
        // But the implementation is different

        long start = System.nanoTime();
        for(int i =0; i<100_000; i++){
            myList.add(new Object()); // adding 100,000 objects to the END of the list
        }
        long end = System.nanoTime();
        System.out.println("Time to add 100,000 objects to the end " + (end-start)/1000000000.0);

        start = System.nanoTime();
        for(int i =0; i<100_000; i++){
            myList.get(50_000); // get object at middle of list
        }
        end = System.nanoTime();
        System.out.println("Time to get object 100_000 in the middle of the list " + (end-start)/1000000000.0);

        start = System.nanoTime();
        for(int i =0; i<100_000; i++){
            myList.add(1, new Object()); // add to the begining of the list 100_000 times
        }
        end = System.nanoTime();
        System.out.println("Time to add object 100_000 to the beginning of the list " + (end-start)/1000000000.0);


    }
}
