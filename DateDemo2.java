import java.util.Date;

public class DateDemo2 {
    public static void main(String[] args){
        Date d=new Date();
        System.out.println(d);
        System.out.println(d.getDate());
        System.out.println(d.getMonth());
        System.out.println(d.getYear());
        System.out.println(d.getHours());
        System.out.println(d.getMinutes());
        System.out.println(d.getSeconds());
        System.out.println(d.getDay());
        d.setHours(14);
        System.out.println(d.getHours());
    }
}
