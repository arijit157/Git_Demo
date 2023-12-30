import java.util.Scanner;

public class ShopReward {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r, count = 0, num, max = 0, min = 0;
        int numOfDigits = calculateDigits(n);
        if (numOfDigits == 3) {
            num = n;
            while (num != 0) {
                r = num % 10;
                if (r > max) {
                    max = r;
                    count++;
                } else {
                    count = 0;
                    if (min == 0) {
                        min = r;
                        count++;
                    } else {
                        // if(r<min){
                        // min=r;
                        // count++;
                        // }
                        min = r;
                        count++;
                    }
                }
                num /= 10;
            }
            if (count > 2) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        } else {
            System.out.println("no");
        }
        sc.close();
    }

    public static int calculateDigits(int num) {
        int r, count = 0, n;
        n = num;
        while (n != 0) {
            r = n % 10;
            count++;
            n = n / 10;
        }
        return count;
    }

}
