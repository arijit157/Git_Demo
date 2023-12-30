//Write an array into a file and print the content of the file
import java.io.*;
import java.util.*;
public class NeoCoderFileIO1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        try{
            FileWriter fw=new FileWriter("C:\\Users\\HP\\Desktop\\My_Personal_Folder\\sampleFile1.txt");
            for(int i=0; i<arr.length; i++){
                arr[i]=sc.nextInt();
                fw.write(arr[i]+"\n");
            }
            fw.close();
            System.out.println("File written successfully!");
            // int c=0;
            String data=null;
            BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\My_Personal_Folder\\sampleFile1.txt"));
            while((data=br.readLine())!=null){
                System.out.println(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            sc.close();
        }
    }
}
