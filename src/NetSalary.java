import java.util.Scanner;

// Employee.java
class Netsalary {
    private int empId;
    private String name;
    private String designation;
    private String department;

    public Netsalary(int empId, String name, String designation, String department) {
        this.empId = empId;
        this.name = name;
        this.designation = designation;
        this.department = department;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public String getDepartment() {
        return department;
    }
}

// Salary.java
class Salary extends Netsalary {
    private double basic;

    public Salary(int empId, String name, String designation, String department, double basic) {
        super(empId, name, designation, department);
        this.basic = basic;
    }

    public double computeNetSalary() {
        double hra = 1250;
        double pf = 0.12 * basic;
        double da = 1.1 * basic;
        double allowance = 0.35 * basic;
        double netSalary = basic + hra + da + allowance - pf;
        return netSalary;
    }

    public void displaySalary() {
        System.out.println("Employee ID: " + getEmpId());
        System.out.println("Name: " + getName());
        System.out.println("Designation: " + getDesignation());
        System.out.println("Department: " + getDepartment());
        System.out.println("Basic Salary: " + basic);
        System.out.println("Net Salary: " + computeNetSalary());
    }
}

// Main.java
 class main  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Designation: ");
        String designation = scanner.nextLine();

        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basic = scanner.nextDouble();

        Salary employee = new Salary(empId, name, designation, department, basic);
        employee.displaySalary();

        
    }
}
