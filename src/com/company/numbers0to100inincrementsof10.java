package com.company;

public class numbers0to100inincrementsof10 {

    public static void main(String[] args) {
        //numbers 0-100 in increments of 10
        {
            int number = 1;

            while (number <= 100) {
                if ((number % 10) == 0) {
                    System.out.println(number);
                }
                number++;
            }
            System.out.println("End");
        }
    }
}
