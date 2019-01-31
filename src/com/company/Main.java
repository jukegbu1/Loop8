
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner Keyboard = new Scanner (System.in);

        System.out.println("Please enter a number");
        int number= Keyboard.nextInt();

        int sum= 0;

        for(int i=number; i>=1; i--) {
            sum += i;
        }

        System.out.println("Sum " + sum);
    }
}
