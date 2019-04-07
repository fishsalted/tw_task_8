package com.thoughtworks.tdd;

/**
 * Created by twer on 3/28/14.
 */
public class HelloWorld {

    public static String fizzBuzz(int number) {
        String result = "";
        if(number % 3 == 0) {
            result = "Fizz";
        }
        if(number % 5 == 0) {
            result += "Buzz";
        }
        if(number % 7 == 0) {
            result += "Whizz";
        }
        if(result.isEmpty()) {
            return String.valueOf(number);
        }
        return result;
    }

    public static void main(String[] args) {
        for( int i = 0; i < 120; i++) {
            String result = fizzBuzz(i+1);
            System.out.println(result);
        }
    }

}
