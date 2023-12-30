import java.io.*;
import java.util.Scanner;

public class NeoCoderFileIO3 {
    public static void main(String args[]) throws IOException{
        Scanner sc=new Scanner(System.in);
        File myFile=new File("C:\\Users\\HP\\Desktop\\My_Personal_Folder\\sampleFile5.txt");
		if(myFile.createNewFile()) {
			System.out.println("File created successfully!");
		}
		else {
			System.out.println("Sorry...try again :(");
		}
        FileWriter fw=new FileWriter(myFile, true);
        String str1=sc.nextLine();
        fw.write(str1);
        String str2=sc.nextLine();
        fw.write(str2);
        fw.close();
        BufferedReader br=new BufferedReader(new FileReader(myFile));
        String data=null;
        while((data=br.readLine())!=null){
            System.out.println(data);
        }
        br.close();
    }
}
