import java.util.Scanner;

public class Exception6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        try {
            double result = divide(n);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double divide(int num) throws ArithmeticException, IllegalArgumentException {
        if (num == 0) {
            throw new ArithmeticException("Hehe");
        } else if (num < 0) {
            throw new IllegalArgumentException("Haha");
        } else {
            return ((double) 50 / num);
        }
    }
}
