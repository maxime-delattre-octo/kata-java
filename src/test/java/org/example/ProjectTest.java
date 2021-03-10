package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import java.util.ArrayList;


public class ProjectTest {

    @Test
    public void testOneIfOne() {
        Dependency dependency = new Dependency();
        Project project = new Project(dependency);
        ArrayList<String> empty = new ArrayList<String>();
        empty.add("1");
        assertEquals(empty, project.FizzBuzz(1));
    }

    @Test
    public void testFirstTwo() {
        Dependency dependency = new Dependency();
        Project project = new Project(dependency);
        ArrayList<String> firstTwo = new ArrayList<String>();
        firstTwo.add("1");
        firstTwo.add("2");
        assertEquals(firstTwo, project.FizzBuzz(2));
    }

    @Test
    public void testAssertion() {
        Dependency dependency = new Dependency();
        Project project = new Project(dependency);

        assertEquals(1, project.testFunction());
    }

    @Test
    public void testMock() {
        Dependency mockDependency = mock(Dependency.class);
        Project project = new Project(mockDependency);

        project.testFunction();

        verify(mockDependency).mockFunction();
    }

    @Test
    public void testStub() {
        Dependency mockDependency = mock(Dependency.class);
        Project project = new Project(mockDependency);
        when(mockDependency.stubFunction()).thenReturn(15);

        assertEquals(15, project.testFunction());
    }
}
