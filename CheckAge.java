import java.util.Scanner;

public class CheckAge {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an age:");
        try{
            int age=sc.nextInt();
            if(age < 0){
                throw new InvalidAgeException("Age cannot be negative");
            }
            else{
                System.out.println("Your age is: "+age);
            }
        }catch(InvalidAgeException ie){
            System.out.println(ie.getMessage());
        }
        sc.close();
        
    }
}
