import java.io.*;

public class FileIO2 {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\HP\\Desktop\\My_Personal_Folder\\My_Java_Files\\file2.xlsx");
        try {
            if (f.createNewFile()) {
                System.out.println("Absolute path: " + f.getAbsolutePath());
                System.out.println("Readable: " + f.canRead());
                System.out.println("Writable: " + f.canWrite());
                System.out.println("File length: " + f.length());
            } else {
                System.out.println("File already exists in: " + f.getPath());
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
