package logger;

import java.util.logging.Logger;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Apptest {
    private App logger;

    @Before
    public void setup() {
        logger = new App();
    }

    @Test
    public void testGetSum() {
        logger.add(10);
        logger.add(20);
        logger.add(30);
        int sum = logger.getSum();
        Assert.assertEquals(60, sum);
    }

    @Test
    public void testGetSumWithNegativeNumbers() {
        logger.add(-10);
        logger.add(20);
        logger.add(-30);
        int sum = logger.getSum();
        Assert.assertEquals(-20, sum);
    }

    @Test
    public void testGetSumWithEmptyLog() {
        int sum = logger.getSum();
        Assert.assertEquals(0, sum);
    }
}

