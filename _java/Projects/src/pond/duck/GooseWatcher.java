package pond.duck;

import pond.Goose.Goose;

public class GooseWatcher {
    public void watch() {
        Goose goose = new Goose();
        // we are not in the Goose class, The floatInWater() method is declared in Bird
        //GooseWatcher is not in the same package as Bird, nor does it extend Bird. Goose extends Bird.
        // That only lets Goose refer to floatInWater() and not callers of Goose.
//        goose.floatInWater();     // DOES NOT COMPILE
    }
}
