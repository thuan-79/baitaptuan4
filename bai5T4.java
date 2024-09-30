package Baitaptuan4;
import java.util.Scanner;
public class bai5T4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập vào hai số nguyên
        System.out.print("Nhập vào số nguyên thứ nhất: ");
        int a = scanner.nextInt();
        System.out.print("Nhập vào số nguyên thứ hai: ");
        int b = scanner.nextInt();

        // Tính UCLN và BCNN
        int ucln = ucln(a, b);
        int bcnn = bcnn(a, b, ucln);
        
        // In kết quả
        System.out.println("UCLN của " + a + " và " + b + " là: " + ucln);
        System.out.println("BCNN của " + a + " và " + b + " là: " + bcnn);
        
        scanner.close();
    }

    // Phương thức tính UCLN
    public static int ucln(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); // Trả về giá trị tuyệt đối của UCLN
    }

    // Phương thức tính BCNN
    public static int bcnn(int a, int b, int ucln) {
        return Math.abs(a * b) / ucln; // Công thức tính BCNN
    }
}
