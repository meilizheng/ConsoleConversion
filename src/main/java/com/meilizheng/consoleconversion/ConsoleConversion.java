/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.meilizheng.consoleconversion;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author belle
 */
public class ConsoleConversion {
    
    //declare the global arraylist
    public static ArrayList <Player> playerName = new ArrayList <Player>();
    public static ArrayList<String> namesToAdd = new ArrayList<String>();
    //declare Random,use for the rand number
    public static Random rand = new Random();
    
    public static void main(String[] args) 
    {
        System.out.println("Hello World!");
        //add player in namesToAdd list
        namesToAdd.add("Meili");
        namesToAdd.add("Belle");
        namesToAdd.add("Claire");
        namesToAdd.add("Zoe");
        namesToAdd.add("Ben");
        //use wilie loop let user choose options
        while(true)
        {
        System.out.println("\nPlease enter your choice:");
        System.out.println("1: Display all player");
        System.out.println("2: Display the player with odd number");
        System.out.println("3: Display the player's name start with the letter that you choose");
        System.out.println("4: Add a new player\n");
        //let user enter the choice number
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        //use switch for different option
        switch(userInput)
        {
                //call displayAllPlayers method
                case "1":
                    displayAllPlayers();
                    break;
                //call DisplayPlayerWithOddNumber method
                case "2":
                    DisplayPlayerWithOddNumber();
                    break;
                case "3":
                //call DisplayPlayerStartWithLetter method
                    DisplayPlayerStartWithLetter();
                    break;
                //call AddNewPlayer method
                case "4":
                     AddNewPlayer();
                    break;  
                //notification message for user
                default:
                    System.out.println("Please enter a valid number.\n");
        }
        }
    }
    //addPlayer method
    public static void addPlayer()
    {
        //use for loop to add player
        //this code is same as foreach in c#
        for (String name : namesToAdd) 
        {
            int playerNumber = rand.nextInt();
            //create a new instance
            Player player = new Player(name, playerNumber);
            //add the new player to PlayerName list 
            playerName.add(player);
        }
    }
    //displayAllPlayers method
    public static void displayAllPlayers() 
    {
        System.out.println("Display all players: \n");
        //call addPlayer method load the data
        addPlayer();
        //use for loop to display each player in the global list playerName
        for (Player player : playerName) 
        {
            System.out.println(player.getName() + ": " + player.getNumber());
        }
    }

    //DisplayPlayerWithOddNumber method
    public static void DisplayPlayerWithOddNumber()
    {
        //declare int varibel count, use it to check how many player's number is odd, if all the player's number is even, count = 0. will display notification message to user
        int count = 0;
        System.out.println("\nThe Player has odd number: ");
        for (Player player : playerName) 
        { 
            //use % check to check if the player's number is odd
            if (player.getNumber() % 2 != 0)
           {
               //if the player's number is odd count plus 1
               count++;
               System.out.println(player.getName() + ": " + player.getNumber());
           }   
        }
        //if count = 0, means didn't find the player with odd number
        if(count == 0)
        {
             System.out.println("Didn't find the player with odd number.");    
        }
    }
    //DisplayPlayerStartWithLetter method
    public static void DisplayPlayerStartWithLetter()
    {
        //let the user enter a letter, use it to search from the playerName list to find the matched info
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPlease enter a letter:");
        String input = scanner.next().toUpperCase();
        System.out.println("\nThe Player's name start with " + input);
        //use for loop the check each player's name in the plyaerName list
        for (Player player : playerName) 
        {
            //if player's name start letter is same as the user input, display player's name
             if (player.getName().startsWith(input)) 
           {
               System.out.println(player.getName());
           }
        }
    }
    //AddNewPlayer methos
    public static void AddNewPlayer()
    {
        //clear the list first to void the duplicate display
        playerName.clear();
        //let use add the new player's name
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPlease enter a new player name:\n");
        String input = scanner.next();
        //add new player to namesToAdd list
        namesToAdd.add(input);
        //call addPlayer method and display the updated list
        addPlayer();
        for (Player player : playerName) 
        {
            System.out.println(player.getName() + ": " + player.getNumber());
        }
    }
}
