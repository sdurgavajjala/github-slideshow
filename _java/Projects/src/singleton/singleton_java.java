package singleton;

public class singleton_java {
    private static singleton_java sing_ref = null;
    public String s1;

    //Private Constructor
    private singleton_java(){
        s1 = "I am in Singleton Class";
    }

    //Static method that returns Singleton Instance
    public static singleton_java getInstance(){
        if (sing_ref == null){
            sing_ref = new singleton_java();
        }
        return sing_ref;
    }

    public static void main(String[] args) {
        singleton_java Obj1 = singleton_java.getInstance();
        singleton_java Obj2 = singleton_java.getInstance();
        singleton_java Obj3 = singleton_java.getInstance();

        Obj1.s1 = Obj1.s1.toUpperCase();
        System.out.println(Obj1.s1);
        System.out.println(Obj2.s1);
        System.out.println(Obj3.s1);

        Obj3.s1 = Obj3.s1.toLowerCase();
        System.out.println(Obj1.s1);
        System.out.println(Obj2.s1);
        System.out.println(Obj3.s1);

    }
}
