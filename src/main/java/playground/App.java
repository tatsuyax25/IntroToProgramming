package main.java.playground;

import main.java.string.IntroToString;

// Note: The Object is the parent class for ALL objects created in Java.
public class App {
    
    public static void main(String[] args) {
        
        IntroToString stringsClass = new IntroToString();

        String welcome = stringsClass.helloString;
        String hello = "Hello Everyone!";
        String hello2 = new String("Hello Everyone!");

        System.out.println(stringsClass.stringCount(welcome));

        // Note: denots assignment VS. == denotes comparison

        System.out.println(welcome == hello); // true
        System.out.println(welcome == hello2); // false

    }

}
