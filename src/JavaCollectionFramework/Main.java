package JavaCollectionFramework;

import java.util.*;

public class Main {
    public static void main(String[] args) { //This method has a constructor name 
        ArrayList<Integer> list = new ArrayList<>();
        list.add(67);
        list.add(20);
        list.add(78);
        list.add(40);
        list.add(12);
        System.out.println(list);
        list.add(25);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        System.out.println("list.size(): " + list.size());
        System.out.println("--------------------------------");


        //Iterating through the list
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            System.out.println();
        }
        System.out.println("--------------------------------");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("sorted list: " + list);
        Collections.reverse(list);
        System.out.println("reversed list: " + list);
        ArrayList<Integer> clonedList = (ArrayList<Integer>) list.clone();
        System.out.println("cloned list: " + clonedList);

        System.out.println("--------------------------------");
        



        //LinkedList -- collection of nodes, each node contains data and a reference to the next node
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Apple");
        ll.add("Banana");
        ll.add("Mango");
        System.out.println(ll);
        ll.addFirst("Grapes");
        System.out.println(ll);
        ll.addLast("Pineapple");
        System.out.println(ll);   
    }
}
