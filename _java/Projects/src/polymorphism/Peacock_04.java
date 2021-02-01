package polymorphism;



public class Peacock_04 extends Bird_02{
    public String getName(){

        return "Peacock";
    }

    public static void main(String[] args) {
        Bird_02 bird = new Peacock_04();
        bird.displayInformation();
    }
}
