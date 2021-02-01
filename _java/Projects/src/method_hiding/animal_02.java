package method_hiding;

public class animal_02 {
    public static boolean isBiped() {
//     public  boolean isBiped() {
        return false;
    }

    public void getAnimalDescription() {

        System.out.println("Animal walks on two legs: "+isBiped());
    }
}
