import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class WordBreakTest {

    @Test
    void wordBreak() {
        WordBreak wordBreak = new WordBreak();
        List<String> list = new ArrayList<>();
        list.add("leet");
        list.add("code");
        assert wordBreak.wordBreak("leetcode", list);
    }
}