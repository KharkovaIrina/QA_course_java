package hometask3;

public class Employee extends Person {
    int salary;

    Employee(Person person, int salary) {
        this.name = person.name;
        this.age = person.age;
        this.isMale = person.isMale;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isSameName(Employee employee) {
        return (this.getName().equals(employee.getName()));
    }
}