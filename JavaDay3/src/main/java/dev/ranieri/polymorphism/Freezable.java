package dev.ranieri.polymorphism;

public interface Freezable {
    /**
     * Makes a card unable to make Purchase
     * */
   void freeze();

    /**
     * Makes a card able to make Purchase
     * */
   void unfreeze();
}
