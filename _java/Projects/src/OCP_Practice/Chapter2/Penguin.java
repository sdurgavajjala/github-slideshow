package OCP_Practice.Chapter2;

//Object Composition:
//Object composition should be thought of as an alternate to inheritance and is often
//used to simulate polymorphic behavior that cannot be achieved via single inheritance.

// the Flippers class can be reused in classes completely
//unrelated to a Penguin or a Bird, such as in a Dolphin or Turtle class. Alternatively,
//if the Flippers class had been inherited from the Penguin class, then using it in other
//unrelated classes would be difficult without breaking the class model or having the other
//class contain an instance of a Penguin. For example, it would be silly to say a Dolphin is
//inherited from a Penguin or has an instance of a Penguin class, just because a Dolphin has
//Flippers, and Flippers inherits from the Penguin class

//Object composition may seem more attractive than inheritance because of its reusable
//nature, but bear in mind that one of the strengths of Java is its powerful inheritance
//model
public class Penguin {
    private final Flippers flippers;
    private final WebbedFeet webbedFeet;

    public Penguin() {
        this.flippers = new Flippers();
        this.webbedFeet = new WebbedFeet();
    }
    public void flap() {
        this.flippers.flap();
    }
    public void kick() {
        this.webbedFeet.kick();
    }

}
