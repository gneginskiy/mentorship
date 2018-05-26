package week01;
/**
 * Task02_031 - In a three-digit number, x crossed out its second digit. When to the educated while the double
 * digit number on the right was assigned the second digit of the number x, the number n was radiated.
 * Given a given n, find the number x (the value of n is entered from the viatura, 100 ≤ n ≤ 999).
 */

import java.io.*;
import java.util.Scanner;

public class Task02_031 {
    public static void main(String... args) {
        System.out.println("Input n - a three-digit number:");
        int n = new Scanner(System.in).nextInt();
        int firstDigit = n / 100;
        int secondDigit = (n - firstDigit * 100) / 10;
        int thirdDigit = n - firstDigit * 100 - secondDigit * 10;
        int result = firstDigit * 100 + thirdDigit * 10 + secondDigit;
        System.out.println("a-b-c to a-c-b operation:" + result);
    }
}