package Exceptions;

public class Exceptions_1 {
    public static void main(String[] args) {
        String s = "";
        try {
            s += "t";
        } catch(Exception e) {
            s += "c";
        } finally {
            s += "f";
        }
        s += "a";
        System.out.println(s);

    }
}
