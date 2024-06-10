import java.io.*;

public class FileIO1 {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\HP\\Desktop\\My_Personal_Folder\\My_Java_Files\\file1.txt");
        try {
            if (f.createNewFile()) {
                System.out.println("File created: " + f.getName());
                System.out.println("Path: " + f.getPath());
            } else {
                System.out.println("File already exists in: " + f.getPath());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
