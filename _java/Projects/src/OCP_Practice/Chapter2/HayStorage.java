//Singleton Design
package OCP_Practice.Chapter2;

public class HayStorage {
    private int quantity = 0;

    // all constructors in a singleton class are marked private, which
    //ensures that no other class is capable of instantiating another version of the class
    private HayStorage(){

    }
    // singletons in Java are created as private static variables within the class, often with the name instance
    private static final HayStorage instance = new HayStorage();

    //They are accessed via a single public static method, often named getInstance(), which returns the reference to the
    //singleton object
    public static HayStorage getInstance() {
        return instance;
    }
    public synchronized void addHay(int amount) {
        quantity += amount;
    }
    //We also checked the
    //return type of removeHay() , as it is possible that someone else could have taken the food
    //that we just restocked before we had a chance to use it.
    public synchronized boolean removeHay (int amount) {
        if(quantity < amount) return false;
        quantity -= amount;
        return true;
    }
    public synchronized int getHayQuantity() {
        return quantity;
    }

}
