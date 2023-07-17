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
    public static String start;
    public static String[][] board = {{"_", "_", "_"}, {"_", "_", "_"}, {"_", "_", "_"}};
    public static String turn;
    public static int row;
    public static int col;
    public static boolean play = false;
    public static boolean end;
   
    public static void main(String[] args) {
        printStartGameOX(); 
     

    }
    public static void printStartGameOX() {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME OX GAME 👀");
        System.out.print("Start Game ➤➤ (y/n): ");
        start = sc.nextLine().toLowerCase();
        while (!start.equals("n") && !start.equals("y")) {
            System.out.print("Start Game ➤➤ (y/n): ");
            start = sc.nextLine().toLowerCase();
        }
        if (start.equals("n")) {
            play = false;
        } else {
            play = true;
        }
    }


    
}
