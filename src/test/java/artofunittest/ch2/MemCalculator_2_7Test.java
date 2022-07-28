package artofunittest.ch2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemCalculator_2_7Test {
    @Test
    public void sum_byDefault_returnZero() {
        MemCalculator_2_6 calc = makeCalculator();
        int lastSum = calc.sum();
        Assertions.assertEquals(0, lastSum);
    }
    @Test
    public void add_whenCalled_changeSum() {
        MemCalculator_2_6 calc = makeCalculator();
        calc.add(1);
        int sum = calc.sum();
        Assertions.assertEquals(1, sum);
    }

    private MemCalculator_2_6 makeCalculator() {
        return new MemCalculator_2_6();
    }
}
