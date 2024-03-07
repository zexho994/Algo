import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FrequencySort {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Character> list = map.entrySet().stream()
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        list = list.stream().sorted((a,b) -> map.get(b) - map.get(a))
                .collect(Collectors.toList());

        StringBuilder sb = new StringBuilder();
        for (Character ch : list) {
            for (int i = 0; i < map.get(ch); i++) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }


    @Nested
    class FrequencySortTest {

        @Test
        public void testFrequencySortEmptyString() {
            FrequencySort fs = new FrequencySort();
            String result = fs.frequencySort("");
            assertEquals("", result);
        }

        @Test
        public void testFrequencySortSingleCharacter() {
            FrequencySort fs = new FrequencySort();
            String result = fs.frequencySort("a");
            assertEquals("a", result);
        }

        @Test
        public void testFrequencySortMultipleCharactersSameFrequency() {
            FrequencySort fs = new FrequencySort();
            String result = fs.frequencySort("aabbbccc");
            assertEquals("cccbbbaa", result);
        }

        @Test
        public void testFrequencySortMultipleCharactersDifferentFrequencies() {
            FrequencySort fs = new FrequencySort();
            String result = fs.frequencySort("aabbbccccdd");
            assertEquals("ddccccbbbbaa", result);
        }

        @Test
        public void testFrequencySortWithSpecialCharacters() {
            FrequencySort fs = new FrequencySort();
            String result = fs.frequencySort("aabb!@#ccdd");
            assertEquals("aabbccdd!@#", result);
        }

        @Test
        public void testFrequencySortNumbers() {
            FrequencySort fs = new FrequencySort();
            String result = fs.frequencySort("Aabb");
            assertEquals("bbAa", result);
        }
    }


}
