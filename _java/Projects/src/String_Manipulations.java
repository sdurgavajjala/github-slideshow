public class String_Manipulations {
    public static void main(String[] args){
        //Demo of Rules
//        StringRules();
//
//        //What is the output of the following?
//        StringEx2();
//
//        //What is the output of the following?
//        Sum3();
//
//        //Demo for Immutability of a String
//        Immutable();
//
//        // length():  returns the number of characters in the String
//        stringLength();
//
//        //charAt(): find out what character is at a specific index //throws exception if no match is found
//        stringCharAt();
//
//        //indexOf(): )looks at the characters in the string and fi nds the fi rst index that matches the desired value
//        //returns -1 if no match is found
//        stringIndexOf();
//
//        //SubSting(): It returns parts of the string
//        stringSubString();
//
//        //toLowerCase() & toUpperCase()
//        stringCases();
//
//        //equals() & equals IgnoreCase():
//        stringEquals();
//
//        //startsWith() & endsWith():
//        stringStart_End();
//
//        //contains():
//        stringContains();
//
//        //replace():
//        stringReplace();
//
//        //Trim():  removes whitespace from the beginning and end of a String
//        stringTrim();
//
//        //Method Chaining: series of String Methods
//        stringChain();
//
//        //String Exercise
//        stringExercise();

        //What is the o/p of the below:
        string_Ex2();

    }
    static void Sum3(){
        String s = "1";             // s currently holds "1"
        s += "2";
        s += 3;
        System.out.println(s);
    }

    static void StringEx2(){
        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four);
    }

    static void StringRules(){
        // Both operands are numbers
        System.out.println(1 + 2);           // 3

        //simple string concatenation
        System.out.println("a" + "b");       // ab

        // combines both the second and third rules
        System.out.println("a" + "b" + 3);   // ab3

        //All the three rules
        System.out.println(1 + 2 + "c");     // 3c
    }

    static void Immutable(){
        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        System.out.println(s2);

    }

    static void stringLength(){
        String string = "animals";
        System.out.println(string.length());
    }

    static void stringCharAt(){
        String string = "animals";
        System.out.println(string.charAt(0));
        System.out.println(string.charAt(6));
        System.out.println(string.charAt(7));  // throws exception

    }

    static void stringIndexOf(){
        String string = "animals";
        System.out.println(string.indexOf('a'));
        System.out.println(string.indexOf("al"));
        System.out.println(string.indexOf('a', 4));
        System.out.println(string.indexOf("al", 5));

    }

    static void stringSubString(){
        String string = "animals";
        System.out.println(string.substring(3));
        System.out.println(string.substring(string.indexOf('m')));
        System.out.println(string.substring(3, 4));
        System.out.println(string.substring(3, 7));
        System.out.println(string.substring(3, 3));
        System.out.println(string.substring(3, 2));
        System.out.println(string.substring(3, 8));

    }

    static void stringCases(){
        String string = "animals";
        System.out.println(string.toUpperCase());
        System.out.println("Abc123".toLowerCase());
    }

    static void stringEquals(){
        System.out.println("abc".equals("ABC"));
        System.out.println("ABC".equals("ABC"));
        System.out.println("abc".equalsIgnoreCase("ABC"));

    }

    static void stringStart_End(){
        System.out.println("abc".startsWith("a"));
        System.out.println("abc".startsWith("A"));
        System.out.println("abc".endsWith("c"));
        System.out.println("abc".endsWith("a"));

    }

    static void stringContains(){
        System.out.println("abc".contains("b"));
        System.out.println("abc".contains("B"));
    }

    static void stringReplace(){
        System.out.println("abcabc".replace('a', 'A'));
        System.out.println("abcabc".replace("a", "A"));

    }

    static void stringTrim(){
        System.out.println("abc".trim());
        System.out.println("\t   a b c\n".trim());
    }

    static void stringChain(){
        String result = "AniMaL   ".trim().toLowerCase().replace('a', 'A');
        System.out.println(result);
    }

    static void stringExercise(){
        String a = "abc";
        String b = a.toUpperCase();//ABC
        b = b.replace("B", "2").replace('C', '3');//A2C - A23
        System.out.println("a=" + a);
        System.out.println("b=" + b);

    }
    static void string_Ex1(){
        int numFish = 4;
        String fishType = "tuna";
//        String anotherFish = numFish + 1;
//        System.out.println(anotherFish + " " + fishType);
        System.out.println(numFish + " " + 1);
    }

    static void string_Ex2(){
        String s = "Hello";
        String t = new String(s);
        if ("Hello".equals(s)) System.out.println("one");
        if (t == s) System.out.println("two");
        if (t.equals(s)) System.out.println("three");
        if ("Hello" == s) System.out.println("four");
        if ("Hello" == t) System.out.println("five");
        System.out.println(t);
    }
}
