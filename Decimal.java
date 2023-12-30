import java.text.DecimalFormat;
import java.util.Scanner;
class Decimal{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("#.#");
        System.out.print("Enter a number: ");
        double num=sc.nextDouble();
        System.out.println(df.format(num));
        sc.close();
    }
}