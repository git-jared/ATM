/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myatm;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Hashtable;

/**
 *
 * @author acer main
 */
public class MyATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int choice;
        //Represents which page of the dictionary you are on.
        Hashtable<String, Integer> userNames = new Hashtable<>();
        Hashtable <Integer, Integer> accounts = new Hashtable<>();
        Scanner in = new Scanner(System.in);
        //Main loop where our app runs.
        do
        {
            System.out.println("1. Deposit money to your account.");
            System.out.println("2. Withdraw money from your account.");
            System.out.println("3. Display your current total.");
            System.out.println("4. Delete your account.");
            
            choice = in.nextInt();
           
            switch(choice){
                case 1:
                    deposit();
                    break;      
                case 2:
                    withdraw();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    delete();
                    break;
                
            }
            
        } while(choice != 0);
        in.close();
    }
    }
    

