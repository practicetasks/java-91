package t6_classes_and_objects.arrays.example_1;

public class Company {
    String name;
    Employee[] employees;

    Company(String newName, int size) {
        name = newName;
        employees = new Employee[size];
    }

    void add(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return;
            }
        }
    }

    void displayEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.name);
            }
        }
    }
}
