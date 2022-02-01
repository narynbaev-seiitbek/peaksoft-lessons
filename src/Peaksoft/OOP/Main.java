package Peaksoft.OOP;

public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.height = 15;
        triangle.width = 35.5;
        triangle.area();
        System.out.println("Площадь треугольника: "+triangle.result);


    }
}
