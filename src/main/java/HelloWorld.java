package main.java;

public class HelloWorld {

    // A single line comment
    /*
     * This is a multi-comment any info can go here
     */

    // Methods - a behavior of a class
     public static int favoriteNumber(){
        return 22;
     }

    // This main method is a special method in Java.
    // Every program needs a main method in order to run.
    // Why? It is the entry point of the application.
    public static void main(String[] args){
        // This is our method implementation 

        /*
        Java is a Object Oriented Language -> we create classes to act as blueprints
        and we create objects from those blueprints..
        However not everything in Java is an objects
         * There are 8 primitive types in Java
         * Whole Numbers                            Size
         * byte                                     1 byte (8 bit): -128 : 127
         * int                                      4 bytes (32 bits): *
         * float <- used for decimels               4 bytes (32 bits): *
         * double <- used for decimels              8 bytes (64 bits): *
         * short                                    2 bytes (16 bits): -32,768 to 32,767
         * long                                     8 bytes (64 bits): *
         * 
         * Single ASCII values
         * char                                     2 bytes (16 bits)
         * 
         * boolean (true or false values)
         */

        // These are variable: portable, reusable values that also represent the state of a class
        // Syntac for declaring variables: <access modifier><data type><name of the variable> = <value>

        int intValue = 1000000000;
        byte byteValue = 127;

        System.out.println(favoriteNumber());
        
    }

}