package ua.ptah.maths.problem8;

/*
 * The four adjacent digits in the 1000-digit number that have the greatest product are 9 × 9 × 8 × 9 = 5832.
 * Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this product?
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class LargestProductInSeries {
    private final int capacity;
    private final List<Integer> digitSection;
    private final List<Integer> products;

    LargestProductInSeries(int numberOfAdjacentDig) {
        capacity = numberOfAdjacentDig;
        digitSection = new ArrayList<>(capacity);
        products = new ArrayList<>();
    }

    public int some(String fileName) throws IOException {
        BufferedReader br = getBufferReaderForFile(fileName);
        while (br.read() != -1) {
            while (digitSection.get(capacity - 1) == null) {
                digitSection.add(br.read());
            }
            products.add(arrayProduct(digitSection));
            digitSection.remove(0);
        }
        br.close();
        return Collections.max(products);
    }

    private BufferedReader getBufferReaderForFile(String fileName) throws FileNotFoundException {
        String path = Objects.requireNonNull(LargestProductInSeries.class.getClassLoader().getResource(fileName)).getPath();
        return new BufferedReader(new FileReader(path));
    }

    private Integer arrayProduct(List<Integer> array) {
        Integer product = array.get(0);
        for (int i = 1; i < array.size() - 2; i++) {
            product *= array.get(i);
        }
        return product;
    }

    //for beg to end read one at a time and if array not full, multiply all
    //otherwise div by [0], multiply by [last]

    /*
     * Choices:
     * compute MAX each time and only save the next product if it's bigger than MAX
     *      => smaller PRODUCTS array, but more often calculation invoke
     *
     */

}