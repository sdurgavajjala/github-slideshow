package interfaces;

public class Bear_04 implements Omnivore_04, Herbivore_04{
    public void eatMeat() {
        System.out.println("Eating meat");
    }
    public void eatPlants() {

        System.out.println("Eating plants");
    }

//    public int eatPlants(int quantity) {
//        System.out.println(("Eating plants: "+quantity);
//        return quantity;
//    }

//    public int eatPlants(){
//      System.out.println("Eating plants: 10");
//        return 10;
//     }
}
