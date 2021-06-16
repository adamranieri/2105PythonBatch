package dev.ranieri.colllectionsframework;

import java.util.*;

public class CollectionPlayground {

    public static void main(String[] args) {

        Player lebron = new Player("Lebron",36, 80);
        Player giannis = new Player("Giannis",40,86);
        Player yao = new Player("Yao",40,92);

        // List is an interface. You can NEVER create a list
        // ArrayList is a class that implements List. we can create that
        // <> Generics. They allow us to Specify what belongs in that list. Only Player objects are allowed in this list
        // Unlike Python of JS Lists can be created for a specific type.
        // You should always use Generics
        // 1. Maintain the order of insertion
        // 2. Can contain duplicates
        List<Player> playerList = new ArrayList<Player>();
        playerList.add(lebron);
        playerList.add(giannis);
        playerList.add(yao);
        playerList.add(lebron);
        System.out.println(playerList);

//        for(Player player : playerList){
//            System.out.println(player);
//        }

        // Queue
        // Process elemets FIFO
//        Queue<Player> playerQueue = new LinkedList<Player>();
//        playerQueue.addAll(playerList);
//        System.out.println(playerQueue.peek());
//        playerQueue.remove();
//        System.out.println(playerQueue.peek());
//
        //Set
        // No duplicates
        // Does not maintain the order of insertion
        Set<Player> playerSet = new TreeSet<Player>();
        playerSet.addAll(playerList);
        System.out.println(playerSet);

//        for(Player player : playerSet){
//            System.out.println(player);
//        }

        // You cannot iterate over a map.
        // You get values by using the key
        Map<String,Player> playerMap = new HashMap<String,Player>();
        playerMap.put("The King",lebron);
        playerMap.put("The Greek Freak",giannis);
        playerMap.put("Ming Dynasty", yao);

        Player player = playerMap.get("The King");
        System.out.println(player);

//        for(Player p : playerMap.values()){ // you can get the values in map then iterate over it
//            System.out.println(p);
//        }

        System.out.println(lebron.compareTo(yao));// Yao is older so it should be -1
        System.out.println(lebron.compareTo(giannis));// Lebron is older so it should be 1

        // Some collections will use this comparable method to sort and store your objects
        // TreeSet WILL store objects in the order defined by the comparable
        // If you ever see TREE in the name of a collection. Think SORTED

        // Collections class that is not technially in the collections framework
        // It is just a class with a bunch handy methods for developers working with collections
        Collections.reverse(playerList);

    }
}
