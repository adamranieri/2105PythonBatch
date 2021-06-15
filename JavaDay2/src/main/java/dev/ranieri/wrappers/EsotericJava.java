package dev.ranieri.wrappers;

public class EsotericJava {

    public static void main(String[] args) {

        // Java has an Integer Pool for values LESS THAN a byte
        Integer i = 128;
        Integer j = 128;
        System.out.println(i == j);
    }
}
