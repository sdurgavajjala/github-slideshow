package pond.inland;
import pond.shore.Bird;               // different package than Bird

public class BirdWatcherFromAFar {
    public void watchBird() {
        Bird bird = new Bird();
//        bird.floatInWater();               // DOES NOT COMPILE
//        System.out.println(bird.text);     // DOES NOT COMPILE
    }
}
