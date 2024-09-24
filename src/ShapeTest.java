
import java.util.Scanner;


    abstract class Shape {

        abstract double area();
    }

    abstract class TwoD extends Shape {
    }

    abstract class ThreeD extends Shape {

        abstract double volume();
    }

    class Square extends TwoD {

        private double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        double area() {
            return side * side;
        }
    }

    class Triangle extends TwoD {

        private double base;
        private double height;

        public Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        @Override
        double area() {
            return 0.5 * base * height;
        }
    }

    class Sphere extends ThreeD {

        private double radius;

        public Sphere(double radius) {
            this.radius = radius;
        }

        @Override
        double area() {
            return 4 * Math.PI * radius * radius;
        }

        @Override
        double volume() {
            return (4.0 / 3) * Math.PI * radius * radius * radius;
        }
    }

    class Cube extends ThreeD {

        private double side;

        public Cube(double side) {
            this.side = side;
        }

        @Override
        double area() {
            return 6 * side * side;
        }

        @Override
        double volume() {
            return side * side * side;
        }
    }

    public class ShapeTest {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Create a square
            System.out.print("Enter the side length of the square: ");
            Square square = new Square(scanner.nextDouble());

            // Create a triangle
            System.out.print("Enter the base and height of the triangle: ");
            Triangle triangle = new Triangle(scanner.nextDouble(), scanner.nextDouble());

            // Create a sphere
            System.out.print("Enter the radius of the sphere: ");
            Sphere sphere = new Sphere(scanner.nextDouble());

            // Create a cube
            System.out.print("Enter the side length of the cube: ");
            Cube cube = new Cube(scanner.nextDouble());

            // Calculate and display areas and volumes
            System.out.println("Area of Square: " + square.area());
            System.out.println("Area of Triangle: " + triangle.area());
            System.out.println("Surface Area of Sphere: " + sphere.area());
            System.out.println("Volume of Sphere: " + sphere.volume());
            System.out.println("Surface Area of Cube: " + cube.area());
            System.out.println("Volume of Cube: " + cube.volume());

            scanner.close();
        }
    }


