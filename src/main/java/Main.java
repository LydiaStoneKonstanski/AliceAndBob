import java.util.Objects;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer on Jan 2024.
 */
public class Main {
    // Create a Scanner object to read input from the console
    static String a = "Alice";
    static String b = "Bob";
    static Scanner scanner = new Scanner(System.in);
//compute
    public static void main(String[] args){

        System.out.print("Input your full name: ");
        String yourName = scanner.nextLine();

        if (Objects.equals(yourName, a))
            System.out.println("Hello " + yourName);

        else if (Objects.equals(yourName, b))
            System.out.println("Hello " + yourName);

        else System.out.println("You are neither Alice nor Bob.");
    }
}