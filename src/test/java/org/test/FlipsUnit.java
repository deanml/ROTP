package org.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.test.Flips;


/**
 * Created by Marv on 4/26/2018.
 */
public class FlipsUnit {
    //Setup the data and expected answers
    Flips flips = new Flips();

    @DataProvider(name = "pancakeDataProvider")
    public Object[][] provideData() {
        return new Object[][] {
                { "-", 1 },
                { "-+", 1 },
                { "+-", 2 },
                { "+++", 0 },
                { "--+-", 3 }
        };
    }

    @Test(dataProvider = "pancakeDataProvider")
    public void testSimpleFlipWithSmallData(String cakes, int expectedFlips) {
        int nFlips = flips.countFlips(cakes);
        Assert.assertEquals(nFlips, expectedFlips);
    }

    @Test
    public void testBoundariesOnCakes() {
        //Setup a 100 character string and test it through the method
        String cakes = "++_+--+++___+++++_++_____+_+_+_+_++++++++++________+++++++++++_________+++_+_+_+_++++++++++________++";
        int nFlips = flips.countFlips(cakes);
        Assert.assertEquals(nFlips, 32);
    }

    @Test(expectedExceptions = java.lang.ArrayIndexOutOfBoundsException.class)
    public void testBadInput() {
        //Setup an empty String
        String cakes = "";
        int nFlips = flips.countFlips(cakes);
    }
}
