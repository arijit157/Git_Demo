import java.util.Scanner;

public class Exception1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        try{
            int result=1000/num;
            System.out.println(result);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            sc.close();
        }
    }
}
