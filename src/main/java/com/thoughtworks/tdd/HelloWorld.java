package com.thoughtworks.tdd;

/**
 * Created by twer on 3/28/14.
 */
public class HelloWorld {

    public static String fizzBuzz(int number) {
        //todo
    }

    public static void main(String[] args) {
        for( int i = 0; i < 120; i++) {
            String result = fizzBuzz(i+1);
            System.out.println(result);
        }
    }

}
