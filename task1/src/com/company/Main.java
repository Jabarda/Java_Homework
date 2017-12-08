package com.company;
import java.lang.Math;
import java.util.Scanner;

public class Main {

    // % and abs
     private static int gcd(int a, int b)
    {
        if (b==0) return a;
        return gcd(b, a%b);
    }

    // floorMod
    private static int gcdFloor(int a, int b)
    {
        if (b==0) return a;
        return gcdFloor(b, Math.floorMod(a,b));
    }

    // rem
    private static int gcdRem(int a, int b)
    {
        if (b==0) return a;
        return gcd(b, rem(a,b));
    }

    private static int rem(int a, int b)
    {
        int absA = Math.abs(a);
        int absB = Math.abs(b);

        while (absA > absB)
            absA -= absB;

        if(a >= 0)
            return a;
        else
            return absB - absA; // rem>0
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a and b: ");
        int a = reader.nextInt();
        int b = reader.nextInt();
	    System.out.println("% and abs: " + gcd(a, b));
        System.out.println("floorMod: " + gcdFloor(a, b));
        System.out.println("rem: " + gcdRem(a, b));
    }
}
