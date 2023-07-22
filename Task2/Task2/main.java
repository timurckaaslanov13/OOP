// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(7);
        rectangle.setWidth(4);
        double area1 = rectangle.calculateArea();
        double perimeter1 = rectangle.calculatePerimeter();
        System.out.println("Прямоугольник 1:");
        System.out.println("Ширина: " + rectangle.getWidth());
        System.out.println("Высота: " + rectangle.getHeight());
        System.out.println("Площадь: " + area1);
        System.out.println("Периметр: " + perimeter1);
        System.out.println();
    }
}