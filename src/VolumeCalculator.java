
import java.util.Scanner;


public class VolumeCalculator {
    // Method to read data for sphere and cylinder
    public void readdata() {
        Scanner scanner = new Scanner(System.in);

        // Sphere data
        System.out.print("Enter the radius of the sphere: ");
        double sphereRadius = scanner.nextDouble();

        // Cylinder data
        System.out.print("Enter the radius of the cylinder: ");
        double cylinderRadius = scanner.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double cylinderHeight = scanner.nextDouble();

        // Display volumes
        displayVolume(sphereRadius, cylinderRadius, cylinderHeight);
    }

    // Method to display volume of sphere and cylinder
    public void displayVolume(double sphereRadius, double cylinderRadius, double cylinderHeight) {
        // Calculate volume of sphere
        double sphereVolume = (4.0 / 3.0) * Math.PI * Math.pow(sphereRadius, 3);
        System.out.println("Volume of the sphere: " + sphereVolume);

        // Calculate volume of cylinder
        double cylinderVolume = Math.PI * Math.pow(cylinderRadius, 2) * cylinderHeight;
        System.out.println("Volume of the cylinder: " + cylinderVolume);
    }

    public static void main(String[] args) {
        VolumeCalculator calculator = new VolumeCalculator();
        calculator.readdata();
    }
}

