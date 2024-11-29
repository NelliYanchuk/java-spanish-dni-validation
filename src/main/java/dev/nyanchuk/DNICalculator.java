package dev.nyanchuk;

import java.util.Scanner;

public class DNICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dniInput;
        while (true) {
            System.out.print("\nPlease enter the 8-digit DNI number: ");
            dniInput = scanner.nextLine();
            try {
                int dni = Integer.parseInt(dniInput);
                if ((dniInput.length() == 8) && (dni >= 0 && dni <= 99999999)) {
                    String letter = getDNILetter(dni);
                    System.out.println("The letter corresponding to the DNI number " + dni + " is: " + letter);
                    break;
                } else {
                    System.out.println("The entered number is out of range. Please enter a valid 8-digit number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("The entered data is incorrect. Please enter a valid number.");
            }
        }
        scanner.close();
    }

    // Modify method to return the letter instead of printing it
    public static String getDNILetter(int dni) {

        String[] letters = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", 
        "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E" };

        int index = dni % 23;
        return letters[index]; // Return the letter instead of printing
    }
}
