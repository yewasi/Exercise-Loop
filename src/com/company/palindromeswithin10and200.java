package com.company;

public class palindromeswithin10and200 {

    public static void main(String[] args) {

        // Palindromes
        String x;
        boolean result;
        for(int i=10; i<=200; i++) {
            result = false;
            x = String.valueOf(i);
            if(x.length()==2) {
                result =x.charAt(0)==x.charAt(1);
            } if(x.length()==3) {
                result = x.charAt(0) == x.charAt(2);
            } if (result){
                System.out.print(x + " ");
            }
        }
    }
}
