package _struct

/**
 * Your MyQueue object will be instantiated and called as such:
 * obj := Constructor();
 * obj.Push(x);
 * param_2 := obj.Pop();
 * param_3 := obj.Peek();
 * param_4 := obj.Empty();
 */
type MyQueue struct {
	element []int
}

/** Initialize your data structure here. */
func Constructor() MyQueue {
	return MyQueue{element: []int{}}
}

/** Push element x to the back of queue. */
func (this *MyQueue) Push(x int) {
	this.element = append(this.element, x)
}

/** Removes the element from in front of queue and returns that element. */
func (this *MyQueue) Pop() int {
	if len(this.element) == 0 {
		return -1
	}
	p := this.element[0]
	this.element = this.element[1:]
	return p
}

/** Get the front element. */
func (this *MyQueue) Peek() int {
	if len(this.element) == 0 {
		return -1
	}
	return this.element[0]
}

/** Returns whether the queue is empty. */
func (this *MyQueue) Empty() bool {
	return len(this.element) == 0
}
