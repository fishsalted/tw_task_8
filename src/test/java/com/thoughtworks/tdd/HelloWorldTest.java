package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class HelloWorldTest {
    
    @Test
    public void test_fizzBuzz_3() {
        String result = HelloWorld.fizzBuzz(3);
        
        assertThat(result, is("Fizz"));
    }

    @Test
    public void test_fizzBuzz_5() {
        String result = HelloWorld.fizzBuzz(5);

        assertThat(result, is("Buzz"));
    }

    @Test
    public void test_fizzBuzz_7() {
        String result = HelloWorld.fizzBuzz(7);

        assertThat(result, is("Whizz"));
    }

    @Test
    public void test_fizzBuzz_15() {
        String result = HelloWorld.fizzBuzz(15);

        assertThat(result, is("FizzBuzz"));
    }

    @Test
    public void test_fizzBuzz_21() {
        String result = HelloWorld.fizzBuzz(21);

        assertThat(result, is("FizzWhizz"));
    }

    @Test
    public void test_fizzBuzz_35() {
        String result = HelloWorld.fizzBuzz(35);

        assertThat(result, is("BuzzWhizz"));
    }

    @Test
    public void test_fizzBuzz_105() {
        String result = HelloWorld.fizzBuzz(105);

        assertThat(result, is("FizzBuzzWhizz"));
    }
}
