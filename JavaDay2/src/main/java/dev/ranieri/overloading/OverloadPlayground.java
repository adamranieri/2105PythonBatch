package dev.ranieri.overloading;

public class OverloadPlayground {

    public static void main(String[] args) {
        int result1 = OverloadPlayground.add(90,75);
        int result2 = OverloadPlayground.add("75","54");
        System.out.println(result1);
        System.out.println(result2);

        int [] nums = {12,34,65,12,35,10}; // Array literal syntax. This is a fixed size
        System.out.println(OverloadPlayground.add(nums));
        OverloadPlayground.add(90,23,1,32,5,123,12332,123);

    }
    // Java DOES support Overloading methods unlike Python
    // Overloading is when you have a method with the SAME name but different parameters
    // different parameter types or lengths

    // Overloaded
    static int add(int num1, int num2){
        return  num1 + num2;
    }

    // Overloaded
    static int add(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    // For instance a method that takes in two strings turns them into numbers and then adds them
    // Overloaded
    static int add(String word1, String word2){
        int num1 = Integer.parseInt(word1);
        int num2 = Integer.parseInt(word2);
        return num1 + num2;
    }

//    static int add(int [] ray){
//        int sum = 0;
//        // enhanced for loop
//        // Python for i in ray:
//        for(int i : ray){
//            sum += i;
//        }
//        return sum;
//    }

    // Var args syntax *nums in python
    // In Java the inputs turn into an array
    static int add(int... nums){
        int sum = 0;
        // enhanced for loop
        // Python for i in ray:
        for(int i : nums){
            sum += i;
        }
        return sum;

    }

}
