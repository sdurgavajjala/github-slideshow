package method_Overriding;

public class wolf extends Canine_01 {
    public double getAverageWeight() {
        return super.getAverageWeight()+20;
//        return getAverageWeight()+20;  // INFINITE LOOP - recursive function
    }
    public static void main(String[] args) {
        System.out.println(new Canine_01().getAverageWeight());
        System.out.println(new wolf().getAverageWeight());
    }
}
