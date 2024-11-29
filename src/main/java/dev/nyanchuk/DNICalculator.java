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
                String letter = validateDNI(dniInput);
                System.out.println("The letter corresponding to the DNI number " + dniInput + " is: " + letter);
                break;  // Exit the loop if valid input is provided
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }

    // Method that validates DNI input and returns corresponding letter
    public static String validateDNI(String dniInput) {
        try {
            int dni = Integer.parseInt(dniInput);
            if (dniInput.length() != 8) {
                throw new IllegalArgumentException("The entered number is out of range. Please enter a valid 8-digit number.");
            }
            String[] letters = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", 
                                  "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", 
                                  "C", "K", "E" };
            int index = dni % 23;
            return letters[index];
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("The entered data is incorrect. Please enter a valid number.");
        }
    }
}
