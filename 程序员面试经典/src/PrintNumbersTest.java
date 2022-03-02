import org.junit.jupiter.api.Test;

class PrintNumbersTest {

    @Test
    void printNumbers() {
        PrintNumbers printNumbers = new PrintNumbers();
        int[] ints = printNumbers.printNumbers(1);
        assert ints.length == 9;
    }
}