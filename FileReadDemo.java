//Reading a file in JAVA
import java.io.*;
class FileReadDemo{
    public static void main(String args[]) throws IOException{
        File f=new File("C:\\Users\\HP\\Desktop\\My_Personal_Folder\\sampleFile2.txt");
        char data[]=new char[100];
        FileReader fr=new FileReader(f);
        fr.read(data);
        System.out.println(data);
        fr.close();
    }
}