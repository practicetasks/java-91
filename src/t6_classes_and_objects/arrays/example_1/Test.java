package t6_classes_and_objects.arrays.example_1;

public class Test {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new Employee("Steve", "CEO", 46);
        employees[1] = new Employee("Bob", "Developer", 33);

        Employee youngest = new Employee();

        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }

            if (youngest.age == 0 || employee.age < youngest.age) {
                youngest = employee;
            }
        }

        System.out.println(youngest);


//        String name = "";
//        int minAge = 0;
//
//        for (Employee employee : employees) {
//            if (employee == null) {
//                continue;
//            }
//
//            if (minAge == 0 || employee.age < minAge) {
//                minAge = employee.age;
//                name = employee.name;
//            }
//        }
//        System.out.println(name + " " +minAge);
    }
}
