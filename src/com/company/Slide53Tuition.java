package com.company;

public class Slide53Tuition {
    public static void main(String[] args ){
        double tuition =10000;
        int year =0;
        while(tuition<20000){
            tuition= tuition*1.07;
            year++;
            System.out.printf("The tuition in "+year +" years is " + "%.2f\n",tuition);

        }
        System.out.println("Tuition will be doubled in "+year+" years");
        System.out.printf("Tuition will be $%.2f in %1d years",tuition,year);
    }






}




