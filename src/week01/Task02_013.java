package week01;
/**
 * Task02_013 - Given a three-digit number.
 * Find the number obtained by reading its digits from right to left.
 */

import java.util.Scanner;

public class Task02_013 {

    public static void main(String... args) {
        int num = new Scanner(System.in).nextInt();
        int revertedNum = (num % 10 * 100) + (num / 10 % 10 * 10) + (num / 100);
        System.out.println(revertedNum);
    }

}