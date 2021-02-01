package static_demo;

public class static_ex {
    private String name = "Static class";
    public static void first() {  }
    public static void second() {  }
    public void third() {
        System.out.println(name);
    }
    public static void main(String args[]){
        first();
        second();


//        third(); //referring to nonstatic name
//        new static_ex().third(); // alternate soultion to call third();
        // Only an instance method can call another instance method on the same class
        // without using a reference variable, because instance methods do require an object
    }
}
