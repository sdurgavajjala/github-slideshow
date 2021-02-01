package OCP_Practice.Chapter2;

//The factory pattern, sometimes referred to as the factory method pattern, is a
//creational pattern based on the idea of using a factory class to produce instances of objects
//based on a set of input parameters. It is similar to the builder pattern, although it is focused
//on supporting class polymorphism

//Factory patterns are often, although not always, implemented using static methods
//that return objects and do not require a pointer to an instance of the factory class

//Depending on the value of animalName, we return different types of food for use in our
//factory. The factory pattern gives us a number of features. First of all, different animals
//can share the same food, such as goat and rabbit both eating pellets but with varying
//quantities. Next, notice in our ZooKeeper method that we don’t care about the particular
//type of food that we get, as long as it implements the Food interface. This loose coupling
//of ZooKeeper and Food allows us to change the rules in the FoodFactory at a later date
//without requiring any code changes to our ZooKeeper class.

public class FoodFactory {
    public static Food getFood(String animalName) {
        switch(animalName) {
            case "zebra": return new Hay(100);
            case "rabbit": return new Pellets(5);
            case "goat": return new Pellets(30);
            case "polar bear": return new Fish(10);
        }
        // Good practice to throw an exception if no matching subclass could be found
        throw new UnsupportedOperationException("Unsupported animal: "+animalName);
    }
}
