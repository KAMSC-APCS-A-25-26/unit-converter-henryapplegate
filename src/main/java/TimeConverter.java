import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean convert = true;

        while (convert) {
            System.out.println("Convert time to total seconds");
            System.out.print("Enter hours: ");
            int hours = sc.nextInt();
            System.out.print("Enter minutes: ");
            int minutes = sc.nextInt();
            System.out.print("Enter seconds: ");
            int seconds = sc.nextInt();

            int totalSeconds = hours * 3600 + minutes * 60 + seconds;

            System.out.println("\nTime Conversion:");
            System.out.printf("Input: %d hour%s, %d minute%s, and %d second%s\n",
                    hours, (hours == 1 ? "" : "s"),
                    minutes, (minutes == 1 ? "" : "s"),
                    seconds, (seconds == 1 ? "" : "s"));

            System.out.println("Total seconds: " + totalSeconds + " seconds");
            System.out.println("\nCalculation:");
            System.out.printf("%d hour%s × 3600 = %d seconds\n", hours, (hours == 1 ? "" : "s"), hours * 3600);
            System.out.printf("%d minute%s × 60 = %d seconds\n", minutes, (minutes == 1 ? "" : "s"), minutes * 60);
            System.out.printf("%d second%s = %d seconds\n", seconds, (seconds == 1 ? "" : "s"), seconds);
            System.out.println("Total: " + totalSeconds + " seconds");

            System.out.print("\nDo you want to convert another time? (y/n): ");
            String choice = sc.next();
            if (!choice.equalsIgnoreCase("y")) {
                convert = false;
                System.out.println("Goodbye!");
            } else {
                System.out.println();
            }
        }
    }
}