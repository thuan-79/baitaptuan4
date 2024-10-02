package Baitaptuan4;
import java.util.Scanner;
public class bai3T4{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập vào một số nguyên dương
        System.out.print("Nhập vào một số nguyên dương: ");
        int n = scanner.nextInt();

        // Kiểm tra nếu số nhập vào không phải là số nguyên dương
        if (n < 0) {
            System.out.println("Vui lòng nhập một số nguyên dương.");
        } else {
            // Tính giai thừa
            long giaiThua = tinhGiaiThua(n);
            System.out.println("Giai thừa của " + n + " là: " + giaiThua);
        }
        
        scanner.close();
    }

    // Phương thức tính giai thừa
    public static long tinhGiaiThua(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

