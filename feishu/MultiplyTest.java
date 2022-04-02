import static org.junit.jupiter.api.Assertions.*;

class MultiplyTest {

    public static void main(String[] args) {
        Multiply multiply = new Multiply();
        String res1 = multiply.multiply("9","9");
        assert "81".equals(res1);

    }

}