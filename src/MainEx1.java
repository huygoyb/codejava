import lad2BT.ex1.Rectangle;

import java.util.Scanner;

public class MainEx1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chieu rong: ");
        rectangle.setWight(scanner.nextInt());
        System.out.println("Nhap vao chieu dai");
        rectangle.setHeight(scanner.nextInt());
        System.out.println("chu vi hinh chu nhat la :" + rectangle.perimeter());
        System.out.println("dien tich hinh chu nhat la :" + rectangle.area());
    }
}
