package method_hiding;

public class kangarro_02 extends animal_02{
    public static boolean isBiped() {
        //Overridden - it is replaced at runtime in the parent class with the call to the child class’s method
//        public  boolean isBiped() {
        return true;
    }
    public void getKangarooDescription() {
        System.out.println("Kangaroo hops on two legs: "+isBiped());
    }

    public static void main(String[] args) {
        kangarro_02 joey = new kangarro_02();
        joey.getAnimalDescription();
        joey.getKangarooDescription();
    }
}
