public class StringBuilder_Manipulations {
    public static void main(String[] args){
        //Why String Buffer
//        stringBuffer_example();

        //Example 2
//        stringBuffer_Ex2();
//
//        //Example 3
//        stringBuffer_Ex3();
//
//        //Example 4
//        stringBuffer_Ex4();
//
//        //append():  it adds the parameter to the StringBuilder and returns a reference to the current StringBuilder
//        stringBuffer_Append();
//
//        //insert(): adds characters to the StringBuilder at the requested index and returns a reference to the current StringBuilder
//        //offset:  It is the index where we want to insert the requested parameter.
//        stringBuffer_insert();
//
//        //delete():
//        stringbuffer_Delete();
//
//        //reverse(); it reverses the characters in the sequences and returns a reference to the current StringBuilder
//        stringBuilder_Reverse();
//
//        //Equals() - Compares Objects
        stringBuilder_Equality();

    }

    static void stringBuffer_example(){
        String alpha = "";
        // after 26 iterations through the loop, a total of 27 objects are instantiated,
        // most of which are immediately eligible for garbage collection
        for(char current = 'a'; current <= 'z'; current++){
            alpha += current;//abc....z
        }
            System.out.println(alpha);

        //Using String Builder
        StringBuilder beta = new StringBuilder();

        //This code reuses the same StringBuilder without creating an interim String each time
        for(char current = 'a'; current <= 'z'; current++){
            beta.append(current);//abc...z
        }
            System.out.println(beta);
    }

    static void stringBuffer_Ex2(){
        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle");
        StringBuilder same = sb.append("+end");
        System.out.println(same);
        System.out.println(sb);
    }

    static void stringBuffer_Ex3(){
        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }

    static void stringBuffer_Ex4(){
        StringBuilder sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        int len = sb.length();
        char ch = sb.charAt(6);
        System.out.println(sub + " " + len + " " + ch);
    }

    static void stringBuffer_Append(){
        StringBuilder sb = new StringBuilder().append(1).append('c');
        sb.append("-").append(true);
        System.out.println(sb);
    }

    static void stringBuffer_insert(){
        StringBuilder sb = new StringBuilder("animals");
        sb.insert(7, "-");
        sb.insert(0, "-");//-animals-
        sb.insert(4, "-");
        System. out .println(sb);
    }

    static void stringbuffer_Delete(){
        StringBuilder sb = new StringBuilder("abcdef");
        sb.delete(1, 3);
        System.out.println(sb);//adef
        sb.deleteCharAt(5);
        System.out.println(sb);

    }

    static void stringBuilder_Reverse(){
        StringBuilder sb = new StringBuilder("ABC");
        sb.reverse();
        System.out.println(sb);
    }

    static void stringBuilder_Equality(){
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("a");
        System.out.println(one == two);
        System.out.println(one == three);
    }

    static void stringEquality(){
        String x = "Hello World";
        String y = "Hello World";
        System.out.println(x == y);

        //Although x and z happen to evaluate to the same string, one is computed at runtime.
        //Since it isn’t the same at compile-time, a new String object is create
        String x1 = "Hello World";
        String z = " Hello World".trim();
        System.out.println(x1 == z);
        System.out.println(x1.equals(z));

        String x2 = new String("Hello World");
        String y2 = "Hello World";
        System.out.println(x2 == y2);

    }
    static void stringBuilder_Ex5(){
        StringBuilder sb = new StringBuilder();
        sb.append("aaa").insert(1, "bb").insert(4, "ccc");
        System.out.println(sb);
    }

    static void stringBuilder_Ex6(){
        String s1 = "java";
        StringBuilder s2 = new StringBuilder("java");
//        if (s1 == s2)
            System.out.print("1");
        if (s1.equals(s2))
            System.out.print("2");
    }
}
