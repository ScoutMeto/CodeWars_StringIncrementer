package org.example;

public class Main {
    public static void main(String[] args) {
        Kata.incrementString("foobar000");

        /*
        TESTING
        ___
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class SampleTest {

    private static void doTest(String str, String expected) {
      String actual = assertDoesNotThrow(() -> Kata.incrementString(str), "Solution thrown an unexpected exception for str=\"" + str + "\"\n\n");
      assertEquals(expected, actual, "Incorrect answer for str=\"" + str + "\"\n\n");
    }


    @Test
    public void exampleTests() {
        doTest("foobar000", "foobar001");
        doTest("foo", "foo1");
        doTest("foobar001", "foobar002");
        doTest("foobar99", "foobar100");
        doTest("foobar099", "foobar100");
        doTest("", "1");
    }
}

NOTE:   After this testing was use complicated test consist of big int number (for example: 65462489754164867519746543...)
        and nothing else. I used BigInteger format due to this possibility.
         */
    }
}
