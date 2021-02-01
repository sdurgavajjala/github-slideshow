package static_demo;

public class sample_1 {
    public static String str = "Santosh";
    public static int count = 0;
    public static void main(String[] args){
        System.out.println(str);

    }
}
class sample_1_tester{
    public static void main(String[] args){
        sample_1.main(new String[0]); //Call a static method
        sample_1 s = new sample_1();
        System.out.println(s.count); //s is sample_1
        s= null;
        System.out.println(s.count); //s is still sample_1
    }
}