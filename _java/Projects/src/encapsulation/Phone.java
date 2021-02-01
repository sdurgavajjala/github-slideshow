package encapsulation;

public class Phone {
    //Instance variables that store the state of an object of phone
    String model;
    String company;
//    double weight;


        private double weight;
        //Setter Method
    public void setWeight(double val){
        if (val>=0 && val<=1000){  //negative and weight >1000 are not allowed
            weight = val;
        }
    }
    //getter Method
    public double getWeight() {
        return weight;
    }

    //Mehods: Details not relevant at this point
    void makeCall(String number){ }
    void receiveCall(){}
}

class Home{
    public static void main(String[] args){
        Phone ph = new Phone();
//        ph.weight = -12.23; //Assign a negative weight to phone
//        ph.setWeight(-12.23);  //Assign a negative weight to phone
//        System.out.println(ph.getWeight());
//        ph.setWeight(1770.22); //Assign weight >1000 to phone object
//        System.out.println(ph.getWeight());
        ph.setWeight(12.23); //Assign weight in the allowed range
        System.out.println(ph.getWeight());

    }
}

class swan{
    private int numberEggs;   // private
    public int getNumberEggs(){    // getter
        return numberEggs;
    }
    public void setNumberEggs(int numberEggs){    // setter
        if (numberEggs >= 0){  // guard condition
            this.numberEggs = numberEggs;
        }
    }
}

//No Setter - constructor allowing values to be set.
//One way to make the classes immutable is to omit the setters
class ImmutableSwan{
    private int numberEggs;
    public ImmutableSwan(int numberEggs){
        this.numberEggs = numberEggs;
    }
    public int getNumberEggs(){
        return numberEggs;
    }
}

//Return types
class NotImmutable{
    private StringBuilder builder;
    public NotImmutable(StringBuilder b){
        builder = b;
    }


    public StringBuilder getBuilder(){
        return builder;
//        return new StringBuilder(builder);
    }

    //Defensive copy - Make a copy of the mutable object
    public void Mutable(StringBuilder b){
        builder = new StringBuilder(b);
    }

    //Another approach for the getter is to return an immutable object:
    public String getValue(){
        return builder.toString();
    }


    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("initial");
        NotImmutable problem = new NotImmutable(sb);
        sb.append(" added");
        StringBuilder gotBuilder = problem.getBuilder();
        gotBuilder.append(" more");
        System.out.println(problem.getBuilder());
    }


}
