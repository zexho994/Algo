package daily_topic

import "sort"

func topKFrequent(words []string, k int) []string {
	hash := make(map[string]int)
	for _, word := range words {
		hash[word]++
	}
	ans := make([]string, len(hash))
	for word := range hash {
		ans = append(ans, word)
	}
	sort.Slice(ans, func(i, j int) bool {
		I, J := ans[i], ans[j]
		return hash[I] > hash[J] || (hash[I] == hash[J] && I < J)
	})

	return ans[:k]
}
