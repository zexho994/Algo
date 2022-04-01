import org.junit.jupiter.api.Test;

class SearchTest {

    @Test
    void search() {
        Search search = new Search();
        assert 0 == search.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 4);
        assert 4 == search.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0);
    }
}