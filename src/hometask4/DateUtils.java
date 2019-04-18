package hometask4;

public class DateUtils {
    public static class Month {
        String name;
        int days;
        int workDays;

        Month(String name, int days, int workDays) {
            this.name = name;
            this.days = days;
            this.workDays = workDays;
        }
    }

    public static Month[] getMonths() {
        Month january = new Month("January", 31, 21);
        Month february = new Month("February", 28, 19);
        Month march = new Month("March", 31, 21);
        Month april = new Month("April", 30, 22);
        Month may = new Month("May", 31, 22);
        Month june = new Month("June", 30, 20);
        Month july = new Month("July", 31, 22);
        Month august = new Month("August", 31, 22);
        Month september = new Month("September", 30, 20);
        Month october = new Month("October", 31, 22);
        Month november = new Month("November", 30, 19);
        Month december = new Month("December", 31, 21);
        return new Month[]{january,february,march,april,may,june,july,august,september,october,november,december};
    }
}

