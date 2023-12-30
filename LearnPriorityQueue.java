import java.util.Iterator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args){

        PriorityQueue<Integer> pq = new PriorityQueue<>();    //smallest element has the highest priority

        pq.offer(10);
        pq.offer(56);
        pq.offer(8);
        pq.offer(75);

        System.out.println(pq);

        System.out.println(pq.poll());   //removes the front (smallest) element
        System.out.println(pq.poll());

        System.out.println(pq);

        System.out.println(pq.peek());  //returns the front element

        pq.remove(75);   //removes a specific element
        System.out.println(pq);

        //Traversing all the elements using iterator
        Iterator<Integer> iterate=pq.iterator();
        while(iterate.hasNext()){
            System.out.println(iterate.next());
        }

        System.out.println(pq.contains(10));

        System.out.println(pq.size());

        // System.out.println(pq.toArray());
    }
}
