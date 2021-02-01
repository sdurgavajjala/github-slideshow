package inheritance;

//Calling Inherited Class Members
public class shark_02 extends fish_01{
    private int numberOfFins = 8;
    public shark_02(int age){
        super(age);
        this.size = 4;
    }

    public void displaySharkDetails(){
        //To reference a member in a parent class, you can just call it directly
        System.out.print("Shark with age: "+getAge());
        System.out.print(" and "+size+" meters long");
        System.out.print(" with "+numberOfFins+" fins");

        // We may also use "this" to access members of the parent class
        // that are accessible from the child class, since a child class inherits all of its parent members
        System.out.print("Shark with age: "+this.getAge());
        System.out.print(" and "+this.size+" meters long");
        System.out.print(" with "+this.numberOfFins+" fins");

        //We can also explicitly reference a member of the parent class by using the super keyword
        System.out.print("Shark with age: "+super.getAge());
        System.out.print(" and "+super.size+" meters long");
        System.out.print(" with "+this.numberOfFins+" fins");

        System.out.print("Shark with age: "+super.getAge());
        System.out.print(" and "+super.size+" meters long");
        // numberOfFins is only a member of the current class, not the parent class.
//        System.out.print(" with "+super.numberOfFins+" fins"); // DOES NOT COMPILE
    }
}
