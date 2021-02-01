package OCP_Practice.Chapter2;
//// Lazy instantiation
//Lazy instantiation reduces memory usage and improves performance when an application starts up
//The downside of lazy instantiation is that users may see a noticeable delay the first time a particular type of resource is needed

public class VisitorTicketTracker {
    private static VisitorTicketTracker instance;
    private VisitorTicketTracker() {
    }
    //Unfortunately, because we used lazy instantiation in the VisitorTicketTracker
    //class, the compiler won’t let us assign the final modifier to the static reference

    //Thread safety is the property of an object that guarantees safe execution by multiple
    //threads at the same time

    //simple solution that is compatible with lazy instantiation using the synchronized modifier

    //public static synchronized VisitorTicketTracker getInstance()
    public static VisitorTicketTracker getInstance() {
        if(instance == null) {
            instance = new VisitorTicketTracker(); // NOT THREAD-SAFE!
        }
        return instance;
    }
}
