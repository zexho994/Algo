package medium

import (
	"reflect"
	"testing"
)

func Test_findAnagrams(t *testing.T) {
	type args struct {
		s string
		p string
	}
	tests := []struct {
		name string
		args args
		want []int
	}{
		// TODO: Add test cases.
		{name: "t1", args: args{s: "cbaebabacd", p: "abc"}, want: []int{0, 6}},
		{name: "t2", args: args{s: "cbaebabacd", p: "ab"}, want: []int{1, 4, 5, 6}},
		{name: "t3", args: args{s: "abab", p: "ab"}, want: []int{0, 1, 2}},
		{name: "t3", args: args{s: "abacbabc", p: "abc"}, want: []int{1, 2, 3, 5}},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := findAnagrams(tt.args.s, tt.args.p); !reflect.DeepEqual(got, tt.want) {
				t.Errorf("findAnagrams() = %v, want %v", got, tt.want)
			}
		})
	}
}
