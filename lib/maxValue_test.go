package lib

import "testing"

func createNode1() *TreeNode {
	r := &TreeNode{Val: 5}
	l1 := &TreeNode{Val: 2}
	r.Left = l1
	r1 := &TreeNode{Val: 3}
	r.Right = r1
	l2 := &TreeNode{Val: 4}
	l1.Left = l2
	return r
}

func createNode2() *TreeNode {
	r := &TreeNode{Val: 4}
	l1 := &TreeNode{Val: 1}
	r.Left = l1
	r1 := &TreeNode{Val: 3}
	r.Right = r1
	l2 := &TreeNode{Val: 9}
	l1.Left = l2
	r2 := &TreeNode{Val: 2}
	r1.Right = r2
	return r
}
func Test_maxValue(t *testing.T) {
	type args struct {
		root *TreeNode
		k    int
	}
	tests := []struct {
		name string
		args args
		want int
	}{
		// TODO: Add test cases.
		{name: "t1", args: args{root: createNode1(), k: 2}, want: 12},
		{name: "t2", args: args{root: createNode2(), k: 2}, want: 16},
		{name: "t2", args: args{root: nil, k: 2}, want: 0},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := maxValue(tt.args.root, tt.args.k); got != tt.want {
				t.Errorf("maxValue() = %v, want %v", got, tt.want)
			}
		})
	}
}
