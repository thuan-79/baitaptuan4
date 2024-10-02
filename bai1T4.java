package Baitaptuan4;

	import java.util.Scanner;
	
	public class bai1T4 
	{
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Nhập một số nguyên dương n: ");
	        int n = scanner.nextInt();
	        
	        if (n < 1) {
	            System.out.println("Vui lòng nhập một số nguyên dương.");
	        } else {
	            int sum = 0;
	            for (int i = 1; i <= n; i++) {
	                sum += i;
	            }
	            System.out.println("Tổng các số từ 1 đến " + n + " là: " + sum);
	        }
	        
	        scanner.close();
	    }
	}