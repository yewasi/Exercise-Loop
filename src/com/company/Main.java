package com.company;

public class Main<random> {

    public static void main(String[] args) {
        //Slide 53 - Tuition
        double tuition =10000;
        int year =0;
        while(tuition<20000) {
            tuition = tuition * 1.07;
        }
            {
                year++;
                System.out.printf("The tuition in " + year + " years is " + "%.2f\n", tuition);

            }
        }
        System.out.println("Tuition will be doubled in "+year+" years");
        System.out.printf("Tuition will be $%.2f in %1d years",tuition,year);

        //Slide 51 - Multiplication table
        /*for(int i =1; i<13; i++){
            for(int j =1;  j<13; j++){
                System.out.printf("%5d",i*j);
            }
            System.out.println();*/
        }

        // Slide 24 - Guess the number
        /*int random = (int) (Math.random() * 101);
        {
            System.out.println("random");
            int n = 0;
            Scanner input = new Scanner(System.in);
            while (random != n) {
                System.out.println("Please enter a number");
                int n1 = input.nextInt();
                System.out.println("Please enter another number");
                if (random == n1) {
                    System.out.println("You did it");
                    System.exit(0);*/

                    //Write a program that prints the
                    //Fibonacci Sequence from 0 to 50. The following output
                    //will be produced: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,*/
                    //Fibonacci Sequence
                    /*int n1 = 0, n2 = 1, n3, i, count = 10;
                    System.out.print(n1 + " " + n2);//printing 0 and 1
                    for (i = 2; i < count; ++i)//loop starts from 2 because 0 and 1 are already printed
                    {
                        n3 = n1 + n2;
                        System.out.print(" " + n3);
                        n1 = n2;
                        n2 = n3;*/

                        // Palindromes
                       /* String x;
                        boolean result;
                        for(int i=10; i<=200; i++) {
                            result = false;
                            x = String.valueOf(i);
                            if(x.length()==2) {
                                result =x.charAt(0)==x.charAt(1);
                            } if(x.length()==3) {
                                result = x.charAt(0) == x.charAt(2);
                            } if (result){
                                System.out.print(x + " ");*/

                                // Palindromes
                                /*String x;
                                boolean result;
                                for (int i = 10; i <= 200; i++) {
                                    result = false;
                                    x = String.valueOf(i);
                                    if (x.length() == 2) {
                                        result = x.charAt(0) == x.charAt(1);
                                    }
                                    if (x.length() == 3) {
                                        result = x.charAt(0) == x.charAt(2);
                                    }
                                    if (result) {
                                        System.out.print(x + " ");

                                        //print the result
                                        System.out.println("Output is : ");*/

                                        //loop  to print 1 to 10.
                                        /*for(int i = 1; i <= 10; i++)
                                        {
                                            System.out.println(i);
                                        }
                                        System.out.println("End");*/

//do not print out any numbers greater than 50
                                               /* int number = 1;

                                                while( number < 50 )
                                                {
                                                    if( (number % 5) == 0 )
                                                    {
                                                        System.out.println(number);
                                                    }
                                                    number++;
                                                }
                                                System.out.println("End");*/
