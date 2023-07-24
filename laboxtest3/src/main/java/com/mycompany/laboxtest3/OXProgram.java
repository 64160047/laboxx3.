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
    
    static boolean checkWin(String[][] table,String currentPlayer) {
        if(checkRow(table,currentPlayer,0)) return true;
        if(checkRow(table,currentPlayer,1)) return true;
        if(checkRow(table,currentPlayer,2)) return true;
        return false;
    }

    private static boolean checkRow(String[][] table, String currentPlayer, int row) {
       return table[row][0].equals(currentPlayer)&&table[row][1].equals(currentPlayer)&&table[row][2].equals(currentPlayer);
    }
    
}
