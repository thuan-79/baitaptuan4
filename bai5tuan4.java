import java.util.Scanner;

public class bai5tuan4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap a: ");
        int a= sc.nextInt();
        int x=a;
        System.out.println("nhap b: ");
        int b= sc.nextInt();
        int y=b;
        int UCLN=0;
        if(a==0 || b==0)
        {
            UCLN=a+b;

        }
        else{
            while (a!=b)
            {
                if(a<b)
                {
                    b=b-a;
                }
                else
                    a=a-b;
            }
            UCLN =a;
        }
        int BCNN= ((x*y)/UCLN);
        System.out.println("Ước Chung lớn nất là "+UCLN);
        System.out.println("Bội chung nhỏ nhất la "+BCNN);
    }
}
