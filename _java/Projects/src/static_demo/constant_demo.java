package static_demo;

import java.util.ArrayList;

public class constant_demo {
    private static final int NUM_BUCKETS = 45;
    private static final ArrayList<String> values = new ArrayList<>();
    public static void main(String[] args){
//        NUM_BUCKETS = 5;  // DOES NOT COMPILE
        values.add("changed");
        //values is a reference variable. We are allowed to call methods on reference variables
        //All the compiler can do is check that we don’t try to reassign the final values to ppint to a different object
    }
}
