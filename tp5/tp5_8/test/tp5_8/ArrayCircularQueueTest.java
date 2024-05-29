/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package tp5_8;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ariel
 */
public class ArrayCircularQueueTest {
    
    public ArrayCircularQueueTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of size method, of class ArrayCircularQueue.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ArrayCircularQueue instance = new ArrayCircularQueue();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class ArrayCircularQueue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        ArrayCircularQueue instance = new ArrayCircularQueue();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enqueue method, of class ArrayCircularQueue.
     */
    @Test
    public void testEnqueue() {
        System.out.println("enqueue");
        Object e = null;
        ArrayCircularQueue instance = new ArrayCircularQueue();
        instance.enqueue(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of first method, of class ArrayCircularQueue.
     */
    @Test
    public void testFirst() {
        System.out.println("first");
        ArrayCircularQueue instance = new ArrayCircularQueue();
        Object expResult = null;
        Object result = instance.first();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dequeue method, of class ArrayCircularQueue.
     */
    @Test
    public void testDequeue() {
        System.out.println("dequeue");
        ArrayCircularQueue instance = new ArrayCircularQueue();
        Object expResult = null;
        Object result = instance.dequeue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ArrayCircularQueue.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ArrayCircularQueue instance = new ArrayCircularQueue();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rotate method, of class ArrayCircularQueue.
     */
    @Test
    public void testRotate() {
        System.out.println("rotate");
        ArrayCircularQueue instance = new ArrayCircularQueue();
        instance.rotate();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
