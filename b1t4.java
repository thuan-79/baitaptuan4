package baitaptuan4;
import java.util.Scanner;
public class b1t4  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số n: ");
        int n = scanner.nextInt();
        int s = 0;      
        for (int i = 1; i <= n; i++) {
            s += i;
        }      
        System.out.println("Tổng các số từ 1 đến " + n + " là: " + s);
        scanner.close(); 
    }
}