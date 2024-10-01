
package bt.tuan.pkg4;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap bang cuu chuong ban muon in (tu 1 den 10): ");
        int n = scanner.nextInt();
        if (n >= 1 && n <= 10) 
        {
            System.out.println("Bang cuu chuong " + n + ":");
            for (int i = 1; i <= 10; i++)
            {
                System.out.println(n + " x " + i + " = " + n * i);
            }
        } 
        else 
            System.out.println("Nhap so tu 1 den 10 giup toi.");
        scanner.close();
    }
}
