package Exceptions;

public class Bunny {
    //Checked exceptions must be handled or declared
    public static void main(String[] args) {
//        eatCarrot(); //DOES NOT COMPILE - Need to add Exception to the method signature
        //Or handle the exception
//        try{
//            eatCarrot();
//        }catch (Exception_05 e){
//            System.out.println("Sad rabbit");
//        }

    }
    //The below method didn’t actually throw an exception; it just declared that it could.
    // This is enough for the compiler to require the caller to handle or declare the exception.
    private static void eatCarrot() throws Exception_05{

    }
    //UnCommenting the below method makes the catch block not to compile.
    //Becuase the below methd cannot raise a checked exception and the catch block can never be reached
//    private static void eatCarrot(){}
}
