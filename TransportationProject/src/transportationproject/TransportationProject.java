/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportationproject;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class TransportationProject {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args){
        // TODO code application logic here
        TransportationMethods tm = new TransportationMethods();
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose one of the following: Information, Time");
        String choice = input.nextLine();
        if (choice.matches("Information") || choice.matches("information")){
          System.out.println("If you wish to know about a specific line, enter 1."); 
          System.out.println("If you wish to know about a specific stop, enter 2.");
          int num = input.nextInt();
          if(num == 1){
              System.out.println("Please choose a line:Piraeus-Kifissia, Elliniko-Anthoupoli,"
                      + " Doukissis Plakentias-Aghia Marina");
              String line = input.nextLine();
              while(!input.hasNext()){
                  tm.showLines(line);
              }
              System.out.println("Please choose a station:");
              String station = input.nextLine();
          }else{
              if(num == 2){
              }
          }
        }else if(choice.matches("Time") || choice.matches("time")){
            System.out.println("Please insert the station you wish to start from: ");
            String start = input.nextLine();
            System.out.println("Please insert the station you wish to reach: ");
            String end = input.nextLine();
        }else{
            while(choice.isEmpty() || !choice.matches("Information") || !choice.matches("information")
                    || !choice.matches("Time") || !choice.matches("time")){
                System.out.println("Please choose one of the following: Information, Time");
                input.nextLine();
            }
        }
    }
}
    

