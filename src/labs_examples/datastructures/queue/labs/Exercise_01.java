package labs_examples.datastructures.queue.labs;

import java.util.PriorityQueue;

/**
 *      Demonstrate your mastery of Java's (sun's) built-in Queue class (as seen in the import statement
 *      above) by completing the following:
 *
 *      1) instantiate a new Queue
 *      2) demonstrate the use of EVERY method in the Queue class - there are 7
 */

class Queue01 {
    public static void main(String[] args) {

        PriorityQueue<String> students = new PriorityQueue<>();

        students.add("Ryan");
        students.add("Martin");
        students.add("Donda");


        System.out.println(students.element());

        String out = students.remove();
        System.out.println("This student is out : " + out);

        System.out.println(students.element());

        printAllElements(students);

        System.out.println(students.size());

        if (students.contains("Donda")) {
            System.out.println("Donda exists");
        } else {
            students.offer("Donda");
        }

        printAllElements(students);

    }

    public static void printAllElements(PriorityQueue<String> queue) {
        for(String word : queue) {
            System.out.println(word);
        }
    }
}
