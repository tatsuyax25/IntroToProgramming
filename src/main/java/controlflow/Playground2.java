package main.java.controlflow;

public class Playground2 {
    
    public static void main(String[] args) {

        IntroToControlFlow controlFlowClass = new IntroToControlFlow();

        IntroToControlFlow flowControlClass = new IntroToControlFlow();

        // Access variables on an instance of the class ^.
        System.out.println(controlFlowClass.instanceVar);
        System.out.println(controlFlowClass.staticVar);

        System.out.println(flowControlClass.instanceVar);
        System.out.println(flowControlClass.staticVar);


        // Access variables on the class itself. (statically)
        System.out.println(IntroToControlFlow.staticVar);
        // System.out.println(IntroToControlFlow.instanceVar);


        System.out.println("---------------------------");

        // Change the value of the instanceVar in my controlFlowClass
        controlFlowClass.instanceVar = "This is the controlFlowClassInstance";
        flowControlClass.instanceVar = "This is the flowControlClassInstance";
        IntroToControlFlow.staticVar = "Today is a great day!";

        System.out.println(controlFlowClass.instanceVar);
        System.out.println(flowControlClass.instanceVar);
        // System.out.println(IntroToControlFlow.staticVar);

        controlFlowClass.staticVar = "A lovelyyy dayyy";
        System.out.println(IntroToControlFlow.staticVar);

        flowControlClass.staticVar = "Summmerr Time";
        System.out.println(IntroToControlFlow.staticVar);

        IntroToControlFlow.staticVar = "What's is going on?";
        System.out.println(controlFlowClass.staticVar);

        controlFlowClass.instanceVar = "Happy Birthday!";
        System.out.println(flowControlClass.instanceVar);
        System.out.println(controlFlowClass.instanceVar);

        // Practicing with our control flow statements an iteratives

        IntroToControlFlow practiceInstance = new IntroToControlFlow();

        System.out.println(practiceInstance.ifStatement("Wednesday"));
        System.out.println(practiceInstance.ifStatement("Tuesday"));
        System.out.println(practiceInstance.ifStatement("wednesday"));

        System.out.println(practiceInstance.ifElseStatement("Apple"));
        System.out.println(practiceInstance.ifElseStatement("Pineapple"));

        System.out.println(practiceInstance.forLoopIterative());

    }
}
