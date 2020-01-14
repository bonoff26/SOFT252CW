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
public class AdminTest {
    
    public AdminTest() {
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
     * Test of createAdminAccount method, of class Admin.
     */
    @Test
    public void testCreateAdminAccount() {
        System.out.println("createAdminAccount");
        Admin instance = new Admin();
        instance.createAdminAccount();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modifyAccounts method, of class Admin.
     */
    @Test
    public void testModifyAccounts() {
        System.out.println("modifyAccounts");
        Admin instance = new Admin();
        instance.modifyAccounts();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewDoctor method, of class Admin.
     */
    @Test
    public void testViewDoctor() {
        System.out.println("viewDoctor");
        Admin instance = new Admin();
        instance.viewDoctor();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of provideFeedback method, of class Admin.
     */
    @Test
    public void testProvideFeedback() {
        System.out.println("provideFeedback");
        Admin instance = new Admin();
        instance.provideFeedback();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
