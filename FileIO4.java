import java.io.*;

//Reading a file character by character
public class FileIO4 {
    public static void main(String[] args) {

        try(FileReader fr = new FileReader("C:\\Users\\HP\\Desktop\\My_Personal_Folder\\My_Java_Files\\file1.txt")) {
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
    }
}
