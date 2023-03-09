package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Queue queue=new Queue();
        queue.setLenghtOfArray(5);
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.diplay();
        queue.pop();
        queue.diplay();
        System.out.println("stack ::::::");
        Stack stack=new Stack();
        stack.setLenghtOfArray(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        stack.diplay();

        Patterns patterns=new Patterns();
        patterns.setLines(10);
        patterns.rectangle();


    }



}
