package hometask3;

public class Salary {
    public static int getSum(Employee[] employeeArray){
        int sum = 0;
        for (Employee employee: employeeArray) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }
}
