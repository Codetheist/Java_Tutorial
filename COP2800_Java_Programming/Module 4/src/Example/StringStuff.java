import java.util.Scanner;
import javax.swing.JOptionPane;

public class StringStuff {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {

            // Learning how to split and cat strings
            /*
             * String fullName = "Antoine Gustave"; String middle = "Denis";
             * 
             * int spacePos = fullName.indexOf(' ');
             * 
             * String first = fullName.substring(0, spacePos); String last =
             * fullName.substring(spacePos + 1);
             * 
             * System.out.println("Hello " + first + " " + last);
             * 
             * System.out.println();
             * 
             * char firstInitial = first.charAt(0); char lastInitial = last.charAt(0);
             * 
             * System.out.println("Please initial here: " + firstInitial + lastInitial);
             * 
             * System.out.println();
             * 
             * int nameLength = fullName.length();
             * 
             * System.out.println("Full name " + first + " " + middle + " " + last);
             * 
             * System.out.println();
             * 
             * System.out.println("Name length: " + nameLength);
             */

            // Learning to compare strings
            /*
             * String name1 = ""; String name2 = "";
             * 
             * System.out.println("Enter name #1: "); name1 = scan.next();
             * System.out.println("Enter name #2: "); name2 = scan.next();
             * 
             * if (name1.equals(name2)) { System.out.println("Equal!"); } else {
             * System.out.println("Not Equal!"); }
             */

            // Learning to covert Strings into other data type & use a GUI

            String num1 = JOptionPane.showInputDialog("Enter your first input: ");
            String num2 = JOptionPane.showInputDialog("Enter your second input: ");

            int numOne = Integer.parseInt(num1);
            int numTwo = Integer.parseInt(num2);

            System.out.println(numOne + numTwo);
            JOptionPane.showMessageDialog(null, (numOne + numTwo));

        } finally {

            scan.close();
        }
    }
}