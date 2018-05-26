package week02;
/**
 * In some countries of the Far East (China, Japan, etc.) a calendar was used (and is unofficially used at the
 * present time), which differs from that used by us. This calendar is a 60-year cycle system. Each 60-year cycle
 * consists of five 12-year sub-cycles. In each subcycle of the year they bear the names of animals: Rat, Cow, Tiger,
 * Hare, Dragon, Snake, Horse, Sheep, Monkey, Rooster, Dog and Pig.
 * In addition, the name of the year includes the colors of animals that are associated with the five
 * elements of nature - the Tree (green), the Fire (red), the Earth (yellow), the Metal (white) and the Water (black).
 * As a result, each animal (and its year) has a symbolic color, and this color often does not coincide with its
 * "natural" coloration - the Tiger can be black, the Pig red, and the Horse green. For example, 1984 - the year
 * of the beginning of the next cycle - was called the year of the Green Rat. Each color in the cycle (starting
 * from green) "operates" for two years, so every 60 years the name of the year (the animal and its color) repeats.
 * Create a program that, according to the given year number of our era, prints its name according to the
 * described calendar in the form: "Rat, Green". Consider two cases:
 * a) the value n 1984;
 * b) the value of n can be any natural number.
 */

import util.ConsoleHelper;
import util.TestHelper;

public class Task04_115Test {

    public static void main(String... args) {
        TestHelper.checkLastString(Task04_115::main,"2012","2012 - is a year of a Black Dragon");
    }

}
