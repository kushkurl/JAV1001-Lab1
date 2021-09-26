//Kushagra Kurl
//A00246944
//MAPD: MOBILE APPLICATION DEVELOPMENT - fall 2021
//This is JAV-1001 - 91349 - App Development for Android - 202109 - 001 lab 1 - logic and variables

import java.util.Scanner;

class ConvertSIUnits {
  public static void main(String args[]) {
    System.out.println("Welcome to the SI Unit conversion app made in JAVA!");
    String toContinue = null;

    do{
      //initialized all the variables here
      toContinue = null;
      Scanner userInput = new Scanner(System.in);
      System.out.print("Enter the value: ");
      //to entered integer value or decimal value
      double inputVal = userInput.nextDouble();
      System.out.print("Enter the SI unit you want to convert: ");
      //to be entered SI unit in string
      String unitType = userInput.next();

      //below are the if else statements to match the SI unit which user has entered
      if(unitType.toLowerCase().trim().equals("km"))
      //dynamically showing results for each conversion in pritn statement
        System.out.println(inputVal + " " + unitType + " is equal to: " + (inputVal*0.621371) + " Miles");

      else if(unitType.toLowerCase().trim().equals("cm"))
        System.out.println(inputVal + " " + unitType + " is equal to: " + (inputVal*0.393701) + " inches");

      else if(unitType.toLowerCase().trim().equals("kg"))
        System.out.println(inputVal + " " + unitType + " is equal to: " + (inputVal*2.20462) + " pounds");

      else if(unitType.toLowerCase().trim().equals("kb"))
        System.out.println(inputVal + " " + unitType + " is equal to: " + (inputVal*0.001) + " mb");

      //for units with alias names we can use regular expressions #regex
      else if(unitType.toLowerCase().trim().equals("c") || unitType.toLowerCase().equals("celsius")) {
        double toFahrenheit = (inputVal*9/5) + 32;
        System.out.println(inputVal + " " + unitType + " is equal to: " + toFahrenheit + " fahrenheit");
      }

      else if(unitType.toLowerCase().trim().equals("joule"))
        System.out.println(inputVal + " " + unitType + " is equal to: " + (inputVal*0.239006) + " gram calorie");

      else if(unitType.toLowerCase().trim().equals("pascal"))
        System.out.println(inputVal + " " + unitType + " is equal to: " + (inputVal/133) + " torr");

      //this block will run if user has entered some other SI unit not available here
      else {
        System.out.println("The unit enterd " + unitType + " is incorrect or application does not have appropriate conversion mehtod available! Please enter other SI unit. To continue press 'y' ");
        toContinue = userInput.next();
      }

      //this will check if user already wish to continue or has not made decision yet
      if(toContinue == null) {
        if(true) {
          System.out.println("Do do wish to convert other unit! If yes then press 'y' key.");
          toContinue = userInput.next();
        }
      }
    }
    while(toContinue.toLowerCase().equals("y"));
  }
}
