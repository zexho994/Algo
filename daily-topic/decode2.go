package daily_topic

func decode2(encoded []int) []int {
	perm := make([]int, len(encoded)+1)
	r := 0
	for i := 1; i < len(encoded); i = i + 2 {
		r ^= encoded[i]
	}
	sum := 0
	for i := 1; i <= len(encoded)+1; i++ {
		sum ^= i
	}
	perm[0] = sum ^ r
	for i := 0; i < len(encoded); i++ {
		perm[i+1] = encoded[i] ^ perm[i]
	}
	return perm
}
