package method_Overriding;

public class bird_02 {
    public void fly() {
        System.out.println("Bird is flying");
    }

    public void eat(int food) {
        System.out.println("Bird is eating "+food+" units of food");
    }

    public final boolean hasFeathers() {
        return true;
    }
}
