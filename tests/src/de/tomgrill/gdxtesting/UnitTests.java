package de.tomgrill.gdxtesting;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UnitTests {

    @Test
    public void oneEqualsOne() {
        assertEquals(1, 1);
    }

    @Test
    public void zeroEqualsZero() {
        assertEquals(0, 0);
    }

    @Test
    public void twoEqualsZero() {
        assertEquals(0, 2);
    }
}
