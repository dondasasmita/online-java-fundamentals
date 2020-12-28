package labs_examples.generics.labs;

import videos_source_code.arrays.ArrayLists;

import java.lang.reflect.Array;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */

//  Create a generic class called Generic

//  Inside generic, create a method called printArray()
//  printArray must print the contents of an array that receives as a parameter

class GenericSample<T> {

    private T array;

    GenericSample(T element) {
        this.array = element;
    }

    public void printArray() {
        System.out.println(this.array);
    }

}

class Exercise {

    public static void main(String args[]) {

        String[] students = {"Donda", "Jopaz"};

        GenericSample<Array> generic = new GenericSample(students);
        generic.printArray();

    }


}