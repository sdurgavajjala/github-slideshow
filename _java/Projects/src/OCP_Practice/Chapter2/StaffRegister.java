//Static Initialization of Singleton
package OCP_Practice.Chapter2;

// the static initialization block allows additional steps to be taken to set up the singleton after it has
//been created. It also allows us to handle cases in which the StaffRegister constructor throws an
//exception
public class StaffRegister {
    private static final StaffRegister instance;
    static {
        instance = new StaffRegister();
        // Perform additional steps
    }
    private StaffRegister() {
    }
    public static StaffRegister getInstance(){
        return instance;
    }
}
