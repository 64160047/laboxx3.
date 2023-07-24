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
        String turn = "O";
          int row = 1;
          int col = 1;
        assertEquals(false, OXProgram.checkWin(table, turn , row, col));
    }
    @Test
    public void testCheckWinRow1BY_O_output_true() {
        String[][] table = {{"O","O","O"},{"X","X","-"},{"-","-","-"}};
        String turn = "O";
         int row = 1;
         int col = 1;
        assertEquals(true, OXProgram.checkWin(table,turn, row, col));
    }
    @Test
    public void testCheckWinRow1BY_X_output_true() {
        String[][] table = {{"X","X","X"},{"O","O","-"},{"-","-","-"}};
        String turn = "X";
         int row = 1;
         int col = 1;
        assertEquals(true, OXProgram.checkWin(table,turn, row, col));
    }
    @Test
    public void testCheckWinRow2BY_O_output_true() {
        String[][] table = {{"-","-","-"},{"O","O","O"},{"-","-","-"}};
        String turn = "O";
         int row = 2;
         int col = 2;
        assertEquals(true, OXProgram.checkWin(table,turn, row, col));
    }
    @Test
    public void testCheckWinRow2BY_X_output_true() {
        String[][] table = {{"-","-","-"},{"X","X","X"},{"-","-","-"}};
        String turn = "X";
         int row = 2;
         int col = 2;
        assertEquals(true, OXProgram.checkWin(table,turn, row, col));
    }
    @Test
    public void testCheckWinRow3BY_O_output_true() {
        String[][] table = {{"X","-","-"},{"-","X","-"},{"O","O","O"}};
         String turn = "O";
         int row = 3;
         int col = 3;
        assertEquals(true, OXProgram.checkWin(table,turn, row, col));
    }
    @Test
    public void testCheckWinRow3BY_X_output_true() {
         String[][] table = {{"-","O","O"},{"O","O","X"},{"X","X","X"}};
         String turn = "X";
         int row = 3;
         int col = 3;
        assertEquals(true, OXProgram.checkWin(table,turn, row, col));
    }
     @Test
    public void testCheckWinCol1By_O_output_true() {
        String[][] table = {{"O", "-", "-"}, {"O", "X", "X"}, {"O", "-", "-"}};
        String turn = "O";
        int row = 1;
        int col = 1;
        assertEquals(true, OXProgram.checkWin(table, turn, row, col));
    }
    @Test
    public void testCheckWinCol1By_X_output_true() {
        String[][] table = {{"X", "-", "O"}, {"X", "X", "-"}, {"X", "O", "O"}};
        String turn = "X";
        int row = 1;
        int col = 1;
        assertEquals(true, OXProgram.checkWin(table, turn, row, col));
    }
    @Test
    public void testCheckWinCol2By_O_output_true() {
        String[][] table = {{"X", "O", "O"}, {"X", "O", "-"}, {"-", "O", "X"}};
        String turn = "O";
        int row = 2;
        int col = 2;
        assertEquals(true, OXProgram.checkWin(table, turn, row, col));
    }
     @Test
    public void testCheckWinCol2By_X_output_true() {
        String[][] table = {{"O", "X", "-"}, {"-", "X", "-"}, {"-", "X", "O"}};
        String turn = "X";
        int row = 2;
        int col = 2;
        assertEquals(true, OXProgram.checkWin(table, turn, row, col));
    }
    @Test
     public void testCheckWinCol3By_O_output_true() {
        String[][] table = {{"-", "-", "O"}, {"X", "-", "O"}, {"X", "-", "O"}};
        String turn = "O";
        int row = 3;
        int col = 3;
        assertEquals(true, OXProgram.checkWin(table, turn, row, col));
    }
    public void testCheckWinCol3By_X_output_true() {
        String[][] table = {{"-", "-", "X"}, {"-", "O", "X"}, {"-", "O", "X"}};
        String turn = "X";
        int row = 3;
        int col = 3;
        assertEquals(true, OXProgram.checkWin(table, turn, row, col));
    }
    @Test
    public void testCheckWinDiagonal1By_O_output_true() {
        String[][] table = {{"O", "-", "X"}, {"-", "O", "X"}, {"-", "-", "O"}};
        String turn = "O";
        int row = 3;
        int col = 3;
        assertEquals(true, OXProgram.checkWin(table, turn, row, col));
    }
    @Test
    public void testCheckWinDiagonal1By_X_output_true() {
        String[][] table = {{"X", "-", "O"}, {"-", "X", "O"}, {"-", "-", "X"}};
        String turn = "X";
        int row = 3;
        int col = 3;
        assertEquals(true, OXProgram.checkWin(table, turn, row, col));
    }

    @Test
    public void testCheckWinDiagonal2By_O_output_true() {
        String[][] table = {{"-", "-", "O"}, {"-", "O", "-"}, {"O", "-", "-"}};
        String turn = "O";
        int row = 3;
        int col = 3;
        assertEquals(true, OXProgram.checkWin(table, turn, row, col));
    }
     @Test
    public void testCheckWinDiagonal2By_X_output_true() {
        String[][] table = {{"O", "-", "X"}, {"-", "X", "O"}, {"X", "-", "-"}};
        String turn = "X";
        int row = 3;
        int col = 3;
        assertEquals(true, OXProgram.checkWin(table, turn, row, col));
    }
    
    @Test
    public void testCheckDraw_output_true() {
        String[][] table = {{"X", "O", "X"}, {"O", "X", "O"}, {"O", "X", "O"}};
        assertEquals(true, OXProgram.checkDraw(table));
    }





}
