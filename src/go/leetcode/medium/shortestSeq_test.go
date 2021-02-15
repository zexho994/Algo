package medium

import (
	"reflect"
	"testing"
)

func Test_shortestSeq(t *testing.T) {
	type args struct {
		big   []int
		small []int
	}
	tests := []struct {
		name string
		args args
		want []int
	}{
		// TODO: Add test cases.
		{name: "t1", args: args{big: []int{7, 5, 9, 0, 2, 1, 3, 5, 7, 9, 1, 1, 5, 8, 8, 9, 7}, small: []int{1, 5, 9}}, want: []int{7, 10}},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := shortestSeq(tt.args.big, tt.args.small); !reflect.DeepEqual(got, tt.want) {
				t.Errorf("shortestSeq() = %v, want %v", got, tt.want)
			}
		})
	}
}
