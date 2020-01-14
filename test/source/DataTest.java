/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author tomal
 */
public class DataTest {
    
    public DataTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of setup method, of class Data.
     */
    @Test
    public void testSetup() throws Exception {
        System.out.println("setup");
        Data.setup();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveUsers method, of class Data.
     */
    @Test
    public void testSaveUsers() throws Exception {
        System.out.println("saveUsers");
        Data.saveUsers();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setActiveID method, of class Data.
     */
    @Test
    public void testSetActiveID() {
        System.out.println("setActiveID");
        String id = "";
        Data.setActiveID(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of requestAccount method, of class Data.
     */
    @Test
    public void testRequestAccount() {
        System.out.println("requestAccount");
        Patient input = null;
        Data.requestAccount(input);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRequestByID method, of class Data.
     */
    @Test
    public void testFindRequestByID() {
        System.out.println("findRequestByID");
        String ID = "";
        int expResult = 0;
        int result = Data.findRequestByID(ID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findMedicine method, of class Data.
     */
    @Test
    public void testFindMedicine() {
        System.out.println("findMedicine");
        String ID = "";
        int expResult = 0;
        int result = Data.findMedicine(ID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of terminate method, of class Data.
     */
    @Test
    public void testTerminate() {
        System.out.println("terminate");
        int id = 0;
        Data.terminate(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findTermination method, of class Data.
     */
    @Test
    public void testFindTermination() {
        System.out.println("findTermination");
        String ID = "";
        int expResult = 0;
        int result = Data.findTermination(ID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByID method, of class Data.
     */
    @Test
    public void testFindByID() {
        System.out.println("findByID");
        String ID = "";
        int expResult = 0;
        int result = Data.findByID(ID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkLogin method, of class Data.
     */
    @Test
    public void testCheckLogin() {
        System.out.println("checkLogin");
        String expResult = "";
        String result = Data.checkLogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of increment method, of class Data.
     */
    @Test
    public void testIncrement() {
        System.out.println("increment");
        int num = 0;
        Data.increment(num);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNextID method, of class Data.
     */
    @Test
    public void testGetNextID_int() {
        System.out.println("getNextID");
        int num = 0;
        int expResult = 0;
        int result = Data.getNextID(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNextIDArray method, of class Data.
     */
    @Test
    public void testGetNextIDArray() {
        System.out.println("getNextIDArray");
        int[] expResult = null;
        int[] result = Data.getNextIDArray();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of popObject method, of class Data.
     */
    @Test
    public void testPopObject() {
        System.out.println("popObject");
        User[] array = null;
        User item = null;
        User[] expResult = null;
        User[] result = Data.popObject(array, item);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteRequest method, of class Data.
     */
    @Test
    public void testDeleteRequest() {
        System.out.println("deleteRequest");
        Patient[] array = null;
        Patient item = null;
        Patient[] expResult = null;
        Patient[] result = Data.deleteRequest(array, item);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInstance method, of class Data.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        Data expResult = null;
        Data result = Data.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createPatient method, of class Data.
     */
    @Test
    public void testCreatePatient() {
        System.out.println("createPatient");
        Patient[] array = null;
        Patient user = null;
        Patient[] expResult = null;
        Patient[] result = Data.createPatient(array, user);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createDoctor method, of class Data.
     */
    @Test
    public void testCreateDoctor() {
        System.out.println("createDoctor");
        Doctor[] array = null;
        Doctor user = null;
        Doctor[] expResult = null;
        Doctor[] result = Data.createDoctor(array, user);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createAdmin method, of class Data.
     */
    @Test
    public void testCreateAdmin() {
        System.out.println("createAdmin");
        Admin[] array = null;
        Admin user = null;
        Admin[] expResult = null;
        Admin[] result = Data.createAdmin(array, user);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createSecretary method, of class Data.
     */
    @Test
    public void testCreateSecretary() {
        System.out.println("createSecretary");
        Secretary[] array = null;
        Secretary user = null;
        Secretary[] expResult = null;
        Secretary[] result = Data.createSecretary(array, user);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMedicine method, of class Data.
     */
    @Test
    public void testAddMedicine() {
        System.out.println("addMedicine");
        Medicine medicine = null;
        Data.addMedicine(medicine);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTermination method, of class Data.
     */
    @Test
    public void testAddTermination() {
        System.out.println("addTermination");
        Patient[] array = null;
        Patient user = null;
        Patient[] expResult = null;
        Patient[] result = Data.addTermination(array, user);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pushObject method, of class Data.
     */
    @Test
    public void testPushObject() {
        System.out.println("pushObject");
        Prescription[] array = null;
        Prescription prescription = null;
        Prescription[] expResult = null;
        Prescription[] result = Data.pushObject(array, prescription);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addReview method, of class Data.
     */
    @Test
    public void testAddReview() {
        System.out.println("addReview");
        Review[] array = null;
        Review review = null;
        Data.addReview(array, review);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInstance method, of class Data.
     */
    @Test
    public void testSetInstance() {
        System.out.println("setInstance");
        Data instance_2 = null;
        Data.setInstance(instance_2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPatients method, of class Data.
     */
    @Test
    public void testGetPatients() {
        System.out.println("getPatients");
        Patient[] expResult = null;
        Patient[] result = Data.getPatients();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNextID method, of class Data.
     */
    @Test
    public void testGetNextID_0args() {
        System.out.println("getNextID");
        int[] expResult = null;
        int[] result = Data.getNextID();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
