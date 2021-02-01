package interfaces;

public class Bunny_09 implements Hop_09{
    public void printDetails(){
//the static interface methods are not inherited by a class implementing the interface

//                System.out.println(getJumpHeight()); //DOES NOT COMPILE
        System.out.println(Hop_09.getJumpHeight());
    }
}
