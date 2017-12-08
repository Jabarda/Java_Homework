package com.company;

import javax.sound.midi.SysexMessage;
import javax.sound.sampled.Line;
import java.util.*;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Supplier;
import java.util.stream.*;

public class Main {


    public static void main(String[] args)
    {

	    Scanner scanner = new Scanner(System.in);

        Stream<String> StringStream = Stream.generate(scanner::next).limit(10); //we will use this stream for example input/output
        Stream <Integer> IntStream = Stream.generate(scanner::nextInt);
        Stream <Double> DoubleStream = Stream.generate(scanner::nextDouble);
        Stream <String> LineStream = Stream.generate(scanner::nextLine);
        String[] stringArray = StringStream.toArray(String[]::new);//reading
        for (int i=0;i<stringArray.length;i++)
            System.out.println(stringArray[i]);

    }
}
