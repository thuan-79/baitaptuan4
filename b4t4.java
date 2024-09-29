package baitaptuan4;
import java.util.Scanner;
public class b4t4  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên: ");
        int number = scanner.nextInt();     
        if (isPrime(number)) {
            System.out.println(number + " là số nguyên tố.");
        } else {
            System.out.println(number + " không phải là số nguyên tố.");
        }

        scanner.close();
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; 
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; 
            }
        }
        
        return true; 
    }
}
