import java.io.*;
import java.util.Scanner;

public class NeoCoderFileIO4 {
    public static void main(String args[]) {
        try {
            Scanner sc = new Scanner(System.in);
            FileWriter fw = new FileWriter("C:\\Users\\HP\\Desktop\\My_Personal_Folder\\sampleFile5.txt");
            BufferedReader br = new BufferedReader(
                    new FileReader("C:\\Users\\HP\\Desktop\\My_Personal_Folder\\sampleFile5.txt"));
            System.out.println("Enter a string:");
            String str = sc.nextLine();
            fw.write(str);
            fw.close();
            int c = 0, numCount = 0;
            while ((c = br.read()) != -1) {
                if (c >= 48 && c <= 57) {
                    numCount++;
                }
            }
            br.close();
            sc.close();
            System.out.println("Numbers count: " + numCount);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
