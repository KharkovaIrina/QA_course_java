package hometask5;

public class HomeTask5 {
    public static void main(String[] args) {
        /*---------- Task1 ----------*/
        Worker dev = new Worker("Robby", 10);
        Manager lead = new Manager("Rob", 50, 100);
        Manager scrumMaster = new Manager("Robby", 10, 0);
        Director ceo = new Director("Robert", 100, 500);

        /*---------- Task2 ----------*/
        System.out.println("worker: " + dev.getName() + ", " + dev.getSalary());
        System.out.println("manger: " + lead.getName() + ", " + lead.getBaseSalary() + ", " + lead.getNumberOfSubordinates() + ", " + lead.getSalary());
        System.out.println("director: " + ceo.getName() + ", " + lead.getBaseSalary() + ", " + ceo.getNumberOfSubordinates() + ", " + ceo.getSalary());

        System.out.println("Is developer also a team lead? " + dev.equals(lead));
        System.out.println("Is developer also a scrum master? " + lead.equals(scrumMaster));

        /*---------- Task3 ----------*/
        Employee[] employees = {dev, lead, ceo};
        Manager[] managers = {scrumMaster, lead};
        System.out.println("search: " + EmployeeHelper.search(employees, "Robert").getName());
        System.out.println("searchByFragment: ");
        for (Employee e : EmployeeHelper.searchByFragment(employees, "Rob")) {
            System.out.println(e.getName());
        }
        System.out.println("budget: " + EmployeeHelper.budget(employees));
        System.out.println("lowestSalary: " + EmployeeHelper.lowestSalary(employees));
        System.out.println("highestSalary: " + EmployeeHelper.highestSalary(employees));
        System.out.println("lowestSubCount: " + EmployeeHelper.lowestSubCount(managers));
        System.out.println("highestSubCount: " + EmployeeHelper.highestSubCount(managers));
        System.out.println("lowestDifference: " + EmployeeHelper.lowestDifference(managers));
        System.out.println("highestDifference: " + EmployeeHelper.highestDifference(managers));
    }
}