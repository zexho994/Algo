package tree

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

type BSTIterator struct {
	arr []int
	idx int
}

func Constructor(root *TreeNode) BSTIterator {
	bst := BSTIterator{arr: []int{}, idx: 0}
	bst.traverse(root)
	return bst
}

func (bst *BSTIterator) traverse(node *TreeNode) {
	if node == nil {
		return
	}
	bst.traverse(node.Left)
	bst.arr = append(bst.arr, node.Val)
	bst.traverse(node.Right)
}

func (this *BSTIterator) Next() int {
	this.idx++
	return this.arr[this.idx-1]
}

func (this *BSTIterator) HasNext() bool {
	return this.idx < len(this.arr)
}
