 
import java.util.Scanner;


public class NetSalary {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for basic salary
        System.out.print("Enter the basic salary: ");
        double basicSalary = scanner.nextDouble();

        // Input for allowances
        System.out.print("Enter the house rent allowance (HRA): ");
        double hra = scanner.nextDouble();
        System.out.print("Enter the special allowance: ");
        double specialAllowance = scanner.nextDouble();

        // Input for deductions
        System.out.print("Enter the provident fund (PF) deduction: ");
        double pf = scanner.nextDouble();
        System.out.print("Enter the tax deduction: ");
        double tax = scanner.nextDouble();

        // Calculate total earnings
        double totalEarnings = basicSalary + hra + specialAllowance;

        // Calculate total deductions
        double totalDeductions = pf + tax;

        // Calculate net salary
        double netSalary = totalEarnings - totalDeductions;

        // Display net salary
        System.out.println("Net Salary: " + netSalary);

        // Close the scanner
        scanner.close();
    }
}
