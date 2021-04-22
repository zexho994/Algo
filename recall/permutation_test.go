package recall

import (
	"reflect"
	"testing"
)

func Test_permutation(t *testing.T) {
	type args struct {
		s string
	}
	tests := []struct {
		name string
		args args
		want []string
	}{
		// TODO: Add test cases.
		{name: "t1", args: args{"abc"}, want: []string{}},
		{name: "t1", args: args{"abac"}, want: []string{}},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := permutation(tt.args.s); !reflect.DeepEqual(got, tt.want) {
				t.Errorf("permutation() = %v, want %v", got, tt.want)
			}
		})
	}
}
