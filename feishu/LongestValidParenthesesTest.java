import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestValidParenthesesTest {

    @Test
    void longestValidParentheses() {
        LongestValidParentheses test = new LongestValidParentheses();
        int ans1 = test.longestValidParentheses(")()())");
        assert ans1 == 4;
    }
}