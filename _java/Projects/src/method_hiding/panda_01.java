package method_hiding;

public class panda_01 extends bear_01{
    public static void eat_01() {
        System.out.println("Panda bear is chewing");
    }
    public static void main(String[] args) {
        panda_01.eat_01();
    }

//    public void sneeze() {  // DOES NOT COMPILE
//         System.out.println("Panda bear sneezes quietly");
//    }

//    public static void hibernate() {  // DOES NOT COMPILE
//         System.out.println("Panda bear is going to sleep");
//    }
}
