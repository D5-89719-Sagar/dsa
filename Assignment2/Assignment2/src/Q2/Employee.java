package Q2;


class Employee {
    int empId;
    String name;
    String department;

    Employee(int empId, String name, String department) {
        this.empId = empId;
        this.name = name;
        this.department = department;
    }

    void display() {
        System.out.println("EmpId: " + empId + ", Name: " + name + ", Department: " + department);
    }
}

