/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaconversion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ednal
 */
public class JAVACONVERSION
{
    
    //EDNA LYNN LAXA
    //COMPUTER PROGRAMMING IV 
    //ASSIGNMENT: CONSOLE CONVERSION - JAVA 
    // NOVEMEBR 6TH , 2023 
    
  static ArrayList<Player> playerArray = new ArrayList<>();  // GLOBALLY DECLARING ARRAY LIST
    
    public static void main(String[] args) 
    {
        
     //Create a global ArrayList to hold new Player objects
    //Preload your list with 5 Players.
    //Your choice of name and number
        
        Player player1 = new Player ("Wonderland", 11);  
        Player player2 = new Player ("Channing", 12); 
        Player player3 = new Player ("Kaivious", 13); 
        Player player4 = new Player ("Cherryfina", 14); 
        Player player5 = new Player ("Layelle", 15); 
        
        //ACTION TO ADD PLAYERS TO ARRAY LIST 
        playerArray.add(player1); 
        playerArray.add(player2);
        playerArray.add(player3);
        playerArray.add(player4);
        playerArray.add(player5);
        
     
        
        
        
//FUNCTIONALITY: 
//Display all players -
//Give the user a way to display all player names
//Loops
//Display players with odd numbers -
//Display all players with odd numbers
//Loops
//Conditions
//Check for odd numbers
//Display players with names that start with a letter -
//Let the user enter a letter.
//Display players who names have that letter
//Loops and conditions, and ask the user for a letter.
//In Java, you need to turn a String into a char array with .ToCharArray();
//Ex. char[] letters = "word".ToCharArray();
//Your looking for the first letter of the name.
//Case sensitivity is your choice.
//Add Player - Ask the user for a name and number. Add that player to the list.
//Add to your list
//You'll know it works if you redisplay players, and the new name shows up.

 Scanner userChoice  = new Scanner (System.in); // SCANNER , SIMILAR TO CONSOLE READLINE. , IMPORTED ABOVE TO ACTIVATE SCANNER 
 int userPicks; // userPick is an INT 
    do{ //using DO WHILE for menu. 
        
        Menu(); // Made a seperate method for menu  - Called method to display menu. 
        userPicks = userChoice.nextInt(); // Defining userPicks(int) as the variable for scanner. 

        
 //using Switch to aim and register user menu selection. 
        
        switch (userPicks)
        {
            case 1:  // DISPLAYING ALL PLAYERS 
            System.out.println("#1:"); // Displaying user menu selection. 
            System.out.println(""); // Just for spacing. 
            
            for (Player players : playerArray){
                    
                System.out.println(players.toString()); // My To String is working in my Player class, this prompts all players 
            
            }
           
            case 2:  // ODD NUMBER player 
                  System.out.println("#2");
            System.out.println("");
            
            for(Player players : playerArray) {
            
            if(players._number % 2 != 0) // This is the odd number equestion 
            {
                System.out.println(players); // This displays , players with an odd number 
            }
            
            }
            
            case 3:  //Honestly, this one didn't come out as goaled. May I ask for assistance? Please and thank you! 
            System.out.println("#3");
            System.out.println("");
            System.out.println("What letter?");
            Scanner letterSelect = new Scanner(System.in); 
            char userChar; 
          
            
            for(Player players : playerArray)
            {
                char[] charChar = players._name.toCharArray(); 
                
                if(letterSelect.hasNext()) {
                
                   userChar = letterSelect.next().charAt(0); 
                    System.out.println(players._name);
                
                }
            
            } 
            
            case 4: // ADD A NEW PLAYER 
        
            System.out.println("#4 Add a player");
            System.out.println("Name of your player?");
            Scanner userName = new Scanner(System.in);  // Scanner name is user name. 
            String nameUser = userName.next(); // Transitioning scanner name to String 
            System.out.println("Enter Player Number: "); 
            Scanner userNumber = new Scanner (System.in); // Scanner name for number is userNumber 
            int numOfuser = userNumber.nextInt(); // transitioning scanner to an integer , naming it numOfuser 
            Player addPlayer = new Player(nameUser, numOfuser); //Adding nameUser & numOfuser in the syntax of new player. Because of the data type, it registers the fields in Player class. 
            playerArray.add(addPlayer); // Add action. 
            System.out.println("Player Added!"); // Confirming that player was added 
            System.out.println("");
            
            for(Player newplayers : playerArray) 
            {
           
                System.out.println(newplayers.toString()); // The player list will display with the added player. 
            
            }
        }
    
    } while(userPicks != 0);  // The menu will loop 
    
 }
    public static void Menu(){ // The seperate method. MENU. 
        
        System.out.println("Playa Playa");
        System.out.println("------");
        System.out.println("1. See all players");
        System.out.println("2. What are the odds?");
        System.out.println("3. Search by a letter");
        System.out.println("4. Add a player");
        System.out.println("To choose from menu, just enter a number:");

        
        
    }
}
    
        

        
    

            
    
        
    
            
           
        
          

  
    
    
    
   
      
      