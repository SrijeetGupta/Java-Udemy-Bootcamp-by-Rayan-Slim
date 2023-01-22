import java.util.Scanner;

public class YourInitials {
    public static void main(String[] args) {
        // Instructions for this workbook are on Learn the Part (See the Udemy Video: Your Initials to access the link).
        Scanner keyboard = new Scanner(System.in);
        String initialString;
        boolean validInput = false;

        System.out.println("Enter your initials and I will print them in a grid.");
        initialString = keyboard.nextLine();

        while(!isValidInitial(initialString)){
            System.out.println("Input not valid. Re-enter an initial string A-Z or a-z");
            initialString = keyboard.nextLine();
        }

    }

    private static boolean isValidInitial(String string) {
        boolean isValid = false;
        if (string != null) {
            if (string.matches("^[a-zA-Z]")) {
                isValid = true;
            }
        }
        return isValid;
    }
}