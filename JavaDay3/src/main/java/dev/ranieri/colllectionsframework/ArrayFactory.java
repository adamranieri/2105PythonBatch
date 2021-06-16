package dev.ranieri.colllectionsframework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayFactory {

    // Factory Design pattern.
    // A method that returns an IMPLEMENTATION of an interface based on certain inputs
    // Often a developer does not need to know or care what the implementation is just that methods are supported
    /** insert a 1 for a list that optimizes read efficiency. insert anything else for a list that optimizes write efficiency */
    static List createList(int choice){
        if(choice == 1){
            return new ArrayList();
        }else {
            return new LinkedList();
        }

    }
}
