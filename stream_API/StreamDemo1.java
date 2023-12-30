package stream_API;

import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String[] args){
        Stream<Integer> myStream = Stream.of(9,99,999,9999);

        myStream.forEach(el -> System.out.println(el));

    }
}
