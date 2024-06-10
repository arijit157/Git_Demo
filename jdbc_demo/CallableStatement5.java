package jdbc_demo;

import java.sql.*;

public class CallableStatement5 {
    public static void main(String args[]){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
            CallableStatement cstmt = conn.prepareCall("{? = call function_lm1()}");
            cstmt.registerOutParameter(1, Types.DOUBLE);
            cstmt.execute();
            double average = cstmt.getDouble(1);
            System.out.println("Average Marks: "+average);
            cstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
