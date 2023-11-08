/**
 * The Main class generates a pattern of steps on the console.
 * It uses nested loops to create the pattern, where the number of steps and the width of each step can be adjusted.
 */
public class Main {
    public static void main(String[] args) {
        int numSteps = 5;     // Number of steps
        int stepWidth = 3;    // Width of each step

        for (int i = 0; i < numSteps; i++) {
            for (int j = 0; j < (i + 1) * stepWidth; j++) {
                System.out.print("*"); // Print asterisk character
            }
            System.out.println(); // Move to the next line for the next step
        }
    }
}
