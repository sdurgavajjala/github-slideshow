package Exceptions;

public class Exception_04 {
    int NumberEggs;
    String name;
    //ExceptionInInitializerError
//    static {
//        int[] countsOfMoose = new int[3];
//        int num = countsOfMoose[-1];
//    }
    public static void main(String[] args) {
        //Arithematic Exception
//        int num = 11/0;
//        System.out.println(num);

        //ArrayIndexOutOfBound Exception
//        int[] countsOfMoose = new int[3];
//        System.out.println(countsOfMoose[-1]);

//        int total = 0;
//        int[] countsOfMoose = new int[3];
//        for (int i = 0; i <= countsOfMoose.length; i++)
//            total += countsOfMoose[i];

        //CLass Cast Exception
//        String type = "moose";
//        Object obj = type;
//        Integer number = (Integer) obj;

        //Illegal Argument Exception
        Exception_04 ex = new Exception_04();
//        ex.setNumberEggs(-2);

        //NullPointerException
//        ex.printLength();

        //NumberFormatException
//        Integer.parseInt("abc");

    }

    //Illegal Argument Exception
    public void setNumberEggs(int NumberEggs) {//setter
        if (NumberEggs < 0)
            throw new IllegalArgumentException( "# eggs must not be negative");
        this.NumberEggs = NumberEggs;
    }

    //NullPointerException
    public void printLength() throws NullPointerException {
        System.out.println(name.length());
    }

    //StackOverflowError
    public static void doNotCodeThis(int num) {
        doNotCodeThis(1);
    }

}

