package com.company;

import java.util.Iterator;
import java.util.stream.Stream;

public class Main {

    public static <T> Stream<T> StreamZip(Stream<T> firstStream, Stream<T> secondStream)
    {
        Stream.Builder<T> builder = Stream.builder();
        Iterator it1 = firstStream.iterator();
        Iterator it2 = secondStream.iterator();
        while (it1.hasNext() && it2.hasNext())
        {
            builder.accept((T)it1.next());
            builder.accept((T)it2.next());
        }
        Stream<T> resultStream = builder.build();
        return resultStream;
    }

    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(4, 8, 15, 16, 23, 42);
        Stream<Integer> stream2 = Stream.of(2, 4, 8, 16, 32, 64, 256, 512, 1024, 2048, 4096);
        Stream<Integer> stream = StreamZip(stream1, stream2);
        stream.forEach(element -> System.out.print(element + " "));
    }
}
