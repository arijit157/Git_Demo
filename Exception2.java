import java.util.Scanner;

public class Exception2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[] { 15, 45, 52 };
        try {
            System.out.println("Enter an index:");
            int idx = sc.nextInt();

            // System.out.println("Enter the number by which you want to divide:");
            // int n = sc.nextInt();
            // double result = arr[idx] / n;
            // System.out.println("Result: " + result);

            if(idx>=arr.length){
            throw new ArrayIndexOutOfBoundsException("index out of bounds");
            }
            else{
            System.out.println("Enter the number by which you want to divide:");
            int n=sc.nextInt();
            double result=arr[idx]/n;
            System.out.println("Result: "+result);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
