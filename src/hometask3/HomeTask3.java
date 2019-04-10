package hometask3;

public class HomeTask3 {
    public static void main(String[] args) {

        /* --------- Task 1 ---------------------*/
        Person man = new Person("Rob", 35, true);
        Person woman = new Person("Ann", 32, false);
        Person boy = new Person("Rob", 16, true);

        System.out.println(man.getName());
        System.out.println(woman.getName());

        /* --------- Task 2 ---------------------*/
        Employee employee1 = new Employee(man, 1000);
        Employee employee2 = new Employee(woman, 1000);
        Employee employee3 = new Employee(boy, 100);
        System.out.println(employee1.isSameName(employee2));
        System.out.println(employee1.isSameName(employee3));

        /* --------- Task 3 ---------------------*/
        Employee[] employees = {employee1,employee2,employee3};
        System.out.println(Salary.getSum(employees));
    }
}