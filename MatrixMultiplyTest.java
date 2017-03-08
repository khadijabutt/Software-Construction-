/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixmultiply;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Khadija
 */
public class MatrixMultiplyTest {
    
    public MatrixMultiplyTest() {
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
     * Test of multiply method, of class MatrixMultiply.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int[][] a = {{1,2},{3,4}};
        int[][] b = {{1,2},{3,4}};
        int[][] expResult = {{7,10},{15,22}};
        int[][] result = MatrixMultiply.multiply(a, b);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of strassen method, of class MatrixMultiply.
     */
    @Test
    public void testStrassen() {
        System.out.println("strassen");
        int[][] a = {{1,2},{3,4}};
        int[][] b = {{1,2},{3,4}};
        int[][] expResult = {{7,10},{15,22}};
        int[][] result = MatrixMultiply.strassen(a, b);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
