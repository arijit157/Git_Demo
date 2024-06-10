import java.io.*;

public class FileIO5 {
    public static void main(String[] args){
        try(FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Desktop\\My_Personal_Folder\\My_Java_Files\\file1.txt")){
            int ch;
            while((ch=fis.read())!=-1){
                System.out.print((char)ch);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
