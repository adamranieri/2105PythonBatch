package dev.ranieri.colllectionsframework;

// Interfaces add methods which abilites to a class
// Comparable interface provided a method stub that you must implement
// tell Java how to sort this class in a collection
public class Player implements Comparable<Player> {
    String name;
    int age;
    int height;

    public Player(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    @Override // this instance vs another instance of this class
    // if this instance is "smaller" return -1
    // if this instance is "larger" return 1
    // if same return 0
    public int compareTo(Player player) {
        if(this.age< player.age){
            return -1;
        }
        if(this.age> player.age){
            return  1;
        }
        return 0;
    }
}
