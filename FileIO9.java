import java.io.*;
import java.util.Scanner;

//Writing file using FileOutputStream, BufferedOutputStream
public class FileIO9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a random sentence: ");
        String data = sc.nextLine();
        try (FileOutputStream fos = new FileOutputStream("file4.txt");
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                sc;) {
            byte[] byteArr = data.getBytes();
            bos.write(byteArr);
            System.out.println("File written successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
