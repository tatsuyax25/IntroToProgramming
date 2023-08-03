package main.java.playground;
import main.java.HelloWorld;
import main.java.string.IntroToString;

// Note: The Object is the parent class for ALL objects created in Java.
public class App {
    
    public static void main(String[] args) {
        
        IntroToString stringsClass = new IntroToString();
        IntroToString stringClass2 = new IntroToString("Day 3 was Great!");

        // This variable has a static non access modifier
        System.out.println(IntroToString.attendance);

        String welcome = stringsClass.helloString;
        String hello = "Hello Everyone!";
        String hello2 = new String("Hello Everyone!");

        System.out.println(stringsClass.stringCount(welcome));

        // Note: denots assignment VS. == denotes comparison

        System.out.println(welcome.equalsIgnoreCase(hello2));

        //.equals allows us to compare strings regardless of their memory locations
        //if we use == on an impicit String definition , and compare it to a string
        // that is definied using the 'new' keyword , even if they are the same
        //we will get a false return. For that reason we have the equals method.

        // .equalsIgnoreCase() - this method allows us to compare strings
        //regardless of their casing.

        int favNum = HelloWorld.favoriteNumber();
        System.out.println(favNum);
        //because the favoriteNumber method has the static non access modifier in its signature
        //we are able to call the method on the class itself.
        System.out.println(HelloWorld.favoriteNumber());

        System.out.println(welcome == hello); // true
        System.out.println(welcome == hello2); // false

        System.out.println(stringsClass.helloString);
        System.out.println(stringClass2.helloString);

        System.out.println(stringsClass.attendance);
        System.out.println(stringClass2.attendance);

        stringClass2.attendance += 7;

        System.out.println(stringsClass.attendance);

    }

}
