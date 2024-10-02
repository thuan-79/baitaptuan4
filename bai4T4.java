package Baitaptuan4;
import java.util.Scanner;
public class bai4T4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập vào một số nguyên
        System.out.print("Nhập vào một số nguyên: ");
        int n = scanner.nextInt();

        // Kiểm tra và in kết quả
        if (isPrime(n)) {
            System.out.println(n + " là số nguyên tố.");
        } else {
            System.out.println(n + " không phải là số nguyên tố.");
        }
        
        scanner.close();
    }

    // Phương thức kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // Số nhỏ hơn hoặc bằng 1 không phải là số nguyên tố
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Nếu chia hết cho i thì không phải là số nguyên tố
            }
        }
        return true; // Nếu không tìm thấy ước số nào thì là số nguyên tố
    }
}
