package Baitaptuan4;
import java.util.Scanner;
public class bai6T4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập vào một số nguyên
        System.out.print("Nhập vào một số nguyên: ");
        int n = scanner.nextInt();

        // Kiểm tra và in kết quả
        if (isPalindrome(n)) {
            System.out.println(n + " là số đối xứng.");
        } else {
            System.out.println(n + " không phải là số đối xứng.");
        }
        
        scanner.close();
    }

    // Phương thức kiểm tra số đối xứng
    public static boolean isPalindrome(int n) {
        String str = Integer.toString(n); // Chuyển số thành chuỗi
        int left = 0;
        int right = str.length() - 1;

        // Kiểm tra từng ký tự từ trái sang phải và từ phải sang trái
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Nếu không giống nhau thì không phải số đối xứng
            }
            left++;
            right--;
        }
        return true; // Nếu tất cả các ký tự giống nhau thì là số đối xứng
    }
}
