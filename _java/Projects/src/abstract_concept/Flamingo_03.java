package abstract_concept;

//Even though a second subclass Flamingo_02 implements the abstract method getName(),
// the first concrete subclass Walrus_02 doesn’t; therefore, the Walrus_02 class will not compile

//public class Flamingo_03 extends Walrus_02 {
public class Flamingo_03{
    public String getName() {
        return "Flamingo";
    }
}
