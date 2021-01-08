package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;

class MethodTraining {

    static void multiply(int a , int b) {
        int result = a * b;
        System.out.println(result);
    }

    static void multiply(double a , double b) {
        double result = a * b;
        System.out.println(result);
    }

    static void addTenToEachNum(int a, int b) {
        a += 10;
        System.out.println("First int is " + a);
        b += 10;
        System.out.println("Second int is " + b);
    }

    static void addTenPercent(Bill receipt) {

        int newAmount = receipt.getAmount() + ((receipt.getAmount() * 10) / 100);

        receipt.setAmount(newAmount);

    }

    static void countNumOfConsonants(String word) {

        char[] vowels = {'a','i', 'u', 'e', 'o'};

        char[] letters = word.toCharArray();

        int count = 0;

        for (char letter : letters) {

            boolean isVowel = false;

            for (int i = 0 ; i < vowels.length ; i++) {
                if (letter == vowels[i]) {
                    isVowel = true;
                    break;
                }
            }

            if (!isVowel) {
                count++;
            }
        }

        System.out.println("Total nums of consonants are " + count);

    }

}


class Bill {

    private int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}

class MethodTrainingController {

    public static void main(String[] args) {

        // Demo - Method Overloading
        int num1 = 10;
        int num2 = 10;
        MethodTraining.multiply(num1, num2);

        double num3 = 2.2;
        double num4 = 3.3;
        MethodTraining.multiply(num3, num4);

        // Pass by value
        MethodTraining.addTenToEachNum(num1, num2);

        System.out.println("Value of num 1 is " + num1);
        System.out.println("Value of num 2 is " + num2);

        // Pass by reference

        Bill myDinner = new Bill();
        myDinner.setAmount(88);

        System.out.println("Before tax " + myDinner.getAmount());

        MethodTraining.addTenPercent(myDinner);

        System.out.println("After tax " + myDinner.getAmount());

        // Count all consonants
        MethodTraining.countNumOfConsonants("Hello");



    }
}