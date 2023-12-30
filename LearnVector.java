import java.util.Iterator;
import java.util.Vector;

public class LearnVector {
    public static void main(String args[]){
        Vector<Integer> v=new Vector<>();
        v.add(10);
        v.add(56);
        v.add(69);
        v.add(26);
        v.add(89);
        v.add(63);
        v.add(86);
        v.add(1, 50);

        System.out.println(v);

        v.remove(2);
        System.out.println(v);

        v.remove(Integer.valueOf(89));
        System.out.println(v);

        System.out.println(v.get(3));

        v.set(4, 94);
        System.out.println(v);

        Iterator<Integer> iterate=v.iterator();
        while(iterate.hasNext()){
            System.out.println(iterate.next());
        }
    }
}
