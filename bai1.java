package bt.tuan.pkg4;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so n: ");
        int n = scanner.nextInt();
        int sum,i;
        sum = 0;
        for (i = 1; i <= n; i++) 
        {
            sum += i;
        }
        System.out.println("Tong cac so tu 1 den " + n + " la: " + sum);
        scanner.close();
    }
}
