import org.junit.jupiter.api.Test;

import java.util.List;

class GroupAnagramsTest {

    @Test
    void groupAnagrams() {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        List<List<String>> res1 = groupAnagrams.groupAnagrams(new String[]{"abc", "abb", "abc"});
        assert res1.size() == 2;
    }
}