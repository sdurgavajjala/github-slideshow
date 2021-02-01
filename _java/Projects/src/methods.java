public class methods {
    public static void main(String[] args) {
//        int num = 4;
//        newNumber(5);
//        System.out.println(num);     // 4
//
//        String name = "Webby";
//        speak(name);
//        System.out.println(name); //webby
//
//        StringBuilder name_1 = new StringBuilder();
//        speak(name_1);
//        System.out.println(name_1);
//
////        Pass By Value example: The original values are not changed
//        int original1 = 1;
//        int original2 = 2;
//        swap(original1, original2);
//        System.out.println(original1); // 1
//
        //return Values
//        int number = 1;
//        String letters = "abc";
//        number(number);
//        letters = letters(letters);
//        System.out.println(number + letters);
//
        //autoboxing in Overloading methods
//        fly(3);
//
//        //Reference Types in Overloaded methods: int->Integer->Object
//        methods r = new methods();
//        r.ref("test");
//        r.ref(56);
////
//        //Primitives in Overloaded methods
//        methods r1 = new methods();
//        pri(123);
//        pri(123L);
//
//        //Example
        System.out.print(glide("a"));
        System.out.print(glide("a", "b"));
        System.out.print(glide("a", "b", "c"));
    }

    public static void newNumber(int num){
        num = 8;
    }
    public static void speak(String name){
        name = "Sparky";
    }

    public static void speak(StringBuilder s){
        s.append("Webby");
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static int number(int number){
        number++;
        return number;
    }

    public static String letters(String letters){
        letters += "d";
        return letters;
    }

    public static void fly(Integer numMiles){
        System.out.println("Autoboxing invoked");
    }
//
//    public static void fly(int numMiles) {
//        System.out.println("No Autoboxing");
//    }

    public void ref(String s) {
        System.out.print("string ");
    }

    public void ref(Object o) {
        System.out.print("object ");
    }

    public static void pri(int i){
        System.out.print("int ");
    }

    public static void pri(long l){
        System.out.print("long ");
    }

    public static String glide(String s){
        return "1";
    }

    public static String glide(String... s){
        return "2";
    }

    public static String glide(Object o){
        return "3";
    }

    public static String glide(String s, String t){
        return "4";
    }
}


