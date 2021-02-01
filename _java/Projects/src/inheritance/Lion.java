package inheritance;

public class Lion extends Animal { //Lion class extends from the Animal class.
    //Lion Class is bigger than Animal Class
    private void roar() {
        System.out.println("The " + getAge() + " year old lion says: Roar!");
            //The primitive age is marked as private
//                System.out.println("The "+age+" year old lion says: Roar!");


    }

    public Lion(int age){
        super(age);
    }

    public Lion(){
//        super();

        this(4);
    }

}

