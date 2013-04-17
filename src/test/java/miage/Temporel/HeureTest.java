/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miage.Temporel;

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
public class HeureTest {
    
    //  Heure à tester avec le premier constructeur
    private Heure h1;
    
    //  Heure à tester avec le second constructeur
    private Heure h2;
    
    public HeureTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        h1 = new Heure(22, 28, 10);
        h2 = new Heure(15, 30);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getHeures method, of class Heure.
     */
    @Test
    public void testGetHeures() {
        //  Test du premier constructeur
        System.out.println("getHeures - Constructeur 1");
        Integer expResult1 = 22;
        Integer result1 = h1.getHeures();
        assertEquals(expResult1, result1);
        
        //  Test du deuxième constructeur
        System.out.println("getHeures - Constructeur 2");
        Integer expResult2 = 15;
        Integer result2 = h2.getHeures();
        assertEquals(expResult2, result2);
    }

    /**
     * Test of setHeures method, of class Heure.
     */
    @Test
    public void testSetHeures() {
        System.out.println("setHeures");
        Integer heures = null;
        Heure instance = null;
        instance.setHeures(heures);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMinutes method, of class Heure.
     */
    @Test
    public void testGetMinutes() {
        System.out.println("getMinutes");
        Heure instance = null;
        Integer expResult = null;
        Integer result = instance.getMinutes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMinutes method, of class Heure.
     */
    @Test
    public void testSetMinutes() {
        System.out.println("setMinutes");
        Integer minutes = null;
        Heure instance = null;
        instance.setMinutes(minutes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSecondes method, of class Heure.
     */
    @Test
    public void testGetSecondes() {
        System.out.println("getSecondes");
        Heure instance = null;
        Integer expResult = null;
        Integer result = instance.getSecondes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSecondes method, of class Heure.
     */
    @Test
    public void testSetSecondes() {
        System.out.println("setSecondes");
        Integer secondes = null;
        Heure instance = null;
        instance.setSecondes(secondes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}