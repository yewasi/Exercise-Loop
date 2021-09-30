package com.company;

public class donotprintoutanynumbersbetween25and75 {

    public static void main(String[] args) {


        for (int i = 0; i <= 100; i++) {
            if (i >= 25 && i <= 75) {

                continue;
            }
            if ((i % 5) == 0) {
                System.out.println(i);
            }
        }
    }
}