package hometask5;

public class Director extends Employee{
    private int numberOfSubordinates;

    Director(String name, int baseSalary, int numberOfSubordinates){
        this.setName(name);
        this.setBaseSalary(baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary(){
        if (numberOfSubordinates == 0){
            return this.getBaseSalary();
        }
        return this.getBaseSalary() * this.getNumberOfSubordinates() * 0.09;
    }

    @Override
    public boolean equals(Object other){
        if(!super.equals(other)){
            return false;
        }
        if(!(other instanceof Director)){
            return false;
        }
        Director manager = (Director) other;
        return (this.getNumberOfSubordinates() == manager.getNumberOfSubordinates());
    }
}
