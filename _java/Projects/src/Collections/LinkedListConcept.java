package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {
    public static void main(String[] args){
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Test");
        ll.add("QTP");
        ll.add("Selenium");
        ll.add("RPA");
        ll.add("RFT");

//        System.out.println("Contents of Linked List:"+ ll);

//        ll.addFirst("Santosh");
//        ll.addLast("Automation");
//        System.out.println("Contents of Linked List:"+ ll);
//        System.out.println(ll.get(0));
//        ll.set(0,"Prabhakar");
//        System.out.println(ll.get(0));
//
//        ll.removeFirst();
//        ll.removeLast();
//        System.out.println("Contents of Linked List:"+ ll);
//
//        ll.remove(0);
//        System.out.println("Contents of Linked List:"+ ll);
//
        //Iterate
        //for loop
        //advanced for loop
        //iterator
        //while loop

        //for loop
        for (int n=0;n<ll.size();n++){
            System.out.println("Contents of Linked List:"+ ll.get(n));
        }

        //Advanced For loop
        for(String str: ll){
            System.out.println("Contents of Linked List:"+ str);
        }

        System.out.println("Using Iterator");
        Iterator<String> itr = ll.iterator();
        while(itr.hasNext()){
            String ele = itr.next();
            System.out.println(ele);
        }

        System.out.println("using While");
        int num = 0;
        while(ll.size()>num){
            System.out.println(ll.get(num));
            num=num+1;
        }
    }
}
