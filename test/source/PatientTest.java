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
public class PatientTest {
    
    public PatientTest() {
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
     * Test of getDoctor method, of class Patient.
     */
    @Test
    public void testGetDoctor() {
        System.out.println("getDoctor");
        Patient instance = new Patient();
        Doctor expResult = null;
        Doctor result = instance.getDoctor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDoctor method, of class Patient.
     */
    @Test
    public void testSetDoctor() {
        System.out.println("setDoctor");
        Doctor doctor = null;
        Patient instance = new Patient();
        instance.setDoctor(doctor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewDoctor method, of class Patient.
     */
    @Test
    public void testViewDoctor() {
        System.out.println("viewDoctor");
        Doctor doc = null;
        Patient instance = new Patient();
        instance.viewDoctor(doc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of requestAppointment method, of class Patient.
     */
    @Test
    public void testRequestAppointment() {
        System.out.println("requestAppointment");
        Doctor doc = null;
        String notes = "";
        String time = "";
        Patient instance = new Patient();
        instance.requestAppointment(doc, notes, time);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPrescription method, of class Patient.
     */
    @Test
    public void testAddPrescription() {
        System.out.println("addPrescription");
        Prescription input = null;
        Patient instance = new Patient();
        instance.addPrescription(input);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAppointment method, of class Patient.
     */
    @Test
    public void testAddAppointment() {
        System.out.println("addAppointment");
        Appointment input = null;
        Patient instance = new Patient();
        instance.addAppointment(input);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewHistory method, of class Patient.
     */
    @Test
    public void testViewHistory() {
        System.out.println("viewHistory");
        Patient instance = new Patient();
        instance.viewHistory();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewPrescription method, of class Patient.
     */
    @Test
    public void testViewPrescription() {
        System.out.println("viewPrescription");
        Patient instance = new Patient();
        String expResult = "";
        String result = instance.viewPrescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of requestTermination method, of class Patient.
     */
    @Test
    public void testRequestTermination() {
        System.out.println("requestTermination");
        Patient instance = new Patient();
        instance.requestTermination();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewPatient method, of class Patient.
     */
    @Test
    public void testViewPatient() {
        System.out.println("viewPatient");
        Patient instance = new Patient();
        instance.viewPatient();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Patient.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Patient instance = new Patient();
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAppointments method, of class Patient.
     */
    @Test
    public void testGetAppointments() {
        System.out.println("getAppointments");
        Patient instance = new Patient();
        Appointment[] expResult = null;
        Appointment[] result = instance.getAppointments();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOldAppointments method, of class Patient.
     */
    @Test
    public void testGetOldAppointments() {
        System.out.println("getOldAppointments");
        Patient instance = new Patient();
        Appointment[] expResult = null;
        Appointment[] result = instance.getOldAppointments();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrescriptions method, of class Patient.
     */
    @Test
    public void testGetPrescriptions() {
        System.out.println("getPrescriptions");
        Patient instance = new Patient();
        Prescription[] expResult = null;
        Prescription[] result = instance.getPrescriptions();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Patient.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Patient instance = new Patient();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Patient.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Patient instance = new Patient();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAddress method, of class Patient.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Patient instance = new Patient();
        String expResult = "";
        String result = instance.getAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAddress method, of class Patient.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "";
        Patient instance = new Patient();
        instance.setAddress(address);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Patient.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Patient instance = new Patient();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Patient.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Patient instance = new Patient();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhoneNumber method, of class Patient.
     */
    @Test
    public void testGetPhoneNumber() {
        System.out.println("getPhoneNumber");
        Patient instance = new Patient();
        int expResult = 0;
        int result = instance.getPhoneNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhoneNumber method, of class Patient.
     */
    @Test
    public void testSetPhoneNumber() {
        System.out.println("setPhoneNumber");
        int phoneNumber = 0;
        Patient instance = new Patient();
        instance.setPhoneNumber(phoneNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Patient.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Patient instance = new Patient();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Patient.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Patient instance = new Patient();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAppointments method, of class Patient.
     */
    @Test
    public void testSetAppointments() {
        System.out.println("setAppointments");
        Appointment[] appointments = null;
        Patient instance = new Patient();
        instance.setAppointments(appointments);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOldAppointments method, of class Patient.
     */
    @Test
    public void testSetOldAppointments() {
        System.out.println("setOldAppointments");
        Appointment[] oldAppointments = null;
        Patient instance = new Patient();
        instance.setOldAppointments(oldAppointments);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrescriptions method, of class Patient.
     */
    @Test
    public void testSetPrescriptions() {
        System.out.println("setPrescriptions");
        Prescription[] prescriptions = null;
        Patient instance = new Patient();
        instance.setPrescriptions(prescriptions);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
