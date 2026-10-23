package maven.practice;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.time.Duration;

/**
 * Unit test for simple App.
 */

public class AppTest 
{
    @BeforeAll 
    static void Beforeall()
    {
        System.out.println("Before all tests");
    }
    App app;
    @BeforeEach 
    void setUp()
    {

        app = new App();
        // Code to set up test environment before each test
    }
    @Test
    void testAdd()
    {
        int result = app.add(2, 3);
        assertEquals(5, result);
    }
    @Test
    void testAdd1()
    {
    
        int result = app.add(3, 3);
        assertNotEquals(8, result);
    }
    @Test
    void testFactorial()
    {
    
        int[] numbers = {2, 3, 4};
        assertEquals(24, app.factorial(numbers));
        assertEquals(25,app.factorial(numbers));
    }

    @Test 
    void area_of_rectangle()
    {
  
        int length = 5;
        int width = 4;
        int result = app.areaOfRectangle(length, width);
        assertEquals("Area of rectangle should be 20", 20, result);
    }
    @Test 
    void reverse_of_string()
    {
    
        String name = "hello";
        assertTrue(app.reverseOfString(name).equals("olleh"));
        assertFalse("INCORRECT REVERSE",app.reverseOfString(name).equals("oellh"));
    }

    @Test 
    void testArrayTest()
    {
    
        int[] numbers = {1, 2, 3, 4};
        assertArrayEquals(numbers,app.arraytest(numbers) );
        assertEquals(numbers[0], app.arraytest(numbers)[0]);//integer
    }

    @Test 
    void testSortArray()
    {   
        int[] numbers = {1, 2, 3};
        assertThrows(NullPointerException.class, () -> app.sort_array(numbers));
    }


    @Test 
    void testmillliseconds()
    {
        int[] numbers = {1, 2, 3};
        assertTimeout(Duration.ofMillis(1), () -> app.sort_array(numbers));
    }

    //junit 4
    @Test()
    @Timeout(1)
    void testSortArrayTimeout()
    {
        int[] numbers = {1, 2, 3};
        app.sort_array(numbers);
    }
    @AfterEach  //executes after each test method
    void tearDown()
    {
        app = null;
        System.out.println("Tear down after each test");
    }

    @AfterAll //writes after all tests are done
    static void Afterall()
    {
        System.out.println("After all tests");
    }
    
}
