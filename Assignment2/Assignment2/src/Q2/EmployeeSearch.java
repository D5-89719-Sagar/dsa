package Q2;

import java.util.Scanner;

public class EmployeeSearch {
	 // Search by empId
    public static Employee searchById(Employee[] employees, int id) {
        for (Employee emp : employees) {
            if (emp.empId == id) {
                return emp;
            }
        }
        return null;
    }

    // Search by name
    public static Employee searchByName(Employee[] employees, String name) {
        for (Employee emp : employees) {
            if (emp.name.equalsIgnoreCase(name)) {
                return emp;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Employee[] employees = {
            new Employee(101, "Alice", "HR"),
            new Employee(102, "Bob", "IT"),
            new Employee(103, "Charlie", "Finance"),
            new Employee(104, "David", "IT")
        };

        Scanner scanner = new Scanner(System.in);

        // Search by ID
        System.out.print("Enter employee ID to search: ");
        int searchId = scanner.nextInt();
        Employee empById = searchById(employees, searchId);
        if (empById != null) {
            empById.display();
        } else {
            System.out.println("Employee with ID " + searchId + " not found.");
        }

        // Search by Name
        System.out.print("Enter employee name to search: ");
        scanner.nextLine(); // consume leftover newline
        String searchName = scanner.nextLine();
        Employee empByName = searchByName(employees, searchName);
        if (empByName != null) {
            empByName.display();
        } else {
            System.out.println("Employee with name '" + searchName + "' not found.");
        }

        scanner.close();
    }
}
