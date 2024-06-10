import java.io.*;

public class FileIO6 {
    public static void main(String[] args){
        try(FileInputStream fis = new FileInputStream("file1.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);){
            int ch;
            while((ch=bis.read())!=-1){
                System.out.print((char)ch);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
