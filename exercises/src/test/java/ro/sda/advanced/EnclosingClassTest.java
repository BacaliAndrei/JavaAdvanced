package ro.sda.advanced;
/* Write a test, in the test section of the maven project.

        The test should create an instance of EnclosingClass and using that instance the test should create an instance of
        EnclosedClass

        call the increment method on the EnclosedClass instance

        assert if EnclosingClass field counter is now 1

        */

import org.junit.jupiter.api.Test;
import ro.sda.advanced._2_nested_classes.EnclosingClass;

import static org.junit.jupiter.api.Assertions.*;

public class EnclosingClassTest {

    @Test
    public void testEnclosingClass() {
        //hiven

        EnclosingClass enclosingClass = new EnclosingClass();
        EnclosingClass.EnclosedClass innerClass = enclosingClass.new EnclosedClass();
        innerClass.icrementCounter();
        int expectedValue = 1;

        //when
        int actualValue = enclosingClass.getCounter();

        //then
        assertEquals(expectedValue, actualValue);


    }


}
