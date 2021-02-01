import java.lang.reflect.Array;
import java.util.*;

public class Array_s {
    public static void main(String[] args){
//        arrayCast();
//        arrayUse();
//        array_Iterate();
//        array_Sort();
//        array_Sort_String();
//        arraySearch_1();
//        arraySearch_2();
//        array_MultiDim();
//        //The add() methods insert a new value in the ArrayList
//        arrayList_Add();
//        //The remove() methods remove the fi rst matching value in the ArrayList or
//        // remove the element at a specified index.
//        arrayList_remove();
//
//        //The set() method changes one of the elements of the ArrayList without changing the size.
//        arrayList_set();

//        arrayList_Size();
//        //The clear() method provides an easy way to discard all elements of the ArrayList.
//        arrayList_clear();
//
//        //The contains() method checks whether a certain value is in the ArrayList
//        arrayList_contains();
//
//        // compare two lists to see if they contain the same elements in the same order
//        arrayList_equals();
//        arrayList_forLoop();
//        arrayList_Iterator();

//        arrayList_addAll();
//        wrapper_ex();
//        wrapper_ex2();

//        array_to_list();
//        arrayList_to_array();
//        arrayList_sort();
//        arrayList_Ex1();
//        array_ex();
//        arrayList_ex4();
//        arrayList_ex3();
//        arrayList_ex2();

    }
    static void arrayCast(){
     String[] strings = { "stringValue" }; //Creates an array of String
     Object[] objects = strings; //doesn’t require a cast because Object is a broader type than String
     String[] againStrings = (String[]) objects; // a cast is needed because we are moving to a more specifi c type
//     againStrings[0] = new StringBuilder();   // DOES NOT COMPILE
     objects[0] = new StringBuilder();        // careful!
    // A StringBuilder object can clearly go in an Object[].
    // The problem is that we don’t actually have an Object[].
    // We have a String[] referred to from an Object[] variable.
    // At runtime, the code throws an ArrayStoreException
    }

    static void arrayUse(){
        String[] mammals = {"monkey", "chimp", "donkey"}; //declares and initializes the array
        System.out.println(mammals.length); // 3 -  tells us how many elements the array can hold
         System.out.println(mammals[0]);  // monkey
         System.out.println(mammals[1]);               // chimp
         System.out.println(mammals[2]);               // donkey

    }

    static void array_Iterate(){
        int[] numbers = new int[10]; // instantiates an array with 10 slots
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 5; // sets the current element of numbers
            System.out.println(numbers[i]);
        }

//        numbers[10] = 3;
//        numbers[numbers.length] = 5;
//        for (int i = 0; i <= numbers.length; i++)
//            numbers[i] = i + 5;

    }

    static void array_Sort(){
        int[] numbers = { 6, 9, 1 };
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++)
            System.out.print (numbers[i] +  " ");
    }

    static void array_Sort_String(){
        String[] strings = { "10", "9", "100" };
        Arrays.sort(strings);
        for (String string : strings)
            System.out.print(string + " ");

    }

    static void arraySearch_1(){
        int[] numbers = {2,4,6,8};
        System.out.println(Arrays.binarySearch(numbers, 2));
        System.out.println(Arrays.binarySearch(numbers, 4));
        System.out.println(Arrays.binarySearch(numbers, 1));//-1
        System.out.println(Arrays.binarySearch(numbers, 3));//-1-1 = -2
        System.out.println(Arrays.binarySearch(numbers, 9));//-4-1 = -5
    }

    static void arraySearch_2(){
        int[] numbers = new int[] {3,2,1};
        System.out.println(Arrays.binarySearch(numbers, 2));
        System.out.println(Arrays.binarySearch(numbers, 3));
    }

    static void array_MultiDim(){
        int[][] twoD = new int[3][2];
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++)
                System.out.print(twoD[i][j] + " ");
                System.out.println();
            }

        for (int[] inner : twoD){
            for (int num : inner)
                System.out.print(num + " ");
                System.out.println();
        }

    }

    static void arrayList_Add(){
        ArrayList list = new ArrayList();
        list.add("hawk");
        list.add(Boolean.TRUE);
        System.out.println(list);

        //Generics
        ArrayList<String> safer = new ArrayList<>();
        safer.add("sparrow");
//        safer.add(Boolean.TRUE);    // DOES NOT COMPILE

        //Add using positions
        List<String> birds = new ArrayList<>();
        birds.add("hawk"); //0 ["hawk"]
        birds.add(1, "robin"); //["hawk","robin"]
        birds.add(0, "blue jay"); //["blue jay","hawk","robin"]
        birds.add(1, "cardinal"); //["blue jay","cardinal","hawk","robin"]
        System.out.println(birds);
    }

    static void arrayList_remove(){
        List<String> birds = new ArrayList<>();
        birds.add("cardinal");//["cardinal"]
        birds.add("hawk");//["cardinal","hawk"]
        birds.add("hawk"); //["cardinal","hawk","hawk"]
        System.out.println(birds.remove("cardinal")); //["hawk","hawk"]
        System.out.println(birds.remove("hawk")); //["hawk"]
        System.out.println(birds.remove(0));//[]
        System.out.println(birds);
        birds.remove(1000); //IndexOutOfbound Exception
    }

    static void arrayList_set(){
        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        System.out.println(birds.size());
        birds.set(0, "robin");
        System.out.println(birds.size());
//        birds.set(1, "robin");
        System.out.println(birds);
    }

    static void arrayList_Size(){
        List<String> birds = new ArrayList<>();
        System.out.println(birds.isEmpty());
        System.out.println(birds.size());
        birds.add("hawk");
        birds.add("hawk");
        System.out.println(birds.isEmpty());
        System.out.println(birds.size());
    }

    static void arrayList_clear(){
        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add("hawk");
        System. out .println(birds.isEmpty());
        System. out .println(birds.size());
        birds.clear();
        System. out .println(birds.isEmpty());
        System.out.println(birds.size());

    }

    static void arrayList_contains(){
        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        System.out.println(birds.contains("hawk"));
        System.out.println(birds.contains("robin"));

    }

    static void arrayList_equals(){
        List<String> one = new ArrayList<>();
        List<String> two = new ArrayList<>();
        System.out.println(one.equals(two));
        one.add("a");
        System.out.println(one.equals(two));
        two.add("a");
        System.out.println(one.equals(two));
        one.add("b"); //["a","b"]
        two.add(0, "b"); //["b","a"]
        System.out.println(one.equals(two));

    }

    static void arrayList_forLoop(){
        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("one");
        myArrayList.add("two");
        myArrayList.add("four");
        myArrayList.add(2,"three");
        for (String ele:myArrayList){
            System.out.println(ele);
        }
    }

    static void arrayList_Iterator(){
        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("one");
        myArrayList.add("two");
        myArrayList.add("four");
        myArrayList.add(2,"three");
        ListIterator<String> itr = myArrayList.listIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    static void arrayList_addAll(){
        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("one");
        myArrayList.add("two");
        ArrayList<String> yourArrayList = new ArrayList<>();
        yourArrayList.add("three");
        yourArrayList.add("four");
        myArrayList.addAll(1,yourArrayList);
        for (String ele:myArrayList) {
            System.out.println(ele);
            }
    }

    static void arrayList_Ex1(){
        ArrayList<String> myArrayList = new ArrayList<>();
        String one = "One";
        String two = new String("Two");
        myArrayList.add(one);
        myArrayList.add(two);
        ArrayList<String> yourArrayList = myArrayList;
        one.replace("O","B");
        for (String val: myArrayList){
            System.out.println(val+":");
        }

        for (String val: yourArrayList){
            System.out.println(val+":");
        }
    }

    static void arrayList_Ex2(){
        ArrayList<StringBuilder> myArrayList = new ArrayList<StringBuilder>();
        StringBuilder sb1 = new StringBuilder("Jan");
        StringBuilder sb2 = new StringBuilder("Feb");
        myArrayList.add(sb1);
        myArrayList.add(sb2);
        myArrayList.add(sb2);
        System.out.println(myArrayList.contains(new StringBuilder("Jan")));
        System.out.println(sb1);
        System.out.println(myArrayList.indexOf(new StringBuilder("Feb")));
        System.out.println(myArrayList.indexOf(sb2));
        System.out.println(myArrayList.lastIndexOf(new StringBuilder("Feb")));
        System.out.println(myArrayList.lastIndexOf(sb2));

    }

    static void wrapper_ex(){
        int i = 10;
//        ArrayList<Integer> list1 = new ArrayList<>();
//        list1.add(1);
//        list1.add(2);
//        list1.get(0);
        Integer i_ref = new Integer(i); //Boxing
        Integer i_rf = i; //AutoBoxing

        int i_ref_back = i_ref.intValue();//Unboxing
        int i_rf_back = i_ref; //Auto Unboxing
        System.out.println(i_rf);
        System.out.println(i_ref);
        System.out.println(i_ref_back);
        System.out.println(i_rf_back);
    }

    static void wrapper_ex2(){
        String str = "123";
        int ref = Integer.parseInt(str);
        System.out.println(ref);
    }

    static void autobox_ex(){
        List<Double> weights = new ArrayList<>();
        weights.add(50.5); // autoboxes the double primitive into a Double object and adds that to the List
        weights.add(new Double(60));
        weights.remove(50.5); // autoboxes into the wrapper object and passes it to remove().
        double first = weights.get(0); //retrieves the Double and unboxes it into a double primitive.
    }

    static void array_to_list(){
        String[] array = { "hawk", "robin" };
        List<String> list = Arrays.asList(array);
        System.out.println(list.size());
        list.set(1, "test");
        array[0] = "new";
        for (String b : array)
            System.out.print(b + " ");
        list.remove(1);
    }

    static void arrayList_to_array(){
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        Object[] objectArray = list.toArray();
        System.out.println(objectArray.length);
        String[] stringArray = list.toArray(new String[0]);
        System.out.println(stringArray.length);
    }

    static void arrayList_sort(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(5);
        numbers.add(81);
        Collections.sort(numbers);
        System.out.println(numbers);

    }

    static void array_ex(){
        List<Integer> list = Arrays.asList(10, 4, -1, 5);
        Collections.sort(list);
        Integer array[] = list.toArray(new Integer[4]);
        System.out.println(array[0]);


    }

    static void arrayList_ex2(){
//        String [] names = {"Tom", "Dick", "Harry"};
//        List<String> list_1 = names.asList();
//        list_1.set(0, "Sue");
//        System.out.println(names[0]);
    }

    static void arrayList_ex3(){
        List<String> hex = Arrays.asList("30", "8", "3A", "FF");
        Collections.sort(hex);
        int x = Collections.binarySearch(hex, "8");
        int y = Collections.binarySearch(hex, "3A");
        int z = Collections.binarySearch(hex, "4F");
        System.out.println(x + " " + y + " " + z);
    }

    static void arrayList_ex4(){
        List<String> one = new ArrayList<String>();
        one.add("abc");
        List<String> two = new ArrayList<>();
        two.add("abc");
        if (one == two)
            System.out.println("A");
        else if (one.equals(two))
            System.out.println("B");
        else   System.out.println("C");
    }
}
