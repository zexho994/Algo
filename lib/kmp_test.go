package lib

import "testing"

func Test_matcher(t *testing.T) {
	type args struct {
		s1 string
		s2 string
	}
	tests := []struct {
		name   string
		args   args
		wantI1 int
		wantI2 int
	}{
		// TODO: Add test cases.
		{name: "t1", args: args{s1: "abcabd", s2: "ca"}, wantI1: 2, wantI2: 3},
		{name: "t2", args: args{s1: "BBC ABCDAB ABCDABCDABDE", s2: "ABCDABD"}, wantI1: 15, wantI2: 21},
		{name: "t3", args: args{s1: "#{name} invite you to attend the meeting on #{time}", s2: "#{name}"}, wantI1: 0, wantI2: 6},
		{name: "t4", args: args{s1: "#{name} invite you to attend the meeting on #{time}", s2: "#{time}"}, wantI1: 44, wantI2: 50},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			gotI1, gotI2 := matcher(tt.args.s1, tt.args.s2)
			if gotI1 != tt.wantI1 {
				t.Errorf("matcher() gotI1 = %v, want %v", gotI1, tt.wantI1)
			}
			if gotI2 != tt.wantI2 {
				t.Errorf("matcher() gotI2 = %v, want %v", gotI2, tt.wantI2)
			}
		})
	}
}
