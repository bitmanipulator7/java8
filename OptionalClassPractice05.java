import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class OptionalClassPractice05 {
    public static void main(String[] args) {
        Employee0211 emp1 = new Employee0211("John Doe", 38);
        Employee0211 emp2 = new Employee0211("Jane Doe", 37);
        Employee0211 emp3 = new Employee0211("Jamie Doe", 28);
        Employee0211 emp4 = new Employee0211("Jeremy Doe", 25);
        Employee0211 emp5 = new Employee0211("Jenna Doe", 24);

        List<Employee0211> employee0211List = new ArrayList<>();
        employee0211List.add(emp1);
        employee0211List.add(emp2);
        employee0211List.add(emp3);
        employee0211List.add(emp4);
        employee0211List.add(emp5);

        Employee0211 emp = findEmployee(employee0211List, "Jane Doe", 37);
        System.out.println(emp.toString());
    }

    public static Employee0211 findEmployee(List<Employee0211> empList, String name, int age) {
        for ( Employee0211 e: empList ) {
            if ( e.getEmployeeName().equalsIgnoreCase(name) && e.getEmployeeAge() == age ) {
                return e;
            }
        }
        return null;
    }
}

@Setter
@Getter
class Employee0211 {
    private String employeeName;
    private int employeeAge;

    public Employee0211(String employeeName, int employeeAge) {
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
    }
}
