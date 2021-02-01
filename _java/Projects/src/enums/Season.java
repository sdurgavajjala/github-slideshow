package enums;

public enum Season {
    WINTER, SPRING, FALL, SUMMER;

    public static void main(String[] args) {
        Season s = Season.SUMMER;
        System.out.println(Season.SUMMER);
        System.out.println(s==SUMMER);
        for (Season s1: Season.values()){
            System.out.println(s1.name()+" "+s1.ordinal());
        }

        Season summer = Season.SUMMER;
        switch (summer){
            case WINTER:
                System.out.println("It is COlde");
                break;

            case FALL:
                System.out.println("Look! How Beautiful");
                break;

            case SUMMER:
                System.out.println("Time for the pool");
                break;
            default:
                System.out.println("Is it summer yet");
        }
    }
}

