import org.junit.jupiter.api.Test;

class Add36StringsTest {

    @Test
    void add36Strings() {
        Add36Strings add36Strings = new Add36Strings();
        assert "48".equals(add36Strings.add36Strings("1b", "2x"));
    }
}