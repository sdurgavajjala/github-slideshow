package Exceptions;

public class Exception_02 {
    public void visitPorcupine(){
        try {
            seeAnimal();
        } catch (AnimalsOutForAWalk_02 e) {// first catch block
            System.out.print("try back later");
        } catch (ExhibitClosed e) {// second catch block
            System. out .print("not today");
        }
    }

    public void seeAnimal(){

    }

    public void visitMonkeys(){
        try {
            seeAnimal();
        } catch (ExhibitClosedForLunch e) {// subclass exception
             System. out .print("try back later");
             } catch (ExhibitClosed e) {// superclass exception
             System. out .print("not today");
        }

//        The below code doesn't compile - Unreachable code for second exception
//        try {
//            seeAnimal();
//        } catch (ExhibitClosed e) {// subclass exception
//            System. out .print("try back later");
//        } catch (ExhibitClosedForLunch e) {// superclass exception
//            System. out .print("not today");
//        }
    }
}
