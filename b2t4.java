package baitaptuan4;
public class b2t4  {
    public static void main(String[] args) {      
        for (int i = 1; i <= 10; i++) {
            System.out.println("Bảng cửu chương của " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); 
        }
    }
}