package easy

type ParkingSystem struct {
	arr []int
}

func Constructor(big int, medium int, small int) ParkingSystem {
	return ParkingSystem{arr: []int{0, big, medium, small}}
}

func (this *ParkingSystem) AddCar(carType int) bool {
	if this.arr[carType] == 0 {
		return false
	}
	this.arr[carType]--
	return true
}
