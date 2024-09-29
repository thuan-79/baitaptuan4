package baitaptuan4;
import java.util.Scanner;
public class b6t4  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên: ");
        int number = scanner.nextInt();
        if (isPalindrome(number)) {
            System.out.println(number + " là số đối xứng.");
        } else {
            System.out.println(number + " không phải là số đối xứng.");
        }

        scanner.close();
    }
    public static boolean isPalindrome(int n) {
        int original = n; 
        int reversed = 0; 
        while (n != 0) {
            int digit = n % 10; 
            reversed = reversed * 10 + digit; 
            n /= 10; 
        }
        return original == reversed;
    }
}
