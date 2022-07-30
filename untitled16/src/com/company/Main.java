package com.company;

import java.util.Scanner;

public class Main {

    private static String in;

    public static void main(String[] args) {
        // write your code here

        int a = 4; // berilgan son
        int b = 7; // berilgan son
        int c = 10;

        if (a > b) { // a katta b dan
            if (a > c) { // a katta c da
                System.out.println("katta son a = " + a);
            } else { // c katta a dan
                System.out.println("katta son c = " + c);
            }
        } else { // a kichik b dan (b katta a dan)
            if (b > c) { // b katta c dan
                System.out.println("katta son b = " + b);
            } else { // b kichik c da
                System.out.println("katta son c = " + c);
            }
        }


        if (a < b) { // a katta b dan
            if (a < c) { // a katta c da
                System.out.println("kichkina son a = " + a);
            } else { // c katta a dan
                System.out.println("kichkina son c = " + c);
            }
        } else { // a kichik b dan (b katta a dan)
            if (b < c) { // b katta c dan
                System.out.println("kichkina son b = " + b);
            } else { // b kichik c da
                System.out.println("kichkina son c = " + c);
            }
        }
    }
}