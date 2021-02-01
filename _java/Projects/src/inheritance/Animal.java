package inheritance;

public class Animal {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Animal(int age) {
        super();
        this.age = age;
    }

    public Animal(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }
}
