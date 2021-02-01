package pond.Goose;

import pond.shore.Bird;

public class Goose extends Bird {
    public void helpGooseSwim() {
        Goose other = new Goose();
        other.floatInWater();
        System.out.println(other.text);
    }
    public void helpOtherGooseSwim() {
        Bird other = new Goose(); // Although the object happens to be a Goose, it is stored in a Bird reference
//        other.floatInWater(); // DOES NOT COMPILE
        // We are not allowed to refer to members of the Bird class since we are not in the same package
//         System.out.println(other.text); // DOES NOT COMPILE
    }
}
