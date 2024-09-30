import java.util.Scanner;

public class bai1tuan4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap 1 so bat ki:");
        int a= sc.nextInt();
        int tong=0;
        for(int i=1;i<=a;i++)
        {
            tong=tong+i;
        }
        System.out.println("tong la "+tong);
    }
}
