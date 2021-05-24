package interview

import "testing"

func Test_t(t *testing.T) {
	type args struct {
		s string
		b byte
	}
	tests := []struct {
		name string
		args args
		want bool
	}{
		// TODO: Add test cases.
		{name: "t1", args: args{s: "A", b: 'A'}, want: true},
		{name: "t1", args: args{s: "A", b: 'B'}, want: false},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := T(tt.args.s, tt.args.b); got != tt.want {
				t.Errorf("t() = %v, want %v", got, tt.want)
			}
		})
	}
}

func Test_exist(t *testing.T) {
	type args struct {
		board [][]byte
		word  string
	}
	tests := []struct {
		name string
		args args
		want bool
	}{
		// TODO: Add test cases.
		{name: "t1", args: args{board: [][]byte{{'A', 'B', 'B'}, {'B', 'E', 'F'}, {'C', 'D', 'M'}}, word: "ABC"}, want: true},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := exist(tt.args.board, tt.args.word); got != tt.want {
				t.Errorf("exist() = %v, want %v", got, tt.want)
			}
		})
	}
}
