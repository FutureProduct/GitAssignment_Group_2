/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitassignment_group2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gamer
 */
public class GitAssignment_group2Test {
    
    public GitAssignment_group2Test() {
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
     * Test of main method, of class GitAssignment_group2.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        GitAssignment_group2.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Aidan method, of class GitAssignment_group2.
     */
    @Test
    public void testAidan() {
        System.out.println("Aidan");
        GitAssignment_group2 instance = new GitAssignment_group2();
        instance.Aidan();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Micah method, of class GitAssignment_group2.
     */
    @Test
    public void testMicah() {
        System.out.println("Micah");
        GitAssignment_group2 instance = new GitAssignment_group2();
        instance.Micah();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Simon method, of class GitAssignment_group2.
     */
    @Test
    public void testSimon() {
        System.out.println("Simon");
        GitAssignment_group2 instance = new GitAssignment_group2();
        instance.Simon();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Nithish method, of class GitAssignment_group2.
     */
    @Test
    public void testNithish() {
        System.out.println("Nithish");
        GitAssignment_group2 instance = new GitAssignment_group2();
        instance.Nithish();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Ruslan method, of class GitAssignment_group2.
     */
    @Test
    public void testRuslan() {
        System.out.println("Ruslan");
        GitAssignment_group2 instance = new GitAssignment_group2();
        instance.Ruslan();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of David method, of class GitAssignment_group2.
     */
    @Test
    public void testDavid() {
        System.out.println("David");
        GitAssignment_group2 instance = new GitAssignment_group2();
        instance.David();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Paul method, of class GitAssignment_group2.
     */
    @Test
    public void testPaul() {
        System.out.println("Paul");
        GitAssignment_group2 instance = new GitAssignment_group2();
        instance.Paul();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getGroupMembers method, of class GitAssignment_group2.
     */
    @Test
    public void testGetGroupMembers() {
        System.out.println("getGroupMembers");
        GitAssignment_group2 instance = new GitAssignment_group2();
        String[] expResult = null;
        String[] result = instance.getGroupMembers();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class GitAssignment_group2.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        int num1 = 6;
        int num2 = 3;
        GitAssignment_group2 instance = new GitAssignment_group2();
        int expResult = 2;
        int result = instance.divide(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class GitAssignment_group2.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int num1 = 2;
        int num2 = 3;
        GitAssignment_group2 instance = new GitAssignment_group2();
        int expResult = 6;
        int result = instance.multiply(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of power method, of class GitAssignment_group2.
     */
    @Test
    public void testPower() {
        System.out.println("power");
        int num1 = 2;
        int num2 = 3;
        GitAssignment_group2 instance = new GitAssignment_group2();
        int expResult = 8;
        int result = instance.power(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
