import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsValidSerializationTest {

    @Test
    void isValidSerialization() {
        IsValidSerialization test = new IsValidSerialization();
        assert test.isValidSerialization("9,#,92,#,#");
    }
}