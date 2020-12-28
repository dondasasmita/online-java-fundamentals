package labs_examples.datastructures.linkedlist.labs;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *      LinkedLists - Exercise_01
 *
 *      Demonstrate your mastery of Java's built-in LinkedList class by demonstrating the following:
 *
 *      1) create a LinkedList (from Java's libraries)
 *      2) add()
 *      3) addAll()
 *      4) addFirst()
 *      5) addLast()
 *      6) getFirst()
 *      7) getLast()
 *      8) get()
 *      9) set()
 *      10) push()
 *      11) pop()
 *      12) remove()
 *      13) contains()
 *      14) listIterator()
 *      15) clear()
 */

class LinkedLists01 {

    public static void main(String[] args) {

        LinkedList<Integer> ids = new LinkedList();

        for(int i = 0 ; i < 100 ; i++) {
            ids.add(i);
        }

        ids.addFirst(1001);
        ids.addLast(999);

        Iterator allIds = ids.iterator();

        while(allIds.hasNext()) {
            System.out.println(allIds.next());
        }

        if (ids.contains(999)) {
            System.out.println("My Number is here at index : " + ids.indexOf(999));

        }

        System.out.println(ids.contains(888));


    }

}
