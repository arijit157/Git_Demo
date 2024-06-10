import java.util.Scanner;

public class Exception4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        int arr[]=new int[]{1,2,3,4,5,6,7,8,9,10};
        while(flag){
            System.out.println("Enter an index:");
            try {
                int idx=sc.nextInt();
                if(idx>=arr.length){
                    throw new ArrayIndexOutOfBoundsException();
                }
                else{
                    flag=false;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Closing application...");
        System.out.println("Thanks for staying with us");
    }
}
