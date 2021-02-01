package abstract_concept;

public abstract class Animal_01 {
    protected int age;

    public void eat() {

        System.out.println("Animal is eating");
    }

    public abstract String getName(); //No body

    public class Swan extends Animal_01 {
        public String getName() {

            return "Swan";
        }
    }
}
