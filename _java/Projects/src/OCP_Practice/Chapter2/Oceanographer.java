package OCP_Practice.Chapter2;

public class Oceanographer {
    // This is capable of accepting any object whose class implements the LivesInOcean interface
    public void checkSound(LivesInOcean animal){
        animal.makeSound();
    }

    public static void main(String[] args) {
        Oceanographer o = new Oceanographer();
        o.checkSound(new Whale());
        o.checkSound(new Dolphin());
    }
}
