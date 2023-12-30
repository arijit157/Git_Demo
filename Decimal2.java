import java.text.DecimalFormat;

public class Decimal2 {
    public static void main(String args[]){
        DecimalFormat df=new DecimalFormat("####, ####.##");
        double num=123456789.123;
        System.out.println(df.format(num));   //output: 1,2345,6789.12
    }
}
