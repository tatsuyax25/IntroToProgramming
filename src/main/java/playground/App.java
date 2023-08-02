package main.java.playground;

import main.java.string.IntroToString;

// Note: The Object is the parent class for ALL objects created in Java.
public class App {
    
    public static void main(String[] args) {
        
        IntroToString stringsClass = new IntroToString();
        IntroToString stringClass2 = new IntroToString("Day 3 was Great!");
        
        System.out.println(stringsClass.helloString);
        System.out.println(stringClass2.helloString);

        System.out.println(stringsClass.attendance);
        System.out.println(stringClass2.attendance);

        stringClass2.attendance += 7;

        System.out.println(stringsClass.attendance);

        // This variable has a static non access modifier
        System.out.println(IntroToString.attendance);

        String welcome = stringsClass.helloString;
        String hello = "Hello Everyone!";
        String hello2 = new String("Hello Everyone!");

        System.out.println(stringsClass.stringCount(welcome));

        // Note: denots assignment VS. == denotes comparison

        System.out.println(welcome == hello); // true
        System.out.println(welcome == hello2); // false

    }

}
