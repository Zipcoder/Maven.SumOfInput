package com.company;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
	System.out.println("Greetings, please enter a number below:");
            Scanner userInput = new Scanner(System.in);

        long calcSum = 0;
        long userNumber = userInput.nextLong();

    for (int i = 0; i <= userNumber; i++) {

        calcSum += i;

    }

        System.out.println(calcSum);

    }
}
