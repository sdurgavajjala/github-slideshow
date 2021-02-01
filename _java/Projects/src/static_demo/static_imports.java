package java_Examples;
import java.util.List;
import static java.util.Arrays.asList; // static import

class static_demo {
    private static final int NUM_SECONDS_PER_HOUR;
    //Static Initialization
    static {
        int numSecondsPerMinute = 60;
        int numMinutesPerHour = 60;
        NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;
    }
}

class static_ex1{
    private static int one;
    private static final int two;
    private static final int three = 3;
//    private static final int four;
    static {
        one=1;
        two=2;
//        three=3;
//        two=4;
    }
}

class StaticImports{
    public static void main(String[] args) {
        //we are specifically importing the asList method
        //any time we refer to asList in the class, it will call Arrays.asList()
        List<String> list = asList("one", "two"); // no Arrays.
    }

    // If we create the method with the same name (asList) - Java would give the
    // preference to the created method
//    static void asList(){
//        System.out.println("Duplicate method");
//    }
}
