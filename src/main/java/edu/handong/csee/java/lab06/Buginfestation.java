package edu.handong.csee.java.lab06;// defining package which our class is in

import java.util.Scanner;// Gets the Scanner class from the package(library)java.util

/**
 * class Buginfestation is  designed to calculate how fast the house filled by roaches
 * Set Growth Rate to 0.95 and Volume of one bug to 0.002
 * @author jss21300418
 * @since 20180331
 */
public class Buginfestation // defining class Buginfestation
{
    public static final double GROWTH_RATE = 0.95; //weekly growth rate of the roach population (a constant 0.95)
    public static final double ONE_BUG_VOLUME = 0.002; //volume of an average roach (a constant 0.002)
     
    /**
     *  This is main method that starts our program
     *  Displaying texts and value from keyboard
     *  Until fulfillment of house, calculation is repeated by while 
     * @param args
     */
    public static void main (String [] args) // defining main method
    {
        System.out.println ("Enter the total volume of your house");// print out text
        System.out.print ("in cubic feet: ");// print out text and value from keyboard
        Scanner keyboard = new Scanner (System.in);// data can be entered using keyboard
        double houseVolume = keyboard.nextDouble ();// value from keyboard
        System.out.println ("Enter the estimated number of");// print out text
        System.out.print ("roaches in your house: ");// print out text and value from keyboard
        int startPopulation = keyboard.nextInt ();// value from keyboard
       
        double population = startPopulation; // assign value of startPopulation to population
        double totalBugVolume = population * ONE_BUG_VOLUME; //  assigning value of totalBugVolume
        double newBugs, newBugVolume;//varibale statement
        int countWeeks = 0;// assign 0 to countweeks
        while (totalBugVolume < houseVolume) // loop for totalbugvolume < housevolume conditon
        {
            newBugs = population * GROWTH_RATE;// number of roaches hatched this week
            newBugVolume = newBugs * ONE_BUG_VOLUME; // volume of new roaches
            population = population + newBugs;//current number of roaches
            totalBugVolume = totalBugVolume + newBugVolume; //total volume of all the roaches
            countWeeks++;// week counter
        }
        System.out.println ("Starting with a roach population of " + startPopulation);//print out text and value of startpopulation
        System.out.println ("and a house with a volume of " + houseVolume + " cubic feet,"); // print out text and value of houseVolume
        System.out.println ("after " + countWeeks + " weeks,"); // print out text and value of countweeks
        System.out.println ("the house will be filled with " + (int) population + " roaches."); // print out text and value of population
        System.out.println ("They will fill a volume of " +(int) totalBugVolume + " cubic feet."); //print out text and value of totalBugVolume
        System.out.println ("Better call Debugging Experts Inc."); // print out text
    }
}