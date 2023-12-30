import java.util.Scanner;
import java.io.*;

public class NeoCoderFileIO5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        try{
            File f=new File("C:\\Users\\HP\\Desktop\\My_Personal_Folder\\sampleFile5.txt");
            FileWriter fw=new FileWriter(f);
            System.out.println("Enter a string: ");
            String str=sc.nextLine();
            fw.write(str);
            fw.close();
            System.out.println("File written successfully!");

            BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\My_Personal_Folder\\sampleFile5.txt"));
            int c=0, upperCount=0, lowerCount=0;
            while((c=br.read())!=-1){
                if(c>=65 && c<=90){
                    upperCount++;
                }
                if(c>=97 && c<=122){
                    lowerCount++;
                }
            }
            System.out.print("Upper count: "+upperCount+"\n"+"Lower count: "+lowerCount);
            br.close();
            sc.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
