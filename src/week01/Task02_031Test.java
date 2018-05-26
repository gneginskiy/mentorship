package week01;
/**
 * Created by Mike Neginsky on 20.05.2018.
 */

import util.PrintStreamAdapter;
import util.TestHelper;

import java.io.ByteArrayInputStream;

public class Task02_031Test {
    public static void main(String[] args) {
        TestHelper.checkLastString(Task02_031::main,"123","a-b-c to a-c-b operation:132");
    }
}