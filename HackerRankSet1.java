import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HackerRankSet1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Set<String> set=new HashSet<>();
        int n=Integer.parseInt(sc.nextLine());
        while(sc.hasNextLine()){
            set.add(sc.nextLine());
            System.out.println(set.size());
        }
        sc.close();
    }
}
