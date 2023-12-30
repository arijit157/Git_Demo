package stream_API;

import java.util.Arrays;
import java.util.List;

public class ReduceDemo {
    public static void main(String[] args){
        List<Integer> list=Arrays.asList(15,58,69,20,47);

        int ans=list.stream().reduce(0, (c, e) -> c+e);

        System.out.println(ans);
    }
}
