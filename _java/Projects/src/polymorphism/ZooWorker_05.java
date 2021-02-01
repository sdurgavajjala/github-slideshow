package polymorphism;

public class ZooWorker_05 {
    public static void feed(Reptile_05 reptile){
        System.out.println("Feeding "+reptile.getName());
    }

    public static void main(String[] args) {
        feed(new Alligator_05());
        feed(new Crocodile_05());
        feed(new Reptile_05());
    }
}
