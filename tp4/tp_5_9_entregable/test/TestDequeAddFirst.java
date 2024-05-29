/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Before;
import org.junit.Test;
import tp_5_9_entregable.ArrayCircularDeque;
import tp_5_9_entregable.Deque;

/**
 *
 * @author ariel
 */
public class TestDequeAddFirst {

    // addLast y removeFirst implementaci�n libro
    private Deque<String> dq;

    @Before
    public void inicio() {
        dq = new ArrayCircularDeque<String>(6);
    }

    // deque vac�a
    @Test
    public void testDeque1() {
        dq.addFirst("Juan");
        assertEquals(dq.size(), 1);
        assertEquals(dq.removeFirst(), "Juan");
    }

    // deque con datos
    @Test
    public void testDeque2() {
        dq.addFirst("Juan");
        dq.addFirst("Pedro");
        assertEquals(dq.size(), 2);
        assertEquals(dq.removeFirst(), "Pedro");
        assertEquals(dq.removeFirst(), "Juan");
    }

    // deque sin espacio lanza excepci�n
    // deque sin espacio lanza excepci�n
    @Test(expected = IllegalStateException.class)
    public void testDeque3() {
        dq.addFirst("Pedro");
        dq.addFirst("Juan");
        dq.addFirst("Ana");
        dq.addFirst("Pablo");
        dq.addFirst("Maria");
        dq.addFirst("Jorge");
        dq.addFirst("Analia");
    }

    // deque arreglo circular
    @Test
    public void testDeque4() {
        dq.addLast("Pedro");
        dq.addLast("Juan");
        dq.addLast("Ana");
        dq.addLast("Pablo");
        dq.addLast("Maria");
        dq.removeFirst();

        dq.addFirst("Pedro");
        dq.addFirst("Analia");
        assertEquals(dq.size(), 6);
    }
}
