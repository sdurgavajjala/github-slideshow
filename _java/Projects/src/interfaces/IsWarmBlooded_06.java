package interfaces;

// Any class that implements IsWarmBlooded may rely on the default implementation
// of getTemperature() or override the method and create its own version.
public interface IsWarmBlooded_06 {
    boolean hasScales(); //Abstract Method
    public default double getTemperature() { //Default Method

        return 10.0;
    }
}
