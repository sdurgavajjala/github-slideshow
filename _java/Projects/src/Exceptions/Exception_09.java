package Exceptions;

import java.io.IOException;

public class Exception_09 extends Exception_08{
    //Case 1
//    public void method() throws IOException{ //Declares Checked Exception
//        System.out.println("Sub Class");
//    }

    //Case 2:
//    public void method() throws ArithmeticException{ //declaring Unchecked Exception ArithmeticException
//        System.out.println("Sub CLass");
//    }

    //Case 3:
//    public void method1() throws Exception{ //Declaring an Exception that is not a child exception of RunTimeException
//        System.out.println("Sub Class");
//    }

    //Case 4:
    public void method1() throws ArithmeticException{ //Arithematic Exception is a child Exception of RunTime Exception
        System.out.println("Sub Class");
    }

    //Case 5:
    public void method2(){
        System.out.println("Sub Class");
    }
}
