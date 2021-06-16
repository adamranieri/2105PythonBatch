package dev.ranieri.polymorphism;

public class CreditPlayground {

    public static void main(String[] args) {

//        CreditCard creditCard = new CreditCard("Adam",0,10000);
//        System.out.println(creditCard);
//        creditCard.makePurchase(4000);
//        System.out.println(creditCard);
//        creditCard.makePurchase(7000);
//        System.out.println(creditCard);

//        RewardCard rewardCard = new RewardCard("Mike",0,2000,0);
//        System.out.println(rewardCard);
//        rewardCard.makePurchase(900);
//        System.out.println(rewardCard);
//        rewardCard.makePurchase(1200);
//        System.out.println(rewardCard);

//        CashBackCard cashBackCard = new CashBackCard("Gandalf", 0,1200);
//        cashBackCard.makePurchase(400);
//        cashBackCard.makePurchase(40);
//        cashBackCard.makePurchase(325);
//        System.out.println(cashBackCard);

        // A cashback card, reward card are BOTH credit cards and can be labeled as such in the code
        // The left hand Type of a variable is like a label
        // It does not actually control what the object IS
        // One object many labels. Label says what is/capable of
        CreditCard megaRewards = new RewardCard("larry",0,2000,0);
        // Upcasting is labeling a child object as a Parent. Guaranteed to not throw any errors
        // even labeled as a credit card it will always use the Reward Card make purchase method
        megaRewards.makePurchase(900);
        //megaRewards.showRewardPoints();// Compiler Error. Treated as a credit card. Not all credit card objects Have that method
        System.out.println(megaRewards);

//        RewardCard badIdea = (RewardCard) new CreditCard("McTerrible",0,3000);
//        // downcasting. Labelling a Parent as a child. Want to avoid. Usually a sign of bad code structure
//        // It can give you errors
//        badIdea.showRewardPoints();// This has to fail because the object  isnt a reward card is an a credit card lacking that method
//        // Java will NEVER let you call a method on an object that does not exist. An error will be thrown.

        DiamondPlusRewardCard diamondPlusRewardCard = new DiamondPlusRewardCard("Kim McRich",0,1000,0);
        diamondPlusRewardCard.makePurchase(900);
        diamondPlusRewardCard.makePurchase(700);
        diamondPlusRewardCard.expandCreditLimit(2000);
        diamondPlusRewardCard.makePurchase(500);
        System.out.println(diamondPlusRewardCard);
        diamondPlusRewardCard.freeze();
        diamondPlusRewardCard.makePurchase(100);
        diamondPlusRewardCard.unfreeze();
        diamondPlusRewardCard.makePurchase(100);

        Expandable diamondPlusRewardCard2 = new DiamondPlusRewardCard("Kim McRich",0,1000,0);// valid
        // because a DiamondPlusRewardCard DOES have that interface
        // however your variables can only call methods on that Expandable interface

    }
}
