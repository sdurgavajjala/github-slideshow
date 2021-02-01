package polymorphism;

public class Lemur extends Primate implements HasTail{
    public boolean isTailStriped(){
        return false;
    }
    public int age = 10;
    // The ability of an instance of Lemur to be passed as an instance of an interface it implements, HasTail,
    // as well as an instance of one of its superclasses, Primate, is the nature of polymorphism
    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);
        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());
        //the reference hasTail has direct access only to methods defined with the HasTail interface;
        // therefore, it doesn’t know the variable age is part of the object
//        System.out.println(hasTail.age);  // DOES NOT COMPILE
        Primate primate = lemur;
        System.out.println(primate.hasHair());
//        the reference primate has access only to methods defined in the Primate class,
//        and it doesn’t have direct access to the isTailStriped() method
//                System.out.println(primate.isTailStriped());  // DOES NOT COMPILE


    }
}
