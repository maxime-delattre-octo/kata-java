package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import java.util.ArrayList;


public class ProjectTest {

    @Test
    public void testOneIfOne() {
        Project project = new Project();
        ArrayList<String> empty = new ArrayList<String>();
        empty.add("1");
        assertEquals(empty, project.FizzBuzz(1));
    }

    @Test
    public void testFirstTwo() {
        Project project = new Project();
        ArrayList<String> firstTwo = new ArrayList<String>();
        firstTwo.add("1");
        firstTwo.add("2");
        assertEquals(firstTwo, project.FizzBuzz(2));
    }

    @Test
    public void testFizz() {
        Project project = new Project();
        int index = 3;
        String result = project.FizzBuzz(index).get(index-1);
        assertEquals(result, "Fizz");
    }

    @Test
    public void testBuzz() {
        Project project = new Project();
        int index = 5;
        String result = project.FizzBuzz(index).get(index-1);
        assertEquals(result, "Buzz");
    }

    @Test
    public void testFizzBuzz() {
        Project project = new Project();
        int index = 15;
        String result = project.FizzBuzz(index).get(index-1);
        assertEquals(result, "FizzBuzz");
    }

    @Test
    public void testFirstTwo() {
        Project project = new Project();
        ArrayList<String> firstTwo = new ArrayList<String>();
        firstTwo.add("1");
        firstTwo.add("2");
        firstTwo.add("1");
        firstTwo.add("2");
        firstTwo.add("1");
        firstTwo.add("2");
        firstTwo.add("1");
        firstTwo.add("2");
        firstTwo.add("1");
        firstTwo.add("2");
        firstTwo.add("1");
        firstTwo.add("2");
        firstTwo.add("1");
        firstTwo.add("2");
        
        assertEquals(firstTwo, project.FizzBuzz(2));
    }
}
