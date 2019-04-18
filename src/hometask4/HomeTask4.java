package hometask4;

public class HomeTask4 {
    public static void main(String[] args) {
        /* ------ Задание 1 ------ */
        for (DateUtils.Month month : DateUtils.getMonths()) {
            System.out.println(month.name);
        }
        /* ------ Задание 2 ------ */
        Employee man = new Employee();
        man.setName("Bob");
        man.setAge(30);
        man.setMale(true);
        man.setDayEarning(50);
        System.out.println(man.getName());
        DateUtils.Month[] workYear = DateUtils.getMonths();
        DateUtils.Month june = new DateUtils.Month("June", 30, 20);
        DateUtils.Month july = new DateUtils.Month("July", 31, 22);
        DateUtils.Month[] workSummer = {june,july};
        int salaryYear = man.getSalary(workYear);
        int salarySummer = man.getSalary(workSummer);
        System.out.println(salaryYear);
        System.out.println(salarySummer);

        Manager manager = new Manager(5);
        manager.setDayEarning(100);
        System.out.println(manager.getSalary(workYear));
    }
}