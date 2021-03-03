package dp

import (
	"reflect"
	"testing"
)

func Test_countBits(t *testing.T) {
	type args struct {
		num int
	}
	tests := []struct {
		name string
		args args
		want []int
	}{
		// TODO: Add test cases.
		{name: "t1", args: args{num: 5}, want: []int{0, 1, 1, 2, 1, 2}},
		{name: "t2", args: args{num: 8}, want: []int{0, 1, 1, 2, 1, 2, 2, 3, 1}},
		{name: "t2", args: args{num: 0}, want: []int{0}},
		{name: "t2", args: args{num: 1}, want: []int{0, 1}},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := countBits(tt.args.num); !reflect.DeepEqual(got, tt.want) {
				t.Errorf("countBits() = %v, want %v", got, tt.want)
			}
		})
	}
}
