package method_Overriding;

public class Reptile_04 {
    protected boolean hasLegs() throws InsufficientDataException_04 {
        throw new InsufficientDataException_04();
    }

    protected double getWeight() throws Exception {
        return 2;
    }


    protected double getHeight() throws InsufficientDataException_04 {
        return 2;
    }

    protected int getLength() {
        return 10;
    }

}