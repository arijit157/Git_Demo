import java.util.Iterator;
import java.util.Stack;

public class LearnStack {
    public static void main(String[] args){

        Stack<String> stk=new Stack<>();

        stk.push("Apple");  //adds an element to the stack
        stk.push("Banana");
        stk.push("Pineapple");
        stk.push("Guava");

        System.out.println(stk);

        stk.pop();   //removes an element from the last position
        System.out.println(stk);

        System.out.println(stk.peek());  //returns the topmost element

        Iterator<String> iterate=stk.iterator();
        while(iterate.hasNext()){
            System.out.println(iterate.next());
        }

        System.out.println(stk.search("Pineapple"));  //returns the position of the specified element from the top(counting starts from 1)

        System.out.println(stk.empty());   //checks whether a stack is empty or not
    }
}
