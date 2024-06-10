package jdbc_demo;

import java.sql.*;

public class CallableStatement4 {
    public static void main(String[] args){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
            CallableStatement cstmt = conn.prepareCall("{call procedure_lm4(?, ?)}");
            cstmt.setInt(1, 92);
            cstmt.registerOutParameter(2, Types.INTEGER);
            cstmt.execute();
            int rowCount = cstmt.getInt(2);
            System.out.println(rowCount);
            cstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
