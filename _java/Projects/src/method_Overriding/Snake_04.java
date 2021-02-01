package method_Overriding;

public class Snake_04 extends Reptile_04 {
    //child method may hide or eliminate a parent method’s exception without issue
    protected boolean hasLegs() {
        return false;
    }
    //InsufficientDataException is a subclass of Exception by construction
    protected double getWeight() throws InsufficientDataException_04{
        return 2;
    }
    //vIOLATES rILE 3:  Exception is not a subclass of InsufficientDataException
//    protected double getHeight() throws Exception {  // DOES NOT COMPILE
//         return 2;
//    }
    //Violates Rule 3: child class defines a new exception that the parent class did not
//    protected int getLength() throws InsufficientDataException_04 { // DOES NOT COMPILE
//         return 10;
//    }
}
