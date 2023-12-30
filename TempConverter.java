import java.util.*;
import java.text.DecimalFormat;

class TempConverter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DecimalFormat numberFormat = new DecimalFormat("##.#");
        System.out.println("Temperature in Celsius:");
        int tempCelcius=sc.nextInt();
        float tempF=(9*(float)tempCelcius+160)/5;
        System.out.println("Temperature in Fahrenheit is "+numberFormat.format(tempF)+"F");
        sc.close();
     }
}