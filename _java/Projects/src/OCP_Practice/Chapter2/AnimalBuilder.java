package OCP_Practice.Chapter2;

//The builder pattern is a creational pattern in which parameters are passed to a
//builder object, often through method chaining, and an object is generated with a final build
//call. It is often used with immutable objects, since immutable objects do not have setter
//methods and must be created with all of their parameters set, although it can be used with
//mutable objects as well


import java.util.List;

public class AnimalBuilder {
    private String species;
    private int age;
    private List<String> favoriteFoods;
    public AnimalBuilder setAge(int age) {
        this.age = age;
        return this;
    }
    public AnimalBuilder setSpecies(String species) {
        this.species = species;
        return this;
    }
    public AnimalBuilder setFavoriteFoods(List<String> favoriteFoods) {
        this.favoriteFoods = favoriteFoods;
        return this;
    }
    public Animal_1 build(){
        return new Animal_1(species,age,favoriteFoods);

    }
}
