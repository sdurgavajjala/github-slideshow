package interfaces;

public interface SharkFamily_07 extends HasFins_07{
    public default int getNumberOfFins(){
        return 8;
    }

    public double getLongestFinLength();
//    public boolean doFinsHaveScales(){  // DOES NOT COMPILE - not marked default
//        return false;
//    }
}
