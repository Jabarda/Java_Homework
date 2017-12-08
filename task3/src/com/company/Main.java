package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Hexadecimal number: ");
        String number = reader.nextLine().toUpperCase();
        String haxenumbers = "0123456789ABCDEF";
        int pos = 0, answer = 0;
        for (int i = number.length() - 1; i >= 0; i--)
        {
            answer += Math.pow(16, pos)*haxenumbers.indexOf(number.charAt(i));
            pos++;
        }
        System.out.println("Decimal number: \n" + answer);
    }
}
