package D_Methods.Test;

import D_Methods.Domain.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Mateus");
        employee.setAge(23);
        employee.setSalary(new double[]{2.500, 3.800, 4.900});

        System.out.println(employee.toString());
        System.out.println(employee.calculateSalaryAverage());
    }
}
