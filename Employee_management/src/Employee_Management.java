import java.util.*;
import java.util.stream.Collectors;

public class Employee_Management {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee(1, "Rahul", "IT", 100000, true),
                new Employee(2, "Deva", "IT", 200000, false),
                new Employee(3, "Dilak", "PlSql", 600000, true),
                new Employee(4, "Prithvi", "Devops", 1000000, false),
                new Employee(5, "Naveen", "IT", 2000000, true));


        //Task 1 – List all active employees in the "IT" department
        List<Employee> activeIt = employees.stream()
                .filter(e->e.isActive()&&e.getDepartment().equalsIgnoreCase("IT"))
                .collect(Collectors.toList());
                System.out.println("Active IT:"+activeIt);
        //2. Find employees with salary > 50,000 and group them by departme
        Map<String,List<Employee>> higherSalaryBydept=employees.stream().
                filter(e->e.getSalary()>500000).
                collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println("Higher Salary bydept:"+higherSalaryBydept);
        //Find the highest paid employee in each department (use Optional safely).
        Map<String,Optional<Employee>> highestpaidemployee=employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        System.out.println("Highest Paid Salary bydept:"+highestpaidemployee);
        highestpaidemployee.forEach((dept,empout)->System.out.println(dept+"->"+empout.orElse(null)));
        //Count employees per department.
        Map<String,Long> count=employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        //Generate a list of employee names for HR reports.
        List<String> empoyeelist=employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println("Employee Name:"+empoyeelist);
    }
}
