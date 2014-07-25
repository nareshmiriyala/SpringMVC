/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.howtodoinjava.controller;
import com.dellnaresh.controller.EditEmployeeController;
import static com.dellnaresh.controller.EditEmployeeController.*;
import com.dellnaresh.entity.EmployeeEntity;
import com.dellnaresh.service.EmployeeManager;
import static java.util.Arrays.*;
import java.util.HashMap;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.mockito.Mockito.*;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;

/**
 *
 * @author nareshm
 */
public class EditEmployeeControllerTest {
    
    public EditEmployeeControllerTest() {
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
     * Test of listEmployees method, of class EditEmployeeController.
     */
    @Test
    public void testListEmployees() {
        System.out.println("listEmployees");
        List<EmployeeEntity> expectedSpittles =
asList(new EmployeeEntity(), new EmployeeEntity(), new EmployeeEntity());
      EmployeeManager spitterService = mock(EmployeeManager.class);
      when(spitterService.getAllEmployees()).thenReturn(expectedSpittles);
      EditEmployeeController controller =
new EditEmployeeController(spitterService);
      ModelMap model = new ModelMap();
      String viewName = controller.listEmployees(model);
      assertEquals("editEmployeeList", viewName);
    assertSame(expectedSpittles, model.get("employeeList"));
    }

//    /**
//     * Test of addEmployee method, of class EditEmployeeController.
//     */
//    @Test
//    public void testAddEmployee() {
//        System.out.println("addEmployee");
//        EmployeeEntity employee = null;
//        BindingResult result_2 = null;
//        EditEmployeeController instance = new EditEmployeeController();
//        String expResult = "";
//        String result = instance.addEmployee(employee, result_2);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of deleteEmplyee method, of class EditEmployeeController.
//     */
//    @Test
//    public void testDeleteEmplyee() {
//        System.out.println("deleteEmplyee");
//        Integer employeeId = null;
//        EditEmployeeController instance = new EditEmployeeController();
//        String expResult = "";
//        String result = instance.deleteEmplyee(employeeId);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setEmployeeManager method, of class EditEmployeeController.
//     */
//    @Test
//    public void testSetEmployeeManager() {
//        System.out.println("setEmployeeManager");
//        EmployeeManager employeeManager = null;
//        EditEmployeeController instance = new EditEmployeeController();
//        instance.setEmployeeManager(employeeManager);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
