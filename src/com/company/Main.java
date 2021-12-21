package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int months = 12;
        int percent = 100;

        int principal = 0;

        while (true) {
            System.out.print("Principal: ");
            principal = input.nextInt();
            if (principal >= 1_000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a figure between 1,000 and 1,000,000");
        }

        float rateInt = 0;

        while (true) {
            System.out.print("Annual Interest Rate: ");
            rateInt = input.nextFloat();
            if (rateInt >= 1 && rateInt <= 30)
                break;
            System.out.println("Enter a number between 0 and 30");
        }

        float rate = (rateInt / percent)/months;

        byte period = 0;

        while (true) {
            System.out.print("Period (Years): ");
            period = input.nextByte();
            if (period > 0 && period <= 30)
                break;
            System.out.println("Enter a number between 1 and 30");
        }

        int time = (period * months);

        double mortgage = principal*(rate * (Math.pow(1 + rate, time))) / ((Math.pow(1 + rate, time))-1);

        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));

















    }
}
