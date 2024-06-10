package jdbc_demo;

import java.sql.*;
import java.util.Scanner;

public class PreparedStatement2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roll of the student:");
        int roll=sc.nextInt();
        try(sc){
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
            PreparedStatement pstmt = conn.prepareStatement("delete from students1 where roll=?");
            pstmt.setInt(1, roll);
            int affectedRow = pstmt.executeUpdate();
            if(affectedRow > 0){
                System.out.println("Student with id "+roll+" deleted successfully");
            }
            else{
                System.out.println("Unable to delete");
            }
            pstmt.close();
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
