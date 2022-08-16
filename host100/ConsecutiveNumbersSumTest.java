import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsecutiveNumbersSumTest {

    @Test
    void consecutiveNumbersSum() {
        ConsecutiveNumbersSum t = new ConsecutiveNumbersSum();
        assert 2 == t.consecutiveNumbersSum(9);
    }
}