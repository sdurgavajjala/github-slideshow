package polymorphism;

public class Capybara_03 extends Rodent_03{
    public static void main(String[] args) {
        Rodent_03 rodent = new Rodent_03();
//        Rodent_03 rodent = new Capybara_03();
        // the object being referenced is not an instance of the Capybara class
//        Capybara_03 capybara = (Capybara_03)rodent; // Throws ClassCastException at runtime

        //ClassCastException can be avoided with instanceOf method
        if (rodent instanceof Capybara_03){
            Capybara_03 capybara_01 = (Capybara_03)rodent;
        }

//        Rodent_03 rodent = new Capybara_03();
//        Capybara_03 capybara = (Capybara_03)rodent;


    }
}
