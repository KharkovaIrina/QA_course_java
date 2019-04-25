package hometask5;

public class Worker extends Employee{

    Worker(String name, int baseSalary){
        this.setName(name);
        this.setBaseSalary(baseSalary);
    }

    @Override
    public double getSalary(){
      return this.getBaseSalary();
    }
}