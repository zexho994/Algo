package 专项突破.整数;

import org.junit.jupiter.api.Test;

class AddBinaryTest {

    @Test
    void addBinary() {
        AddBinary addBinary = new AddBinary();
        String ans1 = addBinary.addBinary("10", "11");
        assert "101".equals(ans1);

        String ans2 = addBinary.addBinary("111","1");
        assert "1000".equals(ans2);
    }
}