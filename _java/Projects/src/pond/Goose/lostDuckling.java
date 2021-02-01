package pond.Goose;
import pond.duck.duckTeacher;


public class lostDuckling {
    public void swim() {
        duckTeacher teacher = new duckTeacher();
        teacher.swim();                                   // allowed
         System.out.println("Thanks" + teacher.name);     // allowed
    }
}
