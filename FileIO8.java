import java.io.*;

//Writing file using FileOutputStream
public class FileIO8 {
    public static void main(String[] args){
        try(FileOutputStream fos = new FileOutputStream("file3.txt");){
            String data = "This is a sample text";
            byte[] arr = data.getBytes();
            fos.write(arr);
            System.out.println("File written successfully!");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
