package baitaptuan4;
import java.util.Scanner;
public class b3t4  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Nhập vào một số nguyên dương: ");
        int n = scanner.nextInt();             
        if (n < 0) {
            System.out.println("Vui lòng nhập một số nguyên dương.");
        } else {
            long gthua = 1; 
            for (int i = 1; i <= n; i++) {
                gthua *= i;
            }
            System.out.println("Giai thừa của " + n + " là: " + gthua);
        }
        
        scanner.close(); 
    }
}
