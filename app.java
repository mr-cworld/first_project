import java.util.*;

public class app {
    
    public static void main(String[] args) throws Exception {

    final String myName = "Michael Cirino";
    final String lucProgram = "Computer Science Certificate";
    final String lucProgramType = "Certificate";
    final String myAspiration = "To find out if i love programing enough to make it my choice for a Masters";
    String programURL = "https://gpem.luc.edu/portal/program?name=computersciencecertificate";
    
    final double creditCost = 670; // findout what this number should be 

    Scanner scn = new Scanner(System.in);


    // Start of App

    System.out.println("Welcome, listed below is information pertaining to my program of Study at Loyala University!");
    System.out.println("");
    System.out.print("Please enter the number of credit hours taken this term/semester: ");
    double totalCredits = scn.nextDouble();
    System.out.println();
    System.out.println("Listed below you will find information pertaining to my academic program");
    printStars();
    System.out.println("  Name: " + myName);
    System.out.println("  Program Name: " + lucProgram);
    System.out.println("  Degree Type: " + lucProgramType);
    System.out.println("  Program Aspiration: " +myAspiration);
    System.out.println("  Program Page URL: "+ programURL);
    System.out.println("  Total # of Credits for program: " + (int)totalCredits); // had to use internet to figure out the (int) solution
    System.out.println("  Total cost per credit hour: $" + creditCost);
    double totalCost = creditCost * totalCredits;
    System.out.println("  Tuition this term: $"+ totalCost);
    printStars();

    }

    private static void printStars() 
    {
        int x = 0;
        while(x < 30) {
            System.out.print("*");
            x++;
        }
        System.out.println();
    }

}
