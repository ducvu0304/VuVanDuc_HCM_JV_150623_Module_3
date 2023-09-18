package rikkei.academy;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int length) {
        this.height = length;
    }

    public int getPerimeter() {
        return (this.width + this.height)*2;
    }

    public int getArea() {
        return  this.width * this.height;
    }

    public String display() {
        return "Rectangle {" + "width = " + width + ", height = " + this.height +"}";
    }
}
