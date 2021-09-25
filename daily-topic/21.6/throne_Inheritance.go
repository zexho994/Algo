package _1_6

type ThroneInheritance struct {
	king  string
	table map[string]*person
}

type person struct {
	dead bool
	sons []string
}

// Constructor 新的结构体
func Constructor(kingName string) ThroneInheritance {
	t := ThroneInheritance{king: kingName, table: make(map[string]*person)}
	t.table[kingName] = &person{dead: false, sons: []string{}}
	return t
}

// Birth 一个新生儿
// if parentA > parentB
//   child_A > parentB
func (this *ThroneInheritance) Birth(parentName string, childName string) {
	this.table[parentName].sons = append(this.table[parentName].sons, childName)
	this.table[childName] = &person{sons: []string{}}
}

// Death name 死亡
func (this *ThroneInheritance) Death(name string) {
	this.table[name].dead = true
}

// GetInheritanceOrder 获取继承顺序
func (this *ThroneInheritance) GetInheritanceOrder() []string {
	var order []string
	var preOrder func(name string)
	preOrder = func(name string) {
		if this.table[name] == nil {
			return
		}
		for _, s := range this.table[name].sons {
			if !this.table[s].dead {
				order = append(order, s)
			}
			preOrder(s)
		}
	}
	if !this.table[this.king].dead {
		order = append(order, this.king)
	}
	preOrder(this.king)
	return order
}

/**
 * Your ThroneInheritance object will be instantiated and called as such:
 * obj := Constructor(kingName);
 * obj.Birth(parentName,childName);
 * obj.Death(name);
 * param_3 := obj.GetInheritanceOrder();
 */
