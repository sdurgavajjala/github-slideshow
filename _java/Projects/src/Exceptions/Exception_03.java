package Exceptions;

import java.io.IOException;

public class Exception_03 {
    public String Exceptions(){
        String result = "";
        String v = null;
        try{
            try{
                result += "before";
                v.length(); //Throws Null Pointer exception
                result += "after";
            }  catch (NullPointerException e){
                result += "catch";
                throw new RuntimeException();
            } finally {
                result += "finally";
                throw new Exception();
            }

        }catch(Exception e) {
            result += "done";
        }
        return result;
    }

    public static void main(String[] args) {
        Exception_03 ex = new Exception_03();
        System.out.println(ex.Exceptions());
    }
}

