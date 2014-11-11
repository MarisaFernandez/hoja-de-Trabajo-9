/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo9;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marisaF
 */
public class AlgoritmoFloydTest {
    
    public AlgoritmoFloydTest() {
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
     * Test of caminoCorto method, of class AlgoritmoFloyd.
     */
    @Test
    public void testCaminoCorto() {
        System.out.println("caminoCorto");
        AlgoritmoFloyd instance = new AlgoritmoFloyd();
        instance.caminoCorto();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of centroGrafo method, of class AlgoritmoFloyd.
     */
    @Test
    public void testCentroGrafo() {
        System.out.println("centroGrafo");
        AlgoritmoFloyd instance = new AlgoritmoFloyd();
        instance.centroGrafo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarIntermedias method, of class AlgoritmoFloyd.
     */
    @Test
    public void testMostrarIntermedias() {
        System.out.println("mostrarIntermedias");
        int num1 = 0;
        int num2 = 0;
        AlgoritmoFloyd instance = new AlgoritmoFloyd();
        instance.mostrarIntermedias(num1, num2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
