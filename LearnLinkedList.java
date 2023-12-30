import java.util.Iterator;
import java.util.LinkedList;

public class LearnLinkedList {
    public static void main(String[] args){
        LinkedList<Integer> lnk=new LinkedList<>();
        lnk.add(20);
        lnk.add(43);
        lnk.add(89);
        lnk.add(1, 69);
        lnk.add(56);

        System.out.println(lnk);

        lnk.remove(2);
        lnk.remove(Integer.valueOf(69));

        System.out.println(lnk);

        System.out.println(lnk.get(0));

        lnk.set(1, 55);
        System.out.println(lnk);

        System.out.println("======================================");

        for(int i=0; i<lnk.size(); i++){
            System.out.println(lnk.get(i));
        }

        System.out.println("======================================");

        for (Integer val : lnk) {
            System.out.println(val);
        }

        System.out.println("======================================");

        Iterator<Integer> iterate=lnk.iterator();
        while(iterate.hasNext()){
            System.out.println(iterate.next());
        }

        lnk.clear();   //removes all the elements of the linked list
        System.out.println(lnk);

        System.out.println(lnk.contains(55));   //checks whether an element present in the linked list or not
    }
}
