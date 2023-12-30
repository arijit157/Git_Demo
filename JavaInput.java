import java.util.Scanner;

public class JavaInput {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // String str1=sc.next();  // next() will take only a single word (e.g. Arijit Bhakta --> Arijit)
        //String str2=sc.nextLine(); // nextLine() will take space separated words (e.g. Arijit Bhakta --> Arijit Bhakta)
        char ch=sc.next().charAt(0);  //to input a character
        System.out.println(ch);
        sc.close();
    }
}
