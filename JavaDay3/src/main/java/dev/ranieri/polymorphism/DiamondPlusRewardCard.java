package dev.ranieri.polymorphism;

// All the functionalitu of a the reward PLUS any methods provided by the interface
public class DiamondPlusRewardCard extends RewardCard implements Expandable, Freezable{

    boolean isFrozen = false;

    public DiamondPlusRewardCard(String owner, double balance, double creditLimit, int rewardPoints) {
        super(owner, balance, creditLimit, rewardPoints);
    }

    @Override
    public void expandCreditLimit(double amount) {
        this.creditLimit += amount;
        System.out.println("expanded credit limit");
    }

    @Override
    void makePurchase(double amount){
        if(isFrozen){
            System.out.println("Card is frozen cannot make purchase");
        }else{
            super.makePurchase(amount);// calls the parent implentation
        }
    }

    @Override
    public void freeze() {
        this.isFrozen = true;
    }

    @Override
    public void unfreeze() {
        this.isFrozen = false;
    }
}
