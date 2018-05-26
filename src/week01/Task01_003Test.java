package week01;
/**
 * Created by Mike Neginsky on 13.05.2018.
 */

import util.PrintStreamAdapter;
import util.TestHelper;

import java.io.ByteArrayInputStream;

public class Task01_003Test {

    public static void main(String... args) {
        TestHelper.checkLastString(Task01_003::main, "123", "You entered a number 123");
    }

}