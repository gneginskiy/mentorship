package week01;
/**
 * Task01_003 - Create a program to display the number entered on the keyboard.
 * The displayed number must be preceded by the message "You entered a number."
 */

import java.util.Scanner;

public class Task01_003 {

    public static void main(String... args) {
        System.out.println("You entered a number " + new Scanner(System.in).nextInt());
    }

}