package getTextSize;

import java.util.Scanner;  // Import the Scanner class


public class getTextSizeMain {
    public static void main(String[] args) {
        boolean isActive = true;
        do {
            Scanner myStringObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter your text");
            String text = myStringObj.nextLine();  // Read user input
            System.out.println(getSizeFromText(text));

            Scanner myNumObj = new Scanner(System.in);
            System.out.println("Enter 1 if you want to enter another text");
            int num = myNumObj.nextInt();
            isActive = num == 1;
        } while (isActive);
    }
    public static int getSizeFromText(String text) {
        return text.length();
    }
}
