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
public class ModificarArchivoTest {
    
    public ModificarArchivoTest() {
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
     * Test of write method, of class ModificarArchivo.
     */
    @Test
    public void testWrite() throws Exception {
        System.out.println("write");
        String cadena = "";
        ModificarArchivo instance = new ModificarArchivo();
        instance.write(cadena);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of matrizPesos method, of class ModificarArchivo.
     */
    @Test
    public void testMatrizPesos() throws Exception {
        System.out.println("matrizPesos");
        ModificarArchivo instance = new ModificarArchivo();
        InterfazGrafo expResult = null;
        InterfazGrafo result = instance.matrizPesos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of arregloNom method, of class ModificarArchivo.
     */
    @Test
    public void testArregloNom() throws Exception {
        System.out.println("arregloNom");
        ModificarArchivo instance = new ModificarArchivo();
        InterfazGrafo expResult = null;
        InterfazGrafo result = instance.arregloNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenermiArchivo method, of class ModificarArchivo.
     */
    @Test
    public void testObtenermiArchivo() throws Exception {
        System.out.println("obtenermiArchivo");
        String direccion = "";
        ModificarArchivo instance = new ModificarArchivo();
        instance.obtenermiArchivo(direccion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
