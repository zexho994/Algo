import org.junit.jupiter.api.Test;

class PortTest {

    @Test
    void count() {
        Port port = new Port();
        assert port.count(2) == 2;
        assert port.count(4) == 6;
    }
}