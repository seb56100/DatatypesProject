/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ressource;

import Temporel.Intervalle;
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
public class ReservationTest {
    
    public ReservationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getIntervalleAllocation method, of class Reservation.
     */
    @Test
    public void testGetIntervalleAllocation() {
        System.out.println("getIntervalleAllocation");
        Reservation instance = null;
        Intervalle expResult = null;
        Intervalle result = instance.getIntervalleAllocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIntervalleAllocation method, of class Reservation.
     */
    @Test
    public void testSetIntervalleAllocation() {
        System.out.println("setIntervalleAllocation");
        Intervalle intervalleAllocation = null;
        Reservation instance = null;
        instance.setIntervalleAllocation(intervalleAllocation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIntitule method, of class Reservation.
     */
    @Test
    public void testGetIntitule() {
        System.out.println("getIntitule");
        Reservation instance = null;
        String expResult = "";
        String result = instance.getIntitule();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIntitule method, of class Reservation.
     */
    @Test
    public void testSetIntitule() {
        System.out.println("setIntitule");
        String intitule = "";
        Reservation instance = null;
        instance.setIntitule(intitule);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajouterRessource method, of class Reservation.
     */
    @Test
    public void testAjouterRessource() {
        System.out.println("ajouterRessource");
        Ressource r = null;
        Reservation instance = null;
        instance.ajouterRessource(r);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}