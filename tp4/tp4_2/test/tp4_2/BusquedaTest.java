/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package tp4_2;

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
public class BusquedaTest {
    
    public BusquedaTest() {
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
     * Test of binarySearch method, of class Busqueda.
     */
    @Test
    public void testBinarySearch() {
        System.out.println("binarySearch");
        int[] data = null;
        int target = 0;
        int low = 0;
        int high = 0;
        boolean expResult = false;
        boolean result = Busqueda.binarySearch(data, target, low, high);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of busquedaBinIte method, of class Busqueda.
     */
    @Test
    public void testBusquedaBinIte() {
        System.out.println("busquedaBinIte");
        int[] array = null;
        int num = 0;
        int expResult = 0;
        int result = Busqueda.busquedaBinIte(array, num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
