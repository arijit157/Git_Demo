import java.util.ArrayDeque;
import java.util.Iterator;

public class LearnArrayDeque {
    public static void main(String[] args){
        ArrayDeque<Integer> adq=new ArrayDeque<>();

        adq.offer(10);
        adq.offer(56);
        adq.offer(41);
        adq.offer(86);
        adq.offer(69);
        adq.offerFirst(20);

        adq.poll();
        System.out.println(adq);

        adq.pollLast();
        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekLast());

        //adq.clear();  //removes all elements
        //System.out.println(adq);

        Iterator<Integer> iterate=adq.iterator();
        while(iterate.hasNext()){
            System.out.println(iterate.next());
        }

        Iterator<Integer> revIterate=adq.descendingIterator();
        while(revIterate.hasNext()){
            System.out.println(revIterate.next());
        }
    }
}
