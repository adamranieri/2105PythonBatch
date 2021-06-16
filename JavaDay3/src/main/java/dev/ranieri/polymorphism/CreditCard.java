package dev.ranieri.polymorphism;

// The ONLY thing putting abstract a class does is make it impossible to directly instantiate this class
public abstract class CreditCard {

    String owner;
    // Amount of money charged on the card
    double balance;
    //maximum balance you can have on a credit card
    double creditLimit;

    public CreditCard(String owner, double balance, double creditLimit) {
        this.owner = owner;
        this.balance = balance;
        this.creditLimit = creditLimit;
    }

    //IF and OPTIONALLY you can make abstract methods which are method signatures lacking implementations
    // The child classes have their own implementations of this method.
    // There is NEVER a situation you can construct in your code where you call a method that does not exist
    abstract void makePurchase(double amount);

    @Override
    public String toString() {
        return "CreditCard{" +
                "owner='" + owner + '\'' +
                ", balance=" + balance +
                ", creditLimit=" + creditLimit +
                '}';
    }
}
