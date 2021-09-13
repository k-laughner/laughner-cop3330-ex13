/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kaylee Laughner
 */
import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What is the principal amount?");
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();

        System.out.println("What is the rate? (as a percentage)");
        Scanner input2 = new Scanner(System.in);
        float percent = input2.nextFloat();

        System.out.println("What is the number of years?");
        Scanner input3 = new Scanner(System.in);
        int t = input3.nextInt();

        System.out.println("What is the number of times the interest is compounded per year?");
        Scanner input4 = new Scanner(System.in);
        int n = input4.nextInt();

        float rate = percent/100;
        float base = 1+(rate/n);
        float exp = n*t;
        double eq = Math.pow(base, exp);
        double a = eq*p;

        System.out.printf("$%d invested at %.1f%% for %d years compounded %d times per year is $%.2f.", p, percent, t, n, a);
    }
}