package Exceptions;

public class Exception_07 {
    public static void main(String[] args) {
        try{
            hop();
        }catch (Exception e){
            // Java prints out by default: the exception type and message
            System.out.println(e);
            //Prints just the message
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    private static void hop(){
        throw new RuntimeException("cannot hop");
    }
}
