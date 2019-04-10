package hometask3;

public class Person {

    String name;
    int age;
    boolean isMale;

    Person(String name, int age, boolean isMale){
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }
    Person(){}

    public String getName() {
        if (isMale == true) {
            return "Mr. " + name;
        }
        return "Ms. " + name;
    }
}
