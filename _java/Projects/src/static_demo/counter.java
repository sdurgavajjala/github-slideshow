//static (and instance) variables are automatically initialized to
// the default value for that type, which is 0 for int
package static_demo;

public class counter {
    private static int count;
    public counter() {
        count++;
    }
    public static void main(String[] args){
        counter c1 = new counter();
        counter c2 = new counter();
        counter c3 = new counter();
        System.out.println(count); // static (and instance) variables are automatically
        // initialized to the default value for that type, which is 0 for int
    }
}
