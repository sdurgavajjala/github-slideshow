package Collections;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;


public class maps {
    public maps() throws FileNotFoundException {
    }

    public static void main(String[] args) throws IOException {
        //Hash Map is a class that implements Map Interface
        //Extends AbstractMap class
        //It Contains unique elements only
        //Stores the values in Key and Value pair
        // It is allowed to have one null key and multiple null values
        //It Maintains no order
        //Hash Map is not Synchronized: Multiple Threads can access Hash Map. - not thread safe
        //Performance will be increased
//        Fail Fast Condition – Concurrent Modification Exception occurs
        //Hash Table - is Synchronized - At a time only one thread can

//        HashMap<Integer, String> map = new HashMap<Integer, String>();
//        map.put(1, "Selenium");
//        map.put(2, "QTP");
//        map.put(3, "Python");
//        map.put(4, "RPA");
//
//        System.out.println(map.get(1));
//        System.out.println(map.get(4));
//
//        //pRINT ALL VALUES
//        //Entry Set will store all the values (complete set) in hashmap
//        for (Map.Entry m: map.entrySet()){
//            System.out.println(m.getKey()+" "+m.getValue());
//        }
//
////        //Remove - doen't maintain order
//        System.out.println(map);
//        map.remove(3);
//        System.out.println(map);
//
        HashMap<Integer,Employee> emp = new HashMap<Integer, Employee>();
        Employee e1 = new Employee("Tom",25,"Admin");
        Employee e2 = new Employee("Peter",30,"QA");
        Employee e3 = new Employee("Steve",26,"Dev");

        emp.put(1,e1);
        emp.put(2,e2);
        emp.put(3,e3);
//
        //traverse the hash map
        //Entry is an interface used to traverse the HashMap
        for (Map.Entry<Integer, Employee> m1: emp.entrySet()){
            int key = m1.getKey();
            Employee emp1 = m1.getValue();
            System.out.println(key + "Info");
            System.out.println("Age: "+emp1.age+" Name: "+emp1.name+" Dept: "+emp1.dept);


        }
    }





}
