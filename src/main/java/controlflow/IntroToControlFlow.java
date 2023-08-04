package main.java.controlflow;

import javafx.css.Style;

public class IntroToControlFlow {

    // Static variable
    public static String staticVar = "This is the static variable";
    // Instance varaible
    public String instanceVar = "This is the instance variable";

    // Control Flow - Control flow statements regulate the flow of the 
    // control flow (or flow of control) in the order in which individual statements, 
    // instructions or function calls of an imperative program are executed or evaluated.

    // To practice using the different statement we will create an array. 
    // Array - structures that are used to store multiple values in a single variable, 
    // instead of declaring separate variables for each value
    // Aka a series of like elements
    // Syntax <datatype>[] <nameOfArray> = new <datatype>[numberOfSlots]
    // [1, 2, 3, 4, 5] --> for this array the index for the value 1 = 0; The index for the value 2 = 1

    public int[] intArray = new int[5];

    // Adding into our array
    // intArray[0] = 1;
    // intArray[1] = 2;
    // intArray[2] = 3;
    // intArray[3] = 4;
    // intArray[4] = 5;

    // An example of defining the value in an array from declaration;
    public String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};


    // Types of control flow statements

    // if, if-else, if else-if, switch, while loops, do while loop, for loop

    // Interatives ---> repeat continously (recursive) while loops, do whiles, for loops, forEach()
    // Conditionals ---> logic gates (only run one if condition is passed) if, if else, switch etc



    // Practice

    public boolean ifStatement(String day) {

        // Syntax: if(condition) {
            // logic or implementation goes here
        // }
        if(day.equals("Wednesday")) {
            return true;
        }
        return false;
    }

    public int ifElseStatement(String input) {

        if(input.length() > 5) {
            return input.length();
        } else {
            return 0;
        }
    }

    public String forLoopIterative() {
        // For our for loops we have 3 conditions to follow
        // for(1; 2; 3) {
            // code goes here
        // }
        // 1 - Start of our loop
        // 2 - Where the loop should end
        // 3 - Whether we should increment or decrement inorder to get from
        // The start value to the end value

        for (int i = 0; i < daysOfTheWeek.length; i++) {
            System.out.println(daysOfTheWeek[i]);
        }

        return "For loop finished";
    }
}
