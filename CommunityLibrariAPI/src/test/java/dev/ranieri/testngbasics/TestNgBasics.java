package dev.ranieri.testngbasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// We will be using TestNG for Java testing Test Next Generation
// it is second to JUnit in popularity but it's VERY similar
// all test methods @Test or the @Before @After are all void return types
public class TestNgBasics {

    // In Java any test that executes PASSES so long as as it does not throw an error

    @BeforeClass // will execute this setup method before any of the tests
    static void setup(){
        System.out.println("BEFORE CLASS");
    }

    @BeforeMethod
    void smallerSetup(){
        System.out.println("BEFORE EVERY TEST METHOD");
    }

    @Test(priority = 1)// priority is the way to run your tests in order // by default alpha-numeric
    void c(){
        System.out.println("Hello");
    }

//    @Test(priority = 2)
//    void a(){
//        System.out.println("Will fail");
//        throw new RuntimeException("EpicFail");
//    }

    @Test(priority = 3)
    void b(){
        System.out.println("Will pass");
    }

    @AfterClass
    static void teardown(){
        System.out.println("AFTER CLASS");
    }

}
