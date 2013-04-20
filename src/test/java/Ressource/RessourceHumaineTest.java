/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ressource;

import Adresse.InfoPerso;
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
public class RessourceHumaineTest {
    
    public RessourceHumaineTest() {
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
     * Test of getFonction method, of class RessourceHumaine.
     */
    @Test
    public void testGetFonction() {
        System.out.println("getFonction");
        RessourceHumaine instance = null;
        String expResult = "";
        String result = instance.getFonction();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFonction method, of class RessourceHumaine.
     */
    @Test
    public void testSetFonction() {
        System.out.println("setFonction");
        String fonction = "";
        RessourceHumaine instance = null;
        instance.setFonction(fonction);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInfos method, of class RessourceHumaine.
     */
    @Test
    public void testGetInfos() {
        System.out.println("getInfos");
        RessourceHumaine instance = null;
        InfoPerso expResult = null;
        InfoPerso result = instance.getInfos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInfos method, of class RessourceHumaine.
     */
    @Test
    public void testSetInfos() {
        System.out.println("setInfos");
        InfoPerso infos = null;
        RessourceHumaine instance = null;
        instance.setInfos(infos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}