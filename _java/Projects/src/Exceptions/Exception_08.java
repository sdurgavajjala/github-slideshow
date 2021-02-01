package Exceptions;

//Case 1: If The SuperClass doesn’t declare an exception and subclass declare checked exception
//Case 2: If SuperClass doesn’t declare any exception and SubClass declare Unchecked exception
//Case 3: If SuperClass declares an exception and SubClass declares exceptions other than the child exception of the SuperClass declared Exception
//Case 4: If SuperClass declares an exception and SubClass declares an child exception of the SuperClass declared Exception
//Case 5: If SuperClass declares an exception and SubClass declares without exception

import java.io.IOException;

public class Exception_08 {
    //Case 1&2
    public void method(){
        System.out.println("Super Class");
    }

    //Case 3,4:
    public void method1() throws RuntimeException{
        System.out.println("Super Class");
    }

    //Case 5:
    public void method2() throws IOException{

    }
}
