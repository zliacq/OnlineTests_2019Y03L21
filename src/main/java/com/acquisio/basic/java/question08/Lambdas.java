package com.acquisio.basic.java.question08;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.text.DecimalFormat;
import java.util.stream.Stream;
import org.apache.commons.lang3.StringUtils;

/**
 * QUESTION 09: Lambdas (https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html)
 * Using JDK8 Lambdas, add the code to transform the input file to apply those rules.
 * 1- Keep lines where the amount is greater than or equals to 50$
 * 2- Add a Taxes column right after the Amount column, which is 15% of the Amount.
 * 3- Add a Total column right after the Taxes column, which is the sum of Amount and Taxes.
 * 4- Remove the ShoppingCartTitle columns.
 * <p>
 * The input file contains those columns
 * User,Amount,ShoppingCartTitle,NbItems
 * <p>
 * IMPORTANT: Add all missing javadoc and/or unit tests that you think is necessary.
 */
public class Lambdas {

    private static final String DELIMITER = ",";
    private static final double AMOUNT_THRESHOLD = 50.0;
    private static final String NUMBER_FORMAT = "#.00";

    public static void main(String[] args) throws IOException, URISyntaxException {
        Lambdas instance = new Lambdas();
        File input = new File(Thread.currentThread().getContextClassLoader().getResource("./carts.csv").toURI());
        File output = new File("./carts_output.csv");
        output.delete();

        instance.convertCarts(input, output);

        if (output.exists()) {
            Files.lines(output.toPath()).forEachOrdered(line -> System.out.println(line));
        }
    }

    /**
     * This is the converter for input file
     * @param input input file
     * @param output output file
     * @throws IOException exception
     */
    void convertCarts(File input, File output) throws IOException {
        try (Stream<String> lines = Files.lines(input.toPath());
             PrintWriter printWriter = new PrintWriter(Files.newBufferedWriter(output.toPath()))) {
            lines.filter(line -> Double.parseDouble(line.split(DELIMITER)[1]) >= AMOUNT_THRESHOLD)
                    .forEachOrdered(line -> printWriter.println(convertNewLine(line)));
        }
    }

    /**
     * This is the line string converter
     * @param line content of line
     * @return converted line
     */
    private String convertNewLine(String line) {
        String[] values = line.split(DELIMITER);

        double amount = Double.parseDouble(values[1]);
        double tax = amount * 0.15;
        double total = amount + tax;

        DecimalFormat decimalFormat = new DecimalFormat(NUMBER_FORMAT);
        return StringUtils.join(new String[] {values[0], values[1], decimalFormat.format(tax), decimalFormat.format(total), values[3]},
                DELIMITER);
    }
}