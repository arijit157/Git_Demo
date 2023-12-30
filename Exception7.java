import java.util.Scanner;

class MaxRetriesReachedException extends Exception{
    public MaxRetriesReachedException(String message){
        super(message);
    }
}

public class Exception7 {
    public static void main(String args[]) {
        int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        try {
            // while (flag) {
            //     System.out.println("Enter an index:");
            //     int idx = sc.nextInt();
            //     if (idx < arr.length) {
            //         System.out.println("Value at index "+idx+" is: "+arr[idx]);
            //         continue;
            //     } else {
            //         if (count < 5-1) {
            //             count++;
            //             continue;
            //         } else {
            //             throw new MaxRetriesReachedException("Maximum retries reached!");
            //         }
            //     }
            // }
            printElement(arr);
        } catch (MaxRetriesReachedException e) {
            e.printStackTrace();
        }
    }

    public static void printElement(int arr[]) throws MaxRetriesReachedException{
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int count = 0;
        while (flag) {
            System.out.println("Enter an index:");
            int idx = sc.nextInt();
            if (idx < arr.length) {
                System.out.println("Value at index "+idx+" is: "+arr[idx]);
                continue;
            } else {
                if (count < 5-1) {
                    count++;
                    continue;
                } else {
                    throw new MaxRetriesReachedException("Maximum retries reached!");
                }
            }
        }
    }
}
