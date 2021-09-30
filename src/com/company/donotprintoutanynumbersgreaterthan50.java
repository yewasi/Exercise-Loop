package com.company;

public class donotprintoutanynumbersgreaterthan50 {
    public static void main(String[] args) {


        int number = 1;

        while (number < 50) {
            if ((number % 5) == 0) {
                System.out.println(number);
            }
            number++;
        }
        System.out.println("End");
    }
}
