/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.laboxtest3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author minnie
 */
public class CalculationUnitTest {
    
    public CalculationUnitTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testAdd_num1_1_num2_2_output_3() {
        int result = Calculation.add(1,2);
        assertEquals(3,result);
    }
    @Test
    public void testAdd_num1_3_num2_5_output_8() {
        int result = Calculation.add(3,5);
        assertEquals(8,result);
    }
    @Test
    public void testAdd_num1_5_num2_5_output_10() {
        int result = Calculation.add(5,5);
        assertEquals(10,result);
    }
}
