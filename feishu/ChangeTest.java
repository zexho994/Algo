import org.junit.jupiter.api.Test;

class ChangeTest {

    @Test
    void change() {
        Change change = new Change();
        assert 4 == change.change(5, new int[]{2, 5, 1});
    }
}