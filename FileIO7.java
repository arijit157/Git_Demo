import java.io.*;

//Writing file using FileWriter
public class FileIO7 {
    public static void main(String[] args){
        
        try(FileWriter fw = new FileWriter("file2.txt");){
            fw.write("Hello! I am Arijit Bhakta");
            System.out.println("File written successfully!");
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
