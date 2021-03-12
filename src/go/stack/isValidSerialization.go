package stack

func isValidSerialization(preorder string) bool {
	need := 1
	for idx := 0; idx < len(preorder); idx++ {
		if need == 0 {
			return false
		}
		if string(preorder[idx]) == "," {
			idx++
		} else if string(preorder[idx]) == "#" {
			need--
			idx++
		} else {
			for idx < len(preorder) && string(preorder[idx]) != "," {
				idx++
			}
			need += 1
		}
	}
	return need == 0
}
