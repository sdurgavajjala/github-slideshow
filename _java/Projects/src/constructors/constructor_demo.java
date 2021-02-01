package constructors;

public class constructor_demo {
    public constructor_demo(){
        System.out.println("You are inside a constructor");
    }
        //Java is case sensitive - class name doesn't match - not a constructor
        //It is missing a return type and doesn't compile
//    public Constructor_demo(){}

    //Not a constructor since it has the return type
    public void constructor_demo(){

    }
}

class constructor_ex1{
    private String color;
    public constructor_ex1(String color){
        this.color = color; // Using this.name tells Java you want the instance variable.
    }
}

class constructor_ex2{
    private String color;
    private int height;
    private int length; //instance variable has the default value 0
    public constructor_ex2(int length, int theHeight){
        length = this.length; //0 is assigned to method parameter length
        height = theHeight; // fine because a different name
        this.color = "white";  // fine, but redundant
    }
    public static void main(String[] args){
        constructor_ex2 ex = new constructor_ex2(1,2);
        System.out.println(ex.length+" "+ex.height+" "+ex.color);
    }
}

class default_constructor{
    public static void main(String[] args){
        default_constructor ex = new default_constructor();  // Calls default constructor
    }
}
class Rabbit1 { }

class Rabbit2 {
    public Rabbit2() { }
}
class Rabbit3 {
    public Rabbit3(boolean b) { }
}
class Rabbit4 {
    private Rabbit4() { }
}

class RabbitsMultiply {
    public static void main(String[] args){
        Rabbit1 r1 = new Rabbit1(); // calls the generated default no-argument constructor
        Rabbit2 r2 = new Rabbit2(); //calls the user provided constructors
        Rabbit3 r3 = new Rabbit3(true); //calls the user provided constructors
//        Rabbit4 r4 = new Rabbit4(); // DOES NOT COMPILE Rabbit4 made the constructor private so
                                        // that other classes could not call it.

    }
}

//Overloaded Constructors
class Hamster {
    private String color;
    private int weight;
    public Hamster(int weight){ // first constructor
        this(weight,"brown");
        this.weight = weight;
        color = "brown";
        //Constructors cannot be called just like any otehr methods. It has to start with new keyword
//        Hamster(weight,"brown");
        new Hamster(weight, "brown"); //compiles but does not do what we want.
        // This object is ignored when calling the constructor.

        //You need to use "this" keyword to set the weight and color on the same object we are trying to
        //instantiate in the first place - as shown below
    }

    public Hamster(int weight, String color){  // second constructor, but has duplicate code
        this.weight = weight;
        this.color = color;
    }
}

//Constructor Chaining
class Mouse {
    private int numTeeth;
    private int numWhiskers;
    private int weight;
    public Mouse(int weight){
        this(weight, 16); // calls constructor with 2 parameters
    }

    public Mouse(int weight, int numTeeth){
        this(weight, numTeeth, 6); // calls constructor with 3 parameters
    }

    public Mouse(int weight, int numTeeth, int numWhiskers){
        this.weight = weight;
        this.numTeeth = numTeeth;
        this.numWhiskers = numWhiskers;
    }
    public void print(){
        System.out.println(weight + " " + numTeeth + " " + numWhiskers);
    }
    public static void main(String[] args){
        Mouse mouse = new Mouse(15);
        mouse.print();
    }
}

//final variables
class MouseHouse {
    private final int volume;
    private final String name = "The Mouse House";
    public MouseHouse(int length, int width, int height){
        volume = length * width * height;
    }

}

//Order of Initialization
class InitializationOrderSimple {
    //instance variable declarations and instance initializers
    private String name = "Torchie";
    { System.out.println(name); }

    private static int COUNT = 0;
    // static variable declarations and static initializers
    static {
        System.out.println(COUNT);
    }
    // static variable declarations and static initializers
    static{
        COUNT += 10;
        System.out.println(COUNT);
    }

    //Constructor
    public InitializationOrderSimple(){
        System.out.println("constructor");
    }
}

class CallInitializationOrderSimple {
    public static void main(String[] args){
        InitializationOrderSimple init = new InitializationOrderSimple();
    }
}

//Order of Initializationprivate String name = "Torchie";
class InitializationOrder {

    // instance variables and instance initializers - Priority 2
    private String name = "Torchie";
    { System.out.println(name); }

    //static variables and static initializers - Priority 1
    private static int COUNT = 0;
    static {
        System.out.println(COUNT);
    }

    {
        COUNT++;
        System.out.println(COUNT);
    }

    //constructor - Priority 3
    public InitializationOrder(){
        System.out.println("constructor");
    }

    public static void main(String[] args){
        System.out.println("read to construct");
        new InitializationOrder();
    }
}

//Order of Initialization
class YetMoreInitializationOrder {
    //static blocks - priority 1
    static {
        add(2);
    }

    static void add(int num) {
        System.out.print(num + " ");
    }

    //Constructor -Priority 3
    YetMoreInitializationOrder(){
        add(5);
    }

    //static blocks - priority 1
    static{
        add(4);
    }

    //instance variables and instance initializers - Priority 2
    { add(6); }

    //static blocks - priority 1
    static {
        new YetMoreInitializationOrder();
    }

    //instance variables and instance initializers - Priority 2
    { add(8); }
    public static void main(String[] args) {

    }
}