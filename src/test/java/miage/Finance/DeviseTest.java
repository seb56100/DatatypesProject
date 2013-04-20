/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miage.Finance;

import java.util.Date;
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
public class DeviseTest {
    
    public DeviseTest() {
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
     * Test of getNom method, of class Devise.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Devise instance = null;
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNom method, of class Devise.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "";
        Devise instance = null;
        instance.setNom(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPays method, of class Devise.
     */
    @Test
    public void testGetPays() {
        System.out.println("getPays");
        Devise instance = null;
        String expResult = "";
        String result = instance.getPays();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPays method, of class Devise.
     */
    @Test
    public void testSetPays() {
        System.out.println("setPays");
        String pays = "";
        Devise instance = null;
        instance.setPays(pays);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class Devise.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Devise instance = null;
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class Devise.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Date date = null;
        Devise instance = null;
        instance.setDate(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}