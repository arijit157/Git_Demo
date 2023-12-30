import java.io.*;  // for BufferedReader and InputStreamReader

public class JavaInput2 {
    public static void main(String[] args) {
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter an integer: ");
            float num1 = Float.parseFloat(bf.readLine());
            //int num2 = Integer.parseInt(bf.readLine());
            //double num3=Double.parseDouble(bf.readLine());
            System.out.println(num1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
