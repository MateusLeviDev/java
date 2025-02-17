package org.example.groupingBy;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomCollectorExample {

    private static final String IT = "IT";

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("Alice", "IT", 6000L),
                new Employee("Giorgian", "LAB", 8000L),
                new Employee("Levi", "IT", 8000L),
                new Employee("Mateus", "LAB", 8000L),
                new Employee("Omar", "INT", 8000L));

        //ele cria uma lista de acordo com cada department. apenas de teste. ignore
        Map<String, List<Employee>> collect = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        List<Employee> itEmployees = collect.getOrDefault("TI", List.of());

        findByDepartment(employees, IT).forEach(emp -> System.out.println(" - " + emp.getName()));
    }

    public static List<Employee> findByDepartment(List<Employee> employees, String department) {
        return employees.stream()
                .filter(employee -> employee.getDepartment().equalsIgnoreCase(department))
                .collect(Collectors.toList());
    }
}
