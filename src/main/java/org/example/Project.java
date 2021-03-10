package org.example;

import java.util.ArrayList;

public class Project {


    public Project(){
    }

    public ArrayList<String> FizzBuzz(int number){
        ArrayList<String> FizzBuzz = new ArrayList<String>();
        for (int i = 1; i <= number; ++i) {
            FizzBuzz.add(String.valueOf(i));
        }
        return FizzBuzz;
    }
}
