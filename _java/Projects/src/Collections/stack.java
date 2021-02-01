package Collections;

import java.util.ArrayDeque;

public class stack {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(4);
        System.out.println((stack.peek()));
        System.out.println(stack.poll());
        System.out.println(stack.poll());
        System.out.println((stack.peek()));

    }
}
