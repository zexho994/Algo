package interview

import "testing"

func Test_maxProfit2(t *testing.T) {
	type args struct {
		prices []int
	}
	tests := []struct {
		name string
		args args
		want int
	}{
		// TODO: Add test cases.
		{name: "t1", args: args{prices: []int{3, 3, 5, 0, 0, 3, 1, 4}}, want: 6},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := maxProfit2(tt.args.prices); got != tt.want {
				t.Errorf("maxProfit2() = %v, want %v", got, tt.want)
			}
		})
	}
}
