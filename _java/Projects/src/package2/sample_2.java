package package2;

import static_demo.sample_1;

public class sample_2 {



    public static void main(String[] args){
        sample_1.main(new String[0]);
        sample_1.count=4;
        sample_1 s1 = new sample_1();
        sample_1 s2 = new sample_1();
        s1.count = 6;
        s2.count = 5;
        System.out.println(sample_1.count);

    }
}
