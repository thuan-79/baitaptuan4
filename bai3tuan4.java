import java.util.Scanner;

public class bai3tuan4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so ngau nhien");
        int so=new Scanner(System.in).nextInt();
        int a=1;
        for (int i=1;i<=so;i++)
        {
            a=a*i;
        }
        System.out.println("giai thua la: "+a);

    }
}
