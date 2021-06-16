package dev.ranieri.polymorphism;

public class RewardCard extends CreditCard{
    // the owner, balance, creditLimit are all inherited and usable even though they are not seen visibliy in the source code

    int rewardPoints;

    public RewardCard(String owner, double balance, double creditLimit, int rewardPoints) {
        super(owner, balance, creditLimit);
        this.rewardPoints = rewardPoints;
    }

    @Override // an overridden method re implements a method in the parent class
    void makePurchase(double amount){
        if((amount+this.balance) < creditLimit){
            this.balance += amount;
            this.rewardPoints += Math.floor(amount*0.01);
        }else{
            System.out.println("Credit Limit Exceeded");
        }
    }

    void showRewardPoints(){
        System.out.println("Your current reward points are " + this.rewardPoints);
    }

    @Override
    public String toString() {
        return "RewardCard{" +
                "owner='" + owner + '\'' +
                ", balance=" + balance +
                ", creditLimit=" + creditLimit +
                ", rewardPoints=" + rewardPoints +
                '}';
    }
}
