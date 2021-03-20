package com.maxhayday.cw.cw03.home_made_junit;

public class Main {
    public static void main(String[] args) {
        TestRunner testRunner = new TestRunner();


//           int i = TestRunner.class.getModifiers();
//           System.out.println(i);


//           TestClass testObject = new TestClass();
//           testRunner.runAllTests(testObject);
//           testRunner.runAllTestsForClass(TestClass.class);
        testRunner.runAllTestsForClassByName("com.maxhayday.cw.cw03.home_made_junit.TestClass");

    }
}
