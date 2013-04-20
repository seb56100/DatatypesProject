/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miage.Adresse;

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
public class AdresseMailTest {
    
    private AdresseMail mail;
    
    public AdresseMailTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        mail = new AdresseMail("test", "junit.com");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNom method, of class AdresseMail.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        AdresseMail instance = null;
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDomaine method, of class AdresseMail.
     */
    @Test
    public void testGetDomaine() {
        System.out.println("getDomaine");
        AdresseMail instance = null;
        String expResult = "";
        String result = instance.getDomaine();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNom method, of class AdresseMail.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "";
        AdresseMail instance = null;
        instance.setNom(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDomaine method, of class AdresseMail.
     */
    @Test
    public void testSetDomaine() {
        System.out.println("setDomaine");
        String domaine = "";
        AdresseMail instance = null;
        instance.setDomaine(domaine);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class AdresseMail.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "test@junit.com";
        String result = mail.toString();
        assertEquals(expResult, result);
    }
}