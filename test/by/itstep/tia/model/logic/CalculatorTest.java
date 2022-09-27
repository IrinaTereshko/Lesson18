package by.itstep.tia.model.logic;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testSum() {
        //  arrange
        int a = 10;
        int b = 3;
        int expected = 13;

        // act
        int actual = Calculator.sum(a, b);

        // assert
        //if (actual != expected) {
          //  Assert.fail();
        //
        Assert.assertEquals(expected, actual);
        }



    @Test
    public void testSub() {
        //  arrange
        int a = 15;
        int b = 3;
        int expected = 12;

        // act
        int actual = Calculator.sub(a, b);

        // assert
        if (actual != expected) {
            Assert.fail();
        }
    }

        @Test
        public void testMult() {
            //  arrange
            int a = 5;
            int b = 3;
            int expected = 15;

            // act
            int actual = Calculator.mult(a, b);

            // assert
            if (actual != expected) {
                Assert.fail();
            }
        }
            @Test
            public void testDiv () {
                //  arrange
                int a = 15;
                int b = 3;
                int expected = 5;

                // act
                int actual = Calculator.div(a, b);

                // assert
                if (actual != expected) {
                    Assert.fail();
                }
            }
        }
