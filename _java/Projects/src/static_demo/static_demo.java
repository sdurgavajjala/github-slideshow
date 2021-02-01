package static_demo;

public class static_demo {
    public static int count;
    public static void addGorilla() {
        count++;
    }
    public void babyGorilla() {
        count++;
    }
    public void announceBabies() {
        addGorilla();
        babyGorilla();
    }
    public static void announceBabiesToEveryone() {
        addGorilla();
//        babyGorilla();
    }

}
