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
public class OXProgramUnitTest {
    
    public OXProgramUnitTest() {
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
    public void testCheckWinNoPlayBY_O_output_false() {
        String[][] table = {{"-","-","-"},{"-","-","-"},{"-","-","-"}};
        String currentPlayer = "O";
        assertEquals(false, OXProgram.checkWin(table,currentPlayer));
    }
    @Test
    public void testCheckWinRowBY_O_output_true() {
        String[][] table = {{"-","-","-"},{"O","O","O"},{"-","-","-"}};
        String currentPlayer = "O";
        assertEquals(true, OXProgram.checkWin(table,currentPlayer));
    }
    @Test
    public void testCheckWinRow2BY_X_output_true() {
        String[][] table = {{"X","X","X"},{"-","O","O"},{"-","-","-"}};
        String currentPlayer = "X";
        assertEquals(true, OXProgram.checkWin(table,currentPlayer));
    }
    @Test
    public void testCheckWinRow3BY_X_output_true() {
        String[][] table = {{"-","-","-"},{"-","O","O"},{"X","X","X"}};
        String currentPlayer = "X";
        assertEquals(true, OXProgram.checkWin(table,currentPlayer));
    }
}
