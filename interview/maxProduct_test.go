package interview

import "testing"

func Test_maxProduct(t *testing.T) {
	type args struct {
		nums []int
	}
	tests := []struct {
		name string
		args args
		want int
	}{
		// TODO: Add test cases.
		{name: "t1", args: args{nums: []int{2, 3, -2, 4}}, want: 6},
		{name: "t2", args: args{nums: []int{3, -1, 2, 2, 1}}, want: 4},
		{name: "t3", args: args{nums: []int{3, -1, 2, 2, -1}}, want: 12},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := maxProduct(tt.args.nums); got != tt.want {
				t.Errorf("maxProduct() = %v, want %v", got, tt.want)
			}
		})
	}
}
