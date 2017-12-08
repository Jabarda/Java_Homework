package com.company;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        long x0 = 5L;
        long a = 25214903917L;
        long c = 11L;
        long m = (long)Math.pow((double)2, (double)48);
        Stream<Long> RandomGenerator = Stream.iterate(x0, x -> (a * x + c) % m).limit(20);
        RandomGenerator.forEach(System.out::println);
    }
}
