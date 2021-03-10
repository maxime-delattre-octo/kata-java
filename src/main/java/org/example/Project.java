package org.example;

import java.util.ArrayList;

public class Project {


    public Project(){
    }

    public ArrayList<String> FizzBuzz(int number){
        ArrayList<String> FizzBuzz = new ArrayList<String>();
        for (int i = 1; i <= number; ++i) {
            String value = "";
            if(i % 3 == 0) {
                value += "Fizz";
            }
            if(i % 5 == 0) {
                value += "Buzz";
            }
            if(value == "") {
                value = String.valueOf(i);
            }
            
            FizzBuzz.add(value);
            
        }
        return FizzBuzz;
    }
}
