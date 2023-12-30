import java.util.Scanner;

public class SwapBitWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        n1=n1^n2;
        n2=n1^n2;
        n1=n1^n2;
        System.out.println("The two values after swapping are" + "\n" + n1 + "\n" + n2);
        sc.close();
    }
}