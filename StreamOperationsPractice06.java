import java.util.ArrayList;
import java.util.List;

public class StreamOperationsPractice06 {
    public static void main(String[] args) {
        Employee0218 emp1 = new Employee0218("John Doe", 39);
        Employee0218 emp2 = new Employee0218("Jane Doe", 37);
        Employee0218 emp3 = new Employee0218("Jason Doe", 24);
        Employee0218 emp4 = new Employee0218("Jeremy Doe", 28);

        List<Employee0218> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);

        // Suppose we need to filter employees whose age is greater than 30
        List<String> filteredEmployees = new ArrayList<>();
        for(Employee0218 e:employeeList) {
            if (e.getAge() > 30) {
                filteredEmployees.add(e.getName());
            }
        }
        // the above is a conventional way of filtering
        for ( String employeeName: filteredEmployees ) {
            System.out.println(employeeName);
        }

        // Suppose we want to do the same using Java 8 Stream
        List<String> filteredEmployeesUsingStream = employeeList.stream()
                .filter(e -> e.getAge() > 30)
                .map(Employee0218::getName)
                .toList();
        for ( String employeeName: filteredEmployeesUsingStream ) {
            System.out.println(employeeName);
        }
    }
}

class Employee0218 {
    private String name;
    private int age;

    public Employee0218(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
