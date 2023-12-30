import java.util.Arrays;

public class StringMethods{
    public static void main(String args[]){

        String str1="Arijit Bhakta";
        String str2="Arijit Chatterjee Chatterjee";
        String str3="     Java Programming            ";

        System.out.println(str1);
        System.out.println(str1.length());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.isEmpty());
        System.out.println(str1.charAt(4));
        System.out.println(str1.indexOf('B'));
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.contains("Bhakta"));
        System.out.println(str1.startsWith("Arijit"));
        System.out.println(str1.endsWith("Arijit"));
        System.out.println(str3.trim());
        System.out.println(Arrays.toString(str2.toCharArray()));
        System.out.println(str2.replace("Chatterjee", "Das"));
        System.out.println(str2.replaceAll("Chatterjee", "Bhakta"));  //accepts regex only
    }
}