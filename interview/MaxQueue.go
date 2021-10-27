package interview

// maxStack is sort by val like [5,4,3,2,1]
type MaxQueue struct {
	maxStack []int
	stack    []int
}

func Constructor() MaxQueue {
	return MaxQueue{maxStack: []int{}, stack: []int{}}
}

func (this *MaxQueue) Max_value() int {
	if this.maxStack == nil || len(this.maxStack) == 0 {
		return -1
	}
	return this.maxStack[0]
}

func (this *MaxQueue) Push_back(value int) {
	maxIdx := len(this.maxStack) - 1
	tempStack := make([]int, len(this.maxStack))
	for maxIdx >= 0 && this.maxStack[maxIdx] < value {
		tempStack[maxIdx] = this.maxStack[maxIdx]
		maxIdx--
	}
	this.maxStack = this.maxStack[:maxIdx+1]
	this.maxStack = append(this.maxStack, value)
	this.maxStack = append(this.maxStack, tempStack[maxIdx+1:]...)
	this.stack = append(this.stack, value)
}

func (this *MaxQueue) Pop_front() int {
	if this.maxStack == nil || len(this.maxStack) == 0 {
		return -1
	}
	front := this.stack[0]
	this.stack = this.stack[1:]
	tmp := make([]int, len(this.maxStack))
	maxIdx := len(this.maxStack) - 1
	for this.maxStack[maxIdx] != front && maxIdx > 0 {
		tmp[maxIdx] = this.maxStack[maxIdx]
		maxIdx--
	}
	this.maxStack = this.maxStack[:maxIdx]
	this.maxStack = append(this.maxStack, tmp[maxIdx+1:]...)
	return front
}

/**
 * Your MaxQueue object will be instantiated and called as such:
 * obj := Constructor();
 * param_1 := obj.Max_value();
 * obj.Push_back(value);
 * param_3 := obj.Pop_front();
 */
