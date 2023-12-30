//throws keyword is used to indicate that an exception might be occur in future in that method

import java.util.Scanner;

public class Throws {

    public static void func(int num1, int num2) throws ArithmeticException{
        int result=num1/num2;
        System.out.println("Result is : "+result);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1=sc.nextInt();
        System.out.print("Enter num1: ");
        int num2=sc.nextInt();
        try{
            
            func(num1, num2);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            sc.close();
        }
    }
}
