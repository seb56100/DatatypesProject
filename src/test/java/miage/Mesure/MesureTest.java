/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miage.Mesure;

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
public class MesureTest {
    
    public MesureTest() {
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
     * Test of getQuantite method, of class Mesure.
     */
    @Test
    public void testGetQuantite() {
        System.out.println("getQuantite");
        Mesure instance = null;
        int expResult = 0;
        int result = instance.getQuantite();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUnite method, of class Mesure.
     */
    @Test
    public void testGetUnite() {
        System.out.println("getUnite");
        Mesure instance = null;
        Unite expResult = null;
        Unite result = instance.getUnite();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantite method, of class Mesure.
     */
    @Test
    public void testSetQuantite() {
        System.out.println("setQuantite");
        int quantite = 0;
        Mesure instance = null;
        instance.setQuantite(quantite);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUnite method, of class Mesure.
     */
    @Test
    public void testSetUnite() {
        System.out.println("setUnite");
        Unite unite = null;
        Mesure instance = null;
        instance.setUnite(unite);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}