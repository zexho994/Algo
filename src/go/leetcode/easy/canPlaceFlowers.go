package easy

// 605. 种花问题
func canPlaceFlowers(flowerbed []int, n int) bool {
	placeSize := 0
	for idx := 0; idx < len(flowerbed); idx++ {
		if flowerbed[idx] == 1 {
			idx++
			continue
		}
		idx++
		if idx == len(flowerbed) {
			return placeSize+1 >= n
		}
		if flowerbed[idx] == 1 {
			idx++
			continue
		}
		placeSize++
	}
	return placeSize >= n
}
