package dayplan;

import org.junit.jupiter.api.Test;

class SearchMatrixTest {

    @Test
    void searchMatrix() {
        SearchMatrix t = new SearchMatrix();
        boolean b = t.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 3);
        assert b;

        boolean b2 = t.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 21);
        assert !b2;
    }
}