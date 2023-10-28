package D_Methods.Domain;

import java.util.Arrays;

public class Employee {
    private String name;
    private int age;
    private double[] salary;

    public Employee(String name, int age, double[] salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {
    }

    public double calculateSalaryAverage() { // "mediaSalarios" translated to "calculateSalaryAverage"
        if (salary == null || salary.length == 0) {
            return 0.0; // Handle the case of an empty array or null array
        }

        double totalSalary = 0;
        for (double currentSalary : salary) {
            totalSalary += currentSalary;
        }
        return totalSalary / salary.length;
    }

    public String getName() { // "getNome" translated to "getName"
        return name;
    }

    public void setName(String name) { // "setNome" translated to "setName"
        this.name = name;
    }

    public int getAge() { // "getIdade" translated to "getAge"
        return age;
    }

    public void setAge(int age) { // "setIdade" translated to "setAge"
        this.age = age;
    }

    public double[] getSalary() { // "getSalario" translated to "getSalary"
        return salary;
    }

    public void setSalary(double[] salary) { // "setSalario" translated to "setSalary"
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + Arrays.toString(salary) +
                '}';
    }
}