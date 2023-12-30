import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateDemo3 {
    public static void main(String args[]){
        LocalDate ld=LocalDate.now();  //returns the current date in yyyy-mm-dd format
        System.out.println(ld);

        LocalTime lt=LocalTime.now();  //returns the current time in hh:mm:ss format
        System.out.println(lt);

        LocalDateTime ldt=LocalDateTime.now();  //returns the current date and time 
        System.out.println(ldt);
    }
}
