import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class DateDemo4 {
    public static void main(String[] args){
        LocalDateTime ldt=LocalDateTime.now();
        DateTimeFormatter df1=DateTimeFormatter.ofPattern("dd-MM-yyyy");  //to print the date in a specified format
        DateTimeFormatter df2=DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println(ldt.format(df1));
        System.out.println(ldt.format(df2));
    }
}
