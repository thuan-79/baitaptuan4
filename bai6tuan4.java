import java.util.Scanner;

public class bai6tuan4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap so ngau nhien ");
        int a= sc.nextInt();
        int n=a;
        int x=0;
        int m=0;
        while(a>0)
        {
            x=a%10;
            a=a/10;
            m=m*10+x;
        }
        if(n==m)
        {
            System.out.println("so nay la so doi xung");
        }
        else
            System.out.println("khong doi xung");
    }
}
