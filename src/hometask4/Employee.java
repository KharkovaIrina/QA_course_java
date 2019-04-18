package hometask4;

public class Employee {
    private String name;
    private int age;
    private boolean isMale;
    private int dayEarning;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public int getDayEarning() {
        return dayEarning;
    }

    public void setDayEarning(int dayEarning) {
        this.dayEarning = dayEarning;
    }

    public int getSalary(DateUtils.Month[] monthArray) {
        int salary = 0;
        for (DateUtils.Month month : monthArray) {
            salary = salary + this.dayEarning * month.workDays;
        }
        return salary;
    }
}
