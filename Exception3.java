import java.util.Scanner;

public class Exception3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[] { 15, 45, 52 };
        try {
            System.out.println("Enter an index:");
            int idx = sc.nextInt();
            if (idx >= arr.length) {
                throw new ArrayIndexOutOfBoundsException("index out of bounds");
            } else {
                System.out.println("Enter the number by which you want to divide:");
                int n = sc.nextInt();
                double result=0.0;
                try {
                    result = arr[idx] / n;
                    System.out.println("Result: " + result);
                } catch (Exception e) {
                    // System.out.println("Inner block");
                    e.printStackTrace();
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // System.out.println("outer block");
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
