package lad2BT.ex1;

public class Rectangle {
    private int wight;
    private int height;
// khoi tao phuong thuc construstor co tham so
    public Rectangle(int wight, int height) {
        this.wight = wight;
        this.height = height;
    }
// khoi tao phuong thuoc khong co tham so
    public Rectangle() {
    }

    public int getWight() {
        return wight;
    }

    public int getHeight() {

        return height;
    }

    public void setWight(int wight) {
        this.wight = wight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int area() {

        return wight * height;
    }

    public int perimeter() {

        return (wight + height) * 2;
    }

}
