package ua.ptah.maths.problem8;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestProductInSeriesTest {

    @Test
    public void checkLargestProduct() throws IOException {
        LargestProductInSeries largeProduct = new LargestProductInSeries(13);
        assertEquals(1000, largeProduct.some("1000digit.txt"));
    }
}
