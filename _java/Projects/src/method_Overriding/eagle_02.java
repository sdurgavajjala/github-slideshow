package method_Overriding;

public class eagle_02 extends bird_02{
    //overloaded method - the return type can be changed from void to int without issue.
    public int fly(int height) {
        System.out.println("Bird is flying at "+height+" meters");
        return height;
    }
    //Overridden method - the return type of the method in eagle_02 must
    // be a subclass of the return type of the method in bird_02
//    public int eat(int food) { // DOES NOT COMPILE
//         System.out.println("Bird is eating "+food+" units of food");
//         return food;
//    }
}
