import java.util.Scanner;

/**
 * This is a program that will be incorperated into an escape room in a box in
 * the future
 * the point of it is to create severa different enciphered texts that can all
 * be solved in
 * order to find a 6 digit code that will unlock a box with the next puzzle.
 * 
 * Cipher1 simply turns the text into its ASCII value
 * 
 * Cipher2 is TBD but maybe a simple ceaser cipher
 * 
 * Cipher3 is TBD but maybe an inversion cipher
 * 
 * @author Jake Gertz
 */
public class Codex {
    public static void main(String[] args) throws InterruptedException {
        Scanner inputScan = new Scanner(System.in);
        Boolean continuMain = true;

        while (continuMain) {
            System.out.println("Welcome to the Cipher Text Puzzel");
            System.out.print("Please Pick Which cipher you would like to solve first by typing 1, 2, 3, or q to quit: ");
            String userInput = inputScan.nextLine().toLowerCase().substring(0, 1);

            switch (userInput) {
                case "1":
                    final String CIPHER_TEXT = "84 104 101 32 70 105 114 83 116 32 84 87 79 32 110 117 109 98 101 114 115 32 79 102 32 116 72 69 32 99 111 109 98 105 110 65 116 105 111 110 32 97 114 101 32 83 101 118 101 78 32 84 72 101 110 32 122 69 111";

                    System.out.println("Cipher 1");
                    Encoder encoder = new Encoder();
                    System.out.print("The Encoded Message is: ");
                    System.out.println(CIPHER_TEXT);
                    System.out.println("\n--------------------------------------------------\n");
                    System.out.println("To decipher the message you will need to enter text into the encoder");
                    System.out.println("which will encypher your message using the same sceme as the coded text!");
                    System.out.println("\n--------------------------------------------------\n");

                    Boolean continueing = true;
                    while (continueing) {
                        String menuOptions = "qhcmi";
                        System.out.print("Menu: \nPlease make a selection or type h for details on the menu options: ");
                        userInput = inputScan.nextLine().toLowerCase().substring(0, 1);
                        if (!menuOptions.contains(userInput)) {
                            System.out.print("Invalid Menu Option Please Try Again: ");
                        } else {
                            switch (userInput) {
                                case "q":
                                    continueing = false;
                                    break;

                                case "h":
                                    System.out.println("'h' pulls up details on menu options");
                                    System.out.println("'q' exits this program");
                                    System.out.println("'c' allows you to enter some plain text to be enciphered");
                                    System.out.println("'m' will print out the message you are trying to decode\n");
                                    break;

                                case "c":
                                    System.out.print("\nEnter your message to encode: ");
                                    String message = inputScan.nextLine();
                                    encoder.Cypher1(message);
                                    System.out.println("\n" + encoder.GetCypherText() + "\n");
                                    break;

                                case "m":
                                    System.out.println(CIPHER_TEXT);
                                    break;

                                case "i":
                                    System.out.println(
                                            "Instructions: \n The aim of this puzzel is to decipher the message into english words");
                                    System.out.println(
                                            "You do this by entering in your own text which will be converted into ciphered text");
                                    System.out.println(
                                            "Using the same scheme as the encoded message you are trying to solve.");
                                    System.out.println(
                                            "Once you figure out the encoded message you can then exit the program and continue on to the next puzzle.");
                                    break;
                            }
                        }
                    }
                    System.out.println("Exiting to Main Menu\n");
                    Thread.sleep(2500);
                    break;
                
                case "2":
                    System.out.println("Cipher 2");
                    Encoder encoder2 = new Encoder();
                    System.out.println("-----------------------------");
                    System.out.println("To solve this puzzel you will have to figure out how the");
                    System.out.println("plain texts are encoded by first seeing the plain text and");
                    System.out.println("the cipher text. Choose Which text to see by entering a number");
                    System.out.println("From 1-10 when prompted!\n-----------------------------\n");

                    Boolean cipher2Continue = true;
                    while(cipher2Continue){
                        System.out.print("\nMenu: \nPlease make a selection or type h for details on the menu options: ");
                        userInput = inputScan.nextLine().toLowerCase().substring(0, 1);
                        switch(userInput){
                            case "h":
                                System.out.println("'h' for details on menu options");
                                System.out.println("'c' to enter a number and see both the plain text and cipher text of a message");
                                System.out.println("'m' to see the cipher text version of the message you are trying to solve");
                                System.out.println("'q' to quit to main menu");
                                break;
                            
                            case "c":
                                System.out.print("Enter a number from 1-10 to see the plain and cipher text ");
                                System.out.print("of the linked message\nEnter a number between 1-10: ");
                                int userInt = inputScan.nextInt();
                                inputScan.nextLine();
                                if(userInt > 0 && 11 > userInt){
                                    encoder2.Cypher2(userInt-1);
                                } else {
                                    System.out.println("Please enter a valid input, expected a number between 1 and 10");
                                }
                                break;

                            case "m":
                                System.out.println("The encoded message is as follows\n");
                                System.out.println("xlmvh ryqfiv mr xli gshi mw xlvii jsyvxl mw imklx");
                                break;
                            
                            case "q":
                                System.out.println("Quitting to main menu");
                                cipher2Continue = false;
                                Thread.sleep(2000);
                                break;
                            
                            default:
                                System.out.println("Invalid input, please select a valid option!");
                        }

                    }
                    break;
                
                case "3":
                    System.out.println("In Progress\n");
                    break;
                
                case "q":
                    System.out.println("Thanks for playing...come back soon!\n");
                    continuMain = false;
                    Thread.sleep(3000);
                    break;
                
                default:
                    System.out.println("Invalid option, please try again\n");
            }
        }
        inputScan.close();

    }
}