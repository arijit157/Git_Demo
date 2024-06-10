import java.io.*;
import java.util.Scanner;

//Reading a file line by line
public class FileIO3 {
    public static void main(String[] args){
        try{
            File f = new File("C:\\Users\\HP\\Desktop\\My_Personal_Folder\\My_Java_Files\\file1.txt");
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
