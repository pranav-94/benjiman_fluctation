```java
import java.util.Scanner;

public class Incrementdescrements {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.print("Enter the number of bulbs: ");
        int n = u.nextInt();

        // Use a boolean array to represent the state of the bulbs (true = on, false = off)
        // Array size n+1 to use 1-based indexing for bulbs
        boolean[] bulbs = new boolean[n + 1]; // Initially all false (off)

        // Simulate the toggling process
        // i represents the person number (or the factor)
        for (int i = 1; i <= n; i++) {
            // j represents the bulb number (or the multiple)
            // Start from i, and increment by i (i.e., i, 2i, 3i, ...)
            for (int j = i; j <= n; j += i) {
                // Toggle the state of bulb j
                bulbs[j] = !bulbs[j];
            }
        }

        // Print the numbers of the bulbs that are ON
        System.out.println("The bulbs that are ON are:");
        for (int i = 1; i <= n; i++) {
            if (bulbs[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Add a newline at the end

        u.close(); // Close the scanner
    }
}
```