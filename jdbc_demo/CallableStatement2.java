package jdbc_demo;

import java.sql.*;

public class CallableStatement2 {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
            CallableStatement cstmt = conn.prepareCall("{call param_stored_procedure(?)}");
            cstmt.setString(1, "ECE");
            ResultSet rs = cstmt.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4)
                + " " + rs.getInt(5) + " " + rs.getInt(6));
            }
            rs.close();
            cstmt.close();
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
