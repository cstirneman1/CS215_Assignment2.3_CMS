package main;
import linkedlist.Queue;
import java.util.Scanner;

/**
 * This class represents an application for managing a queue of customers.
 * It allows users to enqueue new customers, dequeue customers, and exit the program.
 * The main method provides a menu for these operations.
 * 
 * @author cstirneman
 *
 */
public class Application {

	public static void main(String[] args) {
		
		Queue<String> queue = new Queue<String>();//create a queue that holds strings
		Scanner scan = new Scanner (System.in);
		int option; //used to store selection from menu
		boolean quit=true;//boolean used to exit program
		
		//while loop that uses a switch statement to generate a user menu and either queues, dequeus, or exits the program.
		while (quit ==true) {
			System.out.println("Select an option:\n1.Enqueue an customer\n2.Dequeue a customer\n3.Exit the program");
			option = scan.nextInt();
			
			switch (option) {
			//case that allows user to input customer name and add to front of the queue
			case 1:
				System.out.println("Enter a customer to enqueue:");
				String name = scan.next();
				System.out.println("Arrived: "+name);
				queue.enqueue(name);
				System.out.println("Queue: "+queue+" ");
				System.out.println("Enter any character to return to option menu.");
				scan.next();
				break;
			
				//case that removes a customer from the front of the queue
			case 2:
				if (!queue.isEmpty()) {
                    String dequeuedCustomer = queue.dequeue();
                    System.out.println("Served: " + dequeuedCustomer);
                } else {
                    System.out.println("Queue is empty. No more customers to serve.");
                }
                System.out.println("Queue: " + queue);
                System.out.println("Enter any character to return to the option menu.");
                scan.next();
                break;
               
            // exits the program    
			case 3:
				System.out.println("Closing program!");
				quit = false;
				break;
			
			//used for invalid input from the menu	
			default:
				System.out.println("Invalid choice. Press any character to return to option menu.");
				scan.next();
			}//end case statements
		}//end while loop
	}//end main

}//end class
