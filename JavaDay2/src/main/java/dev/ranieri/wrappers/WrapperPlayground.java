package dev.ranieri.wrappers;

public class WrapperPlayground {

    public static void main(String[] args) {
        // Wrapper classes are object version of primitives

        Integer i = 100;
        Character c = 'c';
        Double d = 1000.675;

        int j = 100;
        int k = 9;

        WrapperPlayground.multiply(j,k);// Autoboxing. A primtive will be turned into the wrapper
        WrapperPlayground.printChar(c); // Unboxing. A wrapper class can be turned into the primitive
        String value = String.valueOf(i);// Unboxing

    }

    public static Integer multiply(Integer num1, Integer num2){
        return  num1 * num2;
    }

    public static void printChar(char c){
        System.out.println(c);
    }

}
