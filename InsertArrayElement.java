import java.util.*;
class InsertArrayElement{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println("Old array: "+Arrays.toString(arr));
        System.out.println("Enter the position: ");
        int pos=sc.nextInt();
        System.out.println("Enter the value: ");
        int x=sc.nextInt();
        //insertAnElement(arr, x, pos);
        int newArr[]=new int[arr.length+1];
        for(int i=0; i<newArr.length; i++){
            if(i<pos-1){
                newArr[i]=arr[i];
            }
            else if(i==pos-1){
                newArr[i]=x;
            }
            else{
                newArr[i]=arr[i-1];
            }
        }
        System.out.println("New Array: "+Arrays.toString(newArr));
        sc.close();
    }
}