import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HJ4Test {

    @Test
    void process() {
        HJ4 hj4 = new HJ4();
        String[] abds = hj4.process("abd");
        Assertions.assertEquals(abds[0], "abd00000");
    }
}