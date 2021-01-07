package medium

type UF struct {
	count int
	root  []int
}

func (uf *UF) join(p, q int) {
	f := func(x int) int {
		for uf.root[x] != x {
			uf.root[x] = uf.root[uf.root[x]]
			x = uf.root[x]
		}
		return x
	}
	pr := f(p)
	if pr == f(q) {
		return
	}
	uf.root[pr] = q
	uf.count--
}

func FindCircleNum(isConnected [][]int) int {
	root := make([]int, len(isConnected))
	for i := 0; i < len(isConnected); i++ {
		root[i] = i
	}
	uf := UF{count: len(isConnected), root: root}
	for row := range isConnected {
		for col := range isConnected[row] {
			if row == col {
				continue
			}
			if isConnected[row][col] == 1 {
				uf.join(row, col)
			}
		}
	}
	return uf.count
}
