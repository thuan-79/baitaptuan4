package baitaptuan4;
import java.util.Scanner;
public class b5t4  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên thứ nhất: ");
        int num1 = scanner.nextInt();
        System.out.print("Nhập số nguyên thứ hai: ");
        int num2 = scanner.nextInt();
        int ucln = gcd(num1, num2);
        int bcnn = lcm(num1, num2, ucln);
        System.out.println("UCLN của " + num1 + " và " + num2 + " là: " + ucln);
        System.out.println("BCNN của " + num1 + " và " + num2 + " là: " + bcnn);

        scanner.close();
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int lcm(int a, int b, int gcd) {
        return Math.abs(a * b) / gcd; 
    }
}
