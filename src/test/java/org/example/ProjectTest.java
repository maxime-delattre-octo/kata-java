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
        ArrayList<String> firstTwo = new ArrayList<String>();
        assertEquals(firstTwo, project.FizzBuzz(2));
    }

    @Test
    public void testBuzz() {
        Project project = new Project();
        ArrayList<String> firstTwo = new ArrayList<String>();
        firstTwo.add("1");
        firstTwo.add("2");
        firstTwo.add("Fizz");
        firstTwo.add("4");
        firstTwo.add("Buzz");
        assertEquals(firstTwo, project.FizzBuzz(2));
    }

    @Test
    public void testArrayLenght() {
        Project project = new Project();
        int lenght = 5;
        assertEquals(lenght, project.FizzBuzz(lenght).size());
    
    }
}
