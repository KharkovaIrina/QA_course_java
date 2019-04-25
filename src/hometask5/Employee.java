package hometask5;

public abstract class Employee {
    private String name;
    private int baseSalary;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getBaseSalary() {
        return baseSalary;
    }

    void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    abstract double getSalary();

    @Override
     public boolean equals(Object other) {
        if(other == null){
            return false;
        }
        Employee otherEmployee = (Employee) other;
        return (this.getName().equals(otherEmployee.getName()) && this.getBaseSalary() == otherEmployee.getBaseSalary());
    }
}
