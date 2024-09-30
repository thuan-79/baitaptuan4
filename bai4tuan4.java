import java.util.Scanner;

public class bai4tuan4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhập số a");
        int a= new Scanner(System.in).nextInt();
        int tong=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
                tong++;
        }
        if( tong==2)
            System.out.println("a la so nguyen to");

        else
            System.out.println("khong phải la so nguyen to");
    }
    }

