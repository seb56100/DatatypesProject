/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ressource;

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
public class RessourceMaterielleTest {
    
    public RessourceMaterielleTest() {
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
     * Test of getMobilite method, of class RessourceMaterielle.
     */
    @Test
    public void testGetMobilite() {
        System.out.println("getMobilite");
        RessourceMaterielle instance = null;
        Boolean expResult = null;
        Boolean result = instance.getMobilite();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMobilite method, of class RessourceMaterielle.
     */
    @Test
    public void testSetMobilite() {
        System.out.println("setMobilite");
        Boolean mobilite = null;
        RessourceMaterielle instance = null;
        instance.setMobilite(mobilite);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}