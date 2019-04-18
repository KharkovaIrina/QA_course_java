package hometask4;

public class Manager extends Employee {
     Manager(int count) {
        this.count = count;
    }

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
