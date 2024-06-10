package jdbc_demo;

import java.sql.*;

public class CallableStatement3 {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
            CallableStatement cstmt = conn.prepareCall("{call procedure_lm3(?)}");
            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.execute();
            int rowCount = cstmt.getInt(1);
            System.out.println("Row count: "+rowCount);
            cstmt.close();
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
