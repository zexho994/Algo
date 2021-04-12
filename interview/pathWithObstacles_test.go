package interview

import (
	"reflect"
	"testing"
)

func Test_pathWithObstacles(t *testing.T) {
	type args struct {
		obstacleGrid [][]int
	}
	tests := []struct {
		name string
		args args
		want [][]int
	}{
		// TODO: Add test cases.
		{name: "t1", args: args{obstacleGrid: [][]int{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}}, want: [][]int{{0, 0}, {0, 1}, {0, 2}, {1, 2}, {2, 2}}},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := pathWithObstacles(tt.args.obstacleGrid); !reflect.DeepEqual(got, tt.want) {
				t.Errorf("pathWithObstacles() = %v, want %v", got, tt.want)
			}
		})
	}
}
