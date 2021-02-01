package pond.Goose;
import pond.shore.Bird; // in a different package

public class Goosling extends Bird{ // extends means create subclass
    public void swim() {
        floatInWater();               // calling protected member
        System.out.println(text);     // calling protected member
    }
}
