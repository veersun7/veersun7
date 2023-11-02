package p2;

import java.util.Scanner;

public class Assignment1 {

    private Scanner scanner = new Scanner(System.in);;
    
//    public Assignment1109() {
//        scanner = new Scanner(System.in);
//    }
    public String getInput() {
//        System.out.print("Enter a phone number: ");
        return scanner.nextLine().trim();
    }
    public int validatePhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.isEmpty()) {
            return -1; // Empty/null input
        }
        int digitCount = 0;
        for (int i = 0; i < phoneNumber.length(); i++) {
            char ch = phoneNumber.charAt(i);
            if (ch == '-') {
                continue; // Ignore dashes
            }
            if (!Character.isDigit(ch)) {
                return 0; // Invalid character found
            }
            digitCount++;
        }
            if (digitCount != 10) {
                return 0; // Too many digits
            }
            else {
            	return 1;
            }
        
//        return (digitCount == 10) ? 1 : 0; // Valid if exactly 10 digits
    }
    public void displayResult(int result) {
        if (result == 1) {
            System.out.println("Valid");
        } else if (result == 0) {
            System.out.println("Invalid");
        } else {
            System.out.println("Empty string");
        }
    }
    public void closeScanner() {
        scanner.close();
    }
    public static void main(String[] args) {
    	Assignment1 validator = new Assignment1();
        String input = validator.getInput();
        int result = validator.validatePhoneNumber(input);
        validator.displayResult(result);
        validator.closeScanner();
    }
}