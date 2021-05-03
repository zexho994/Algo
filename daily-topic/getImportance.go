package daily_topic

type Employee struct {
	Id           int
	Importance   int
	Subordinates []int
}

func getImportance(employees []*Employee, id int) (total int) {
	mp := map[int]*Employee{}
	for _, employee := range employees {
		mp[employee.Id] = employee
	}

	queue := []int{id}
	for len(queue) > 0 {
		employee := mp[queue[0]]
		queue = queue[1:]
		total += employee.Importance
		for _, subId := range employee.Subordinates {
			queue = append(queue, subId)
		}
	}
	return
}
