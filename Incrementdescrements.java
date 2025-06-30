```java
import java.util.Scanner;

public class Incrementdescrements {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.print("Enter the benjamin fluctation number: ");
        int n = u.nextInt();
        System.out.println("The bulbs will fluctuate at: ");

        // Improved logic: Instead of iterating through all numbers j and checking divisibility by i,
        // iterate through multiples of i directly up to n.
        for (int i = 1; i <= n; i++) {
            for (int multiple = i; multiple <= n; multiple += i) {
                System.out.print(multiple + " ");
            }
            System.out.println();
        }

        u.close(); // Close the scanner resource
    }
}
```