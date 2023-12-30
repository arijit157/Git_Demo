import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class HackerRankSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=1; i<=n; i++){
            String record=sc.nextLine();
            list.add(record);
        }

        list.sort(new CustomSort());

        for(String str: list){
            System.out.println(str.split(" ")[1]);
        }

    }
}

class CustomSort implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
       String[] arr1=o1.split(" ");
       String[] arr2=o2.split(" ");
       if(Double.parseDouble(arr1[2]) == Double.parseDouble(arr2[2])){
        return arr1[1].compareTo(arr2[1]);
       }
       else if(arr1[1].equals(arr2[1])){
        return Integer.compare(Integer.parseInt(arr2[0]), Integer.parseInt(arr1[0]));
       }
       else{
        return Double.compare(Double.parseDouble(arr2[2]), Double.parseDouble(arr1[2]));
       }
    }
    
}
