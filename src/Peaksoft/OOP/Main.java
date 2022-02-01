package Peaksoft.OOP;

public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.a = 15;
        triangle.b = 35.5;
        triangle.c = 20;
        System.out.println("Площадь треугольника: "+triangle.area());
    }
}
