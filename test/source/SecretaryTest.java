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
public class SecretaryTest {
    
    public SecretaryTest() {
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
     * Test of approvePatientAccounts method, of class Secretary.
     */
    @Test
    public void testApprovePatientAccounts() {
        System.out.println("approvePatientAccounts");
        Secretary instance = new Secretary();
        instance.approvePatientAccounts();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewAppointmentRequests method, of class Secretary.
     */
    @Test
    public void testViewAppointmentRequests() {
        System.out.println("viewAppointmentRequests");
        Secretary instance = new Secretary();
        instance.viewAppointmentRequests();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setupAppointment method, of class Secretary.
     */
    @Test
    public void testSetupAppointment() {
        System.out.println("setupAppointment");
        Secretary instance = new Secretary();
        instance.setupAppointment();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of giveMedicine method, of class Secretary.
     */
    @Test
    public void testGiveMedicine() {
        System.out.println("giveMedicine");
        Secretary instance = new Secretary();
        instance.giveMedicine();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removePatient method, of class Secretary.
     */
    @Test
    public void testRemovePatient() {
        System.out.println("removePatient");
        Patient patient = null;
        Secretary instance = new Secretary();
        instance.removePatient(patient);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of approvePatientRemoval method, of class Secretary.
     */
    @Test
    public void testApprovePatientRemoval() {
        System.out.println("approvePatientRemoval");
        Secretary instance = new Secretary();
        instance.approvePatientRemoval();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
