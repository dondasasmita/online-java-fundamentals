package labs_examples.datastructures.stack.labs;

import java.util.Stack;

/**
 *      Demonstrate your mastery of Java's built-in Stack class by completing the following:
 *
 *      1) instantiate a new Stack
 *      2) demonstrate the use of EVERY method in the Stack class - there are 5
 */


class Stack01 {
    public static void main(String[] args) {
        Stack<String> students = new Stack();


        students.push("Ryan");
        students.push("Martin");
        students.push("Donda");

        Stack<String> outgoingStudents = new Stack();

        outgoingStudents.push(students.pop());

        System.out.println("Students");
        printAllElements(students);

        System.out.println("Outgoing Students");
        printAllElements(outgoingStudents);

    }

    public static void printAllElements(Stack<String> queue) {
        for(String word : queue) {
            System.out.println(word);
        }
    }
}