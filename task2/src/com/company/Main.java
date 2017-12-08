package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        String alphabetString = "abcdefghijklmnopqrstuvwxyz";
        String alphabetCapString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char rot13[]=new char[26] ;
        char rot13Cap[]=new char[26];
        for (int i=0; i<alphabetString.length(); i++)
        {
            rot13[(i+13) % 26]=alphabetString.charAt(i);
            rot13Cap[(i+13) % 26]=alphabetCapString.charAt(i);
        }
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter text: ");

        String text = reader.nextLine();
        for (int i = 0; i < text.length(); i++)
        {
            Character c = null;
            if (alphabetString.indexOf(text.charAt(i))>=0) c=rot13[alphabetString.indexOf(text.charAt(i))];
            if (alphabetCapString.indexOf(text.charAt(i))>=0) c=rot13Cap[alphabetString.indexOf(text.charAt(i))];
            System.out.print((c == null) ? text.charAt(i) : c); // Non-letters are printed without being changed
        }
    }
}
