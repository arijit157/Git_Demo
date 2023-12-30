//Write an array into a file and print the content of the file and also print the minimum element
/*
 * TIP:
 * Use FileWriter for write operation.
 * Use BufferedReader for read operation.
 */
import java.io.*;
import java.util.*;
public class NeoCoderFileIO2 {
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
            //int c=0;
            String data=null;
            int arr2[]=new int[arr.length];
            int i=0;
            BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\My_Personal_Folder\\sampleFile1.txt"));
            while((data=br.readLine())!=null){
                //System.out.print((char)c);
                if(i<arr2.length){
                    arr2[i]=Integer.parseInt(data);
                }
                i++;
            }
            System.out.println("Printing array elements:");
            for(int el : arr2){
                System.out.println(el);
            }
            int min=arr2[0];
            for(int j=1; j<arr2.length; j++){
                if(arr2[j]<min){
                    min=arr2[j];
                }
            }
            System.out.println("Minumum Element: "+min);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            sc.close();
        }
    }
}
