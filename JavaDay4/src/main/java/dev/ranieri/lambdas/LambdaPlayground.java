package dev.ranieri.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class LambdaPlayground {

    public static void main(String[] args) {
        // Java is a VERY OOP language.
        // Java 8 added lambdas which allow you to create first order functions
        // a function that is an object!!!!
        // Callback functions are not a possiblity in Java which did NOT previously exist

        List<Integer>  nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);

        // imperative approach
        for(int i : nums){
            System.out.println(i);
        }

        // You have to be very explicit about the type of function you are creating
        // A consumer function is a function that takes in one argument and does NOT return anything
        // the <generic> lets you define what the type of the argument is
        Consumer<Integer> print = i -> {System.out.println(i);};

        nums.forEach(print);

//        List<String> names = new ArrayList<String>();
//        names.forEach(print); error because print lambda takes in strings
//        print.accept(1900); //

        List<Integer> filteredNums =  nums.stream().filter(num -> num <10).collect(Collectors.toList());
        System.out.println(filteredNums);

        Calculate add = (n1, n2) -> { return n1 +n2;};
        // alternate syntax
        // if a lambda is just ONE statement that is a value then it has an implicit return
        Calculate subtract = (n1, n2) -> n1 -n2;

        System.out.println(add.calc(50,70));
        System.out.println(subtract.calc(50,70));


    }
}
