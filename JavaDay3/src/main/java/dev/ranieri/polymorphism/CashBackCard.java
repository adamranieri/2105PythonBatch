package dev.ranieri.polymorphism;

public class CashBackCard extends CreditCard {

    public CashBackCard(String owner, double balance, double creditLimit) {
        super(owner, balance, creditLimit);
    }

    @Override
    void makePurchase(double amount){
        if((this.balance + amount)< this.creditLimit){
            this.balance += amount;
            this.balance -= amount*0.01;// give 1% cash back
        }else{
            System.out.println("Insufficient Credit");
        }

    }

    @Override
    public String toString() {
        return "CashBackCard{" +
                "owner='" + owner + '\'' +
                ", balance=" + balance +
                ", creditLimit=" + creditLimit +
                '}';
    }
}
