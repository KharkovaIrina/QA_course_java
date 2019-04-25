package hometask5;

import java.util.ArrayList;
import java.util.List;

public class EmployeeHelper {

    public static Employee search(Employee[] employees, String name) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().equals(name)) {
                return employees[i];
            }
        }
        return null;
    }

    public static List<Employee> searchByFragment(Employee[] employees, String fragment) {
        List<Employee> array = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getName().contains(fragment)) {
                array.add(employee);
            }
        }
        return array;
    }

    public static double budget(Employee[] employees) {
        double sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }

    public static double lowestSalary(Employee[] employees) {
        double lowest = employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() < lowest) {
                lowest = employees[i].getSalary();
            }
        }
        return lowest;
    }

    public static double highestSalary(Employee[] employees) {
        double highest = employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() > highest) {
                highest = employees[i].getSalary();
            }
        }
        return highest;
    }

    public static int lowestSubCount(Manager[] managers) {
        int lowestSubCount = managers[0].getNumberOfSubordinates();
        for (int i = 1; i < managers.length; i++) {
            if (managers[i].getNumberOfSubordinates() < lowestSubCount) {
                lowestSubCount = managers[i].getNumberOfSubordinates();
            }
        }
        return lowestSubCount;
    }

    public static int highestSubCount(Manager[] managers) {
        int highestSubCount = managers[0].getNumberOfSubordinates();
        for (int i = 1; i < managers.length; i++) {
            if (managers[i].getNumberOfSubordinates() > highestSubCount) {
                highestSubCount = managers[i].getNumberOfSubordinates();
            }
        }
        return highestSubCount;
    }

    public static double lowestDifference(Manager[] managers) {
        double lowest = managers[0].getSalary() - managers[0].getBaseSalary();
        double difference = 0;
        for (int i = 1; i < managers.length; i++) {
            difference = managers[i].getSalary() - managers[i].getBaseSalary();
            if (difference < lowest) {
                lowest = difference;
            }
        }
        return lowest;
    }

    public static double highestDifference(Manager[] managers) {
        double highest = managers[0].getSalary() - managers[0].getBaseSalary();
        double difference = 0;
        for (int i = 1; i < managers.length; i++) {
            difference = managers[i].getSalary() - managers[i].getBaseSalary();
            if (difference > highest) {
                highest = difference;
            }
        }
        return highest;
    }
}
