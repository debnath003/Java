package com.thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

public class FibonacciNumberGoldenRationTest {

    @Test
    public void returnsCorrectValues() {
        for (int n = 0; n <= FibonacciNumberGoldenRation.MAX_ARG; ++n) {
            final var actual = FibonacciNumberGoldenRation.nthFibonaccicompute(n);
            final var expected = Fibonacci.calFibcompute(n);
            assertEquals(expected, BigInteger.valueOf(actual));
        }
    }

    @Test
    public void throwsIllegalArgumentExceptionForNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> { FibonacciNumberGoldenRation.nthFibonaccicompute(-1); });
    }

    @Test
    public void throwsIllegalArgumentExceptionForLargeInput() {
        assertThrows(IllegalArgumentException.class, () -> { FibonacciNumberGoldenRation.nthFibonaccicompute(FibonacciNumberGoldenRation.MAX_ARG + 1); });
    }
}
