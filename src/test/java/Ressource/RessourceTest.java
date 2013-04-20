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
public class RessourceTest {
    
    public RessourceTest() {
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
     * Test of getDisponibilite method, of class Ressource.
     */
    @Test
    public void testGetDisponibilite() {
        System.out.println("getDisponibilite");
        Ressource instance = null;
        Boolean expResult = null;
        Boolean result = instance.getDisponibilite();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDisponibilite method, of class Ressource.
     */
    @Test
    public void testSetDisponibilite() {
        System.out.println("setDisponibilite");
        Boolean disponibilite = null;
        Ressource instance = null;
        instance.setDisponibilite(disponibilite);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNom method, of class Ressource.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Ressource instance = null;
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNom method, of class Ressource.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "";
        Ressource instance = null;
        instance.setNom(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}