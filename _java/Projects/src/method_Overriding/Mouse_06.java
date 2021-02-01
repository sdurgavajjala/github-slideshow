package method_Overriding;

public class Mouse_06 extends Rodent_06{
    protected int tailLength = 8;
    public void getMouseDetails() {
        System.out.println("[tail="+tailLength +",parentTail="+super.tailLength+"]");
    }
    public static void main(String[] args) {
        Mouse_06 mouse = new Mouse_06();
        mouse.getRodentDetails();
        mouse.getMouseDetails();
    }
}
