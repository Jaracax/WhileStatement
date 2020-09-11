package com.company;

public class Main {

    public static void main(String[] args) {
//
//        int count = 1;
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//        for (int i = 1; i < 7; i++){
//            System.out.println("Count value is " + i);
//        }
//          Create a method isEvenNumber that takes a parameter of type int
//          It's purpose is to determinate if the argument passed to the method
//          is an even number or not.
//          return true if an even number, otherwise return false.
//
//          Modify the while code below
//          Make it also record the total number of even numbers it has found
//          and break once 5 are found
//          and at the end, display the total number of even numbers found

        int number = 4;
        int finishNumber = 20;
        int count = 0;
        while (number <= finishNumber){
            number++;
            if (!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
            count++;
            if (count >= 5){
                break;
            }
        }
        System.out.println("Total of even numbers are " + count);
    }
    public static boolean isEvenNumber(int number){
        if (number % 2 == 0){
            return true;
        }
        else
            return false;
    }
}
