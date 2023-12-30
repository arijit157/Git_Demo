import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class LearnDeque {
    public static void main(String[] args){

        Deque<Integer> dq=new ArrayDeque<>();

        dq.offerFirst(10);    //inserts an element from the front position
        dq.offerFirst(25);   
        dq.offerLast(56);    //inserts an element from the rear position
        dq.offerLast(20);
        System.out.println(dq);

        dq.pollFirst();     //deletes an element from front
        System.out.println(dq);

        dq.pollLast();    //deletes an element from rear
        System.out.println(dq);

        System.out.println(dq.peekFirst());   //returns the first element
        System.out.println(dq.peekLast());     //returns the last element

        //traversing all the elements using iterator
        Iterator<Integer> iterate=dq.iterator();
        while(iterate.hasNext()){
            System.out.println(iterate.next());
        }
    }
}
