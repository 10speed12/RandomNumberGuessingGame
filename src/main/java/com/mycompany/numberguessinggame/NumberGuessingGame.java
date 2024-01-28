/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numberguessinggame;
// import javax.swing.*;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author 10spe
 */
public class NumberGuessingGame {
    public static Random randomizer=new Random();
    public static Scanner input=new Scanner(System.in);
    public static int numberOfWins=0;
    public static int numberOfLosses=0;
    public static void main(String[] args) {
       /* 
       JFrame frame = new JFrame("My First GUI");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(300,300);
       JButton button = new JButton("Press");
       frame.getContentPane().add(button); // Adds Button to content pane of frame
       frame.setVisible(true);
        */
       game();
    }
    public static void game(){
        int randomNum = randomizer.nextInt(99)+1;
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");
        try{
            int guess= input.nextInt();
            while(guess>100 || guess<=0){
               System.out.println("I said between 1 and 100. Try again.");
               guess=input.nextInt();
            }
            if(guess==randomNum){
               System.out.println("That's right! You win!");
               numberOfWins++;
            }else{
                System.out.println("Too bad! I was thinking of "+randomNum+"!");
                numberOfLosses++;
            }
            System.out.println("You have won "+numberOfWins+" games, and lost "+numberOfLosses+" games.");
            System.out.println("Want to try again? Y/N");
            String replay=input.next();
            while(!replay.equalsIgnoreCase("yes") && !replay.equalsIgnoreCase("y") 
               && !replay.equalsIgnoreCase("no")&& !replay.equalsIgnoreCase("n")){
                System.out.println("Please enter Yes, No, Y, or N.");
                replay=input.next();
            }
            if(replay.toLowerCase().equals("yes") || replay.toLowerCase().equals("y")){
                game();
            }else{
                System.out.println("Ending program.");
                System.exit(0);
            }
       }catch(java.util.InputMismatchException e){
           System.out.println("Error, invalid input entered. Exiting game.");
           System.exit(0);
       }
    }
}
