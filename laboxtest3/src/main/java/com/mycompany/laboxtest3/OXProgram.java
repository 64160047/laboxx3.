/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboxtest3;

/**
 *
 * @author minnie
 */
class OXProgram {
    
     static boolean checkWin(String[][] table, String turn, int row, int col) {
        if (checkRow(table, turn, row, col) || checkCol(table, turn, row, col) || checkDiagonal(table, turn, row, col)) {
            return true;
        }
        return false;
    }
     static boolean checkDraw(String[][] table) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table[i][j].equals("-")) {
                    return false;
                }
            }
        }
        return true;
    }



    private static boolean checkRow(String[][] table, String turn, int row, int col) {
        for (int j = 0; j < 3; j++) {
            if (!table[row - 1][j].equals(turn)) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkCol(String[][] table, String turn, int row, int col) {
        for (int j = 0; j < 3; j++) {
            if (!table[0][col - 1].equals(turn)) {
                return false;
            }
        }
        return true;
    }
    private static boolean checkDiagonal(String[][] table, String turn, int row, int col) {
        if (row - 1 == col - 1) {
            for (int i = 0; i < 3; i++) {
                if (!table[i][i].equals(turn)) {
                    return false;
                }
            }
            return true;
        }
        if ((row + col) - 2 == 2) {
            for (int i = 0; i < 3; i++) {
                if (!table[i][2 - i].equals(turn)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    



    

    
}
