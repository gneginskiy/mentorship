package util;

import java.io.ByteArrayInputStream;

public class TestHelper {
    public static void checkLastString(Runnable task, String mockedInputString, String expectedOutput) {
        System.setIn(new ByteArrayInputStream((mockedInputString + "\r\n").getBytes()));
        PrintStreamAdapter printStreamAdapter = new PrintStreamAdapter(System.out);
        System.setOut(printStreamAdapter);
        task.run();
        String actualResult = printStreamAdapter.getOutputString();
        if (expectedOutput.equals(actualResult)) {
            System.out.println("OK");
        } else {
            System.err.println("Test is failed. Expected: " + expectedOutput + " | Actual: " + actualResult);
        }
    }
}
