package easy

import "testing"

func Test_findMaxAverage(t *testing.T) {
	type args struct {
		nums []int
		k    int
	}
	tests := []struct {
		name string
		args args
		want float64
	}{
		// TODO: Add test cases.
		{name: "t1", args: args{nums: []int{1, 2, 3, 4, 5}, k: 2}, want: float64(9) / float64(2)},
		{name: "t2", args: args{nums: []int{1, 12, -5, -6, 50, 3}, k: 4}, want: 12.75},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := findMaxAverage(tt.args.nums, tt.args.k); got != tt.want {
				t.Errorf("findMaxAverage() = %v, want %v", got, tt.want)
			}
		})
	}
}
