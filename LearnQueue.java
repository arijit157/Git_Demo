import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args){
        Queue<Integer> q=new LinkedList<>();   //here we are implementing the queue using a linked list

        q.offer(10);  //inserts an element from the rear
        q.offer(56);
        q.offer(43);

        System.out.println(q);

        System.out.println(q.poll());  //removes an element from the front

        System.out.println(q.peek());  //returns the first element in the queue

        Iterator<Integer> iterate=q.iterator();
        while(iterate.hasNext()){
            System.out.println(iterate.next());
        }
    }
}
