package interfaces;

public class Cat implements Walk_08, Run_08 { //DOES NOT COMPILE
// Will compile if the below block is uncommented - as the child class is overriding the getSpeed()
    public int getSpeed() {
        return 1;
    }

    public static void main(String[] args){

        System.out.println(new Cat().getSpeed());
    }
}
