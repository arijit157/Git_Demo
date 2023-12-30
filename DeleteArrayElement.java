import java.util.*;
public class DeleteArrayElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int newArr[]=new int[n-1];
        System.out.println("Enter elements:");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the position: ");
        int pos=sc.nextInt();
        for(int i=0; i<newArr.length; i++){
            if(i<pos-1){
                newArr[i]=arr[i];
            }
            else{
                newArr[i]=arr[i+1];
            }
        }
        System.out.println("Old array: "+Arrays.toString(arr));
        System.out.println("New array: "+Arrays.toString(newArr));
        System.out.println("Commited through GitHub");
        sc.close();
    }
}
