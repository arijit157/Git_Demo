package stream_API;

import java.util.stream.Stream;

public class ArrayToStream {
    public static void main(String[] args){
        Integer arr[]=new Integer[] {10,20,30,40,50,60,70};

        Stream.of(arr).forEach(i -> System.out.println(i));
    }
}
