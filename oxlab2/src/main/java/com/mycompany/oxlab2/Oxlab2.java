/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oxlab2;

import java.util.Scanner;

/**
 *
 * @author minnie
 */
public class Oxlab2 {
    static char[][] board= {{'_', '_', '_'},{'_', '_', '_'},{'_', '_', '_'}};
    private static char player = 'X';
    private static int row;
     private static int col;
    public static void main(String[] args) {
       printStartGameOX();
       while(true) {
           printShowBoard();
       printShowTurn();
       printInputRowAndCol();
       switchPlayer();
           
       }
       
       
       
    }
    private static void  printStartGameOX() {
         System.out.println("WELCOME OX GAME 👀");
         System.out.println("Start Game ➤➤ (y/n): ");   
    }
    
    private static void  printShowBoard(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");

            }
            System.out.println("");

        }
         
    }
     private static void printShowTurn() {
        System.out.println("______________");
        System.out.println("Next Turn ➤➤ " + player);
    }
    private static void  printInputRowAndCol(){
        Scanner kb = new Scanner(System.in);
        System.out.print("Input row ➤ ");
        row = kb.nextInt();  
        System.out.print("Input column ➤ ");
        col = kb.nextInt();
        board[row-1][col-1] = player;
    }
    private static void switchPlayer(){
     
        if(player == 'X') {
            player = 'O';
        }else{
            player = 'X';
        }
        
    }
     
   
}
