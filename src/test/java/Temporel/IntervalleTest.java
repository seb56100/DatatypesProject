/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Temporel;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author john.gdowe
 */
public class IntervalleTest {
    
    //  Intervalle de test
    private Intervalle it;
    
    public IntervalleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        it = new Intervalle(new Heure(9,0), new Heure(12, 0));
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of gethDebut method, of class Intervalle.
     */
    @Test
    public void testGethDebut() {
        System.out.println("gethDebut");
        Intervalle instance = null;
        Heure expResult = null;
        Heure result = instance.gethDebut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sethDebut method, of class Intervalle.
     */
    @Test
    public void testSethDebut() {
        System.out.println("sethDebut");
        Heure hDebut = null;
        Intervalle instance = null;
        instance.sethDebut(hDebut);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gethFin method, of class Intervalle.
     */
    @Test
    public void testGethFin() {
        System.out.println("gethFin");
        Intervalle instance = null;
        Heure expResult = null;
        Heure result = instance.gethFin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sethFin method, of class Intervalle.
     */
    @Test
    public void testSethFin() {
        System.out.println("sethFin");
        Heure hFin = null;
        Intervalle instance = null;
        instance.sethFin(hFin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dureeEnMinutes method, of class Intervalle.
     */
    @Test
    public void testDureeEnMinutes() {
        System.out.println("dureeEnMinutes");
        int expResult = 180;
        int result = it.dureeEnMinutes();
        assertEquals(expResult, result);
    }
}