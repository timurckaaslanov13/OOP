public class Rectangle {
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public Rectangle(){
        this.height = 11;
        this.width = 9;
    }
    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }
    public double calculateArea(){
        return getHeight() * getWidth();
    }

    public double calculatePerimeter() {
        return 2 * (getWidth() + getHeight());
    }
}
