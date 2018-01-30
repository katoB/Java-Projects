package ATChomework;

import java.util.Scanner;


//creating an airline reservation application where the user can be able to pick between first class or economy.
public class AirlineReservation
{
    //Providing input for the user
    private static Scanner input = new Scanner(System.in);

    //creating an boolean array object called 'seats' which can hold up to 10 seats(5 for first class, 5 for economy)
    private static boolean[] isSeatTaken = {false, false, false, false, false, false, false, false, false, false};


    //Calls the assignSeats method
    public void startApplication()
    {
        assignSeats();
    }

    //method that assigns seat to the user
    private void assignSeats()
    {
        //prompting the user to pick between first class seats and economy seats
        System.out.println("Welcome to Kato's airline reservation.\n\nEnter 1 for first class seats or 2 for economy seats");
        System.out.println("Enter 3 to see what seats are available");

        int choice = input.nextInt();
        input.nextLine();

        switch(choice)
        {
            case 1:
                firstClassSeats();
                break;
            case 2:
                economySeats();
                break;
            case 3:
                isOccupied();
                break;
            default:
                System.out.println("Invalid Choice.\nNow exiting application...");
        }

        message();
    }


    //prompts the user which first class seats from 1 to 5 they want to be on
    private void firstClassSeats()
    {
        try {
            boolean flag = true;

            //if all first class seats are taken then will prompt user if they want to switch to economy seats
            if(isSeatTaken[0] == true && isSeatTaken[1] == true && isSeatTaken[2] == true &&
                    isSeatTaken[3] == true && isSeatTaken[4] == true) {
                System.out.println("First Class seats are currently full. Would you like to switch to Economy seats?\n" +
                        "Y for yes, No or no");

                String option = input.nextLine();

                if (option.equalsIgnoreCase("y")) {

                    economySeats();

                } else {

                    System.out.println("Next flight leaves in 3 hours!");
                    message();

                }
            }

            //prompts user for first class seat
            while(flag != false)
            {
                flag = false;

                System.out.println("Which seats would you like to reserve? First class covers 1 through 5");
                String choice = input.nextLine();
                int choiceInt = Integer.parseInt(choice);
                int minusOne = choiceInt - 1;

                //validates te user's input and ensures that only number 1 - 5 are entered
                while(choiceInt >= 1 && choiceInt < 6)
                {
                    //assigns the user the seat they have chosen
                    if(isSeatTaken[minusOne] != true)
                    {
                        isSeatTaken[minusOne] = true;

                        System.out.println("You have assinged yourself seat " + choiceInt + ". Thank you for your service.");
                        System.out.println();

                        System.out.println("Boarding Pass: Section: First Class, Seat: " + choiceInt);
                        System.out.println();

                    }else if (isSeatTaken[minusOne] == true)
                    {
                        System.out.println("Seat " + choiceInt + " is already taken.\nWould you like to try again?\n");
                        System.out.println("Y for yes, N for no.");

                        String answer = input.nextLine();

                        if(answer.equalsIgnoreCase("y"))
                        {
                            firstClassSeats();
                        }
                    }

                    //prompts the user if they want to view the current occupancy of the seats on the plane
                    System.out.println("Would you like to see the seats already taken?\nY for yes or N for no.");
                    String answer = input.nextLine();

                    if(answer.equalsIgnoreCase("y"))
                    {
                        isOccupied();
                    }

                    //Prompts the user if they want to assign another seat
                    System.out.println("Would you like to assign another seat?\nY for yes or N for no.");
                    answer = input.nextLine();

                    if(answer.equalsIgnoreCase("y"))
                    {
                        assignSeats();
                    }

                }

                System.out.println("Invalid Choice\nPlease pick between 1 through 5");

                flag = true;

            }
        }catch (Exception e)
        {
            System.out.println("Something went wrong:" + e.getMessage());
        }
    }

    //prompts the user which economy seat they want to be on
    private void economySeats()
    {
        try {
            boolean flag = true;

            //if all first economy seats are taken then will prompt user if they want to switch to first class seats
            if(isSeatTaken[5] == true && isSeatTaken[6] == true && isSeatTaken[7] == true &&
                    isSeatTaken[8] == true && isSeatTaken[9] == true) {

                System.out.println("Economy seats are currently full. Would you like to switch to first class?\n" +
                        "Y for yes, No or no");

                String option = input.nextLine();

                if (option.equalsIgnoreCase("y")) {
                    firstClassSeats();
                } else {
                    System.out.println("Next flight leaves in 3 hours!");
                    message();

                }
            }

            //prompts user for economy seats then assigns the seat
            while(flag != false) {
                flag = false;

                System.out.println("Which seats would you like to reserve? Economy covers 6 through 10");
                String choice = input.nextLine();
                int choiceInt = Integer.parseInt(choice);
                int choicee = choiceInt - 1;

                //validates te user's input and ensures that only number 6 - 10 are entered
                while(choiceInt > 5 && choiceInt <= 10)
                {
                    if (isSeatTaken[choicee] != true) {
                        isSeatTaken[choicee] = true;

                        System.out.println("You have assinged yourself seat " + choiceInt + ". Thank you for your service.");
                        System.out.println();

                        System.out.println("Boarding Pass: Section: Economy, Seat: " + choiceInt);
                        System.out.println();

                    } else {
                        //if the user picks a seat that is already taken this will prompt the user if they would like to
                        //try again
                        System.out.println("Seat " + choiceInt + " is already occupied.\nWould you like to try again?");
                        System.out.println();
                        System.out.println("Y for yes, N for no.");

                        String answer = input.nextLine();

                        if (answer.equalsIgnoreCase("y")) {
                            economySeats();
                        } else {
                            flag = false;
                        }
                    }

                    //This asks the user if they would like to see the seats that are taken already.
                    System.out.println("Would you like to see the seats already taken?\nY for yes or N for no.");
                    String answer = input.nextLine();

                    if (answer.equalsIgnoreCase("y")) {
                        isOccupied();
                    }

                    //Asking the user if they would like to assign another seat
                    System.out.println("Would you like to assign another seat?\nY for yes or N for no.");
                    answer = input.nextLine();

                    if (answer.equalsIgnoreCase("y")) {
                        assignSeats();
                    }
                }

                System.out.println("Invalid Choice\nPlease pick between 6 through 10");

                flag = true;

            }
        }catch (Exception e)
        {
            System.out.println("Something went wrong:" + e.getMessage());
        }
    }

    //shows seats that are and are not occupied
    private void isOccupied()
    {
        try {

            for (int i = 0; i < isSeatTaken.length; i++) {

                System.out.println("Is seat " + (i+1) + " occupied? " + isSeatTaken[i]);
            }
        }catch(Exception e)
        {
            System.out.println("Something went wrong:" + e.getMessage());
        }
    }

    //prints message when user exits application
    private void message()
    {
        System.out.println("Thank you for choosing Kato Airlines! Please come again!");
        System.out.println();
    }

}
