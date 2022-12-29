package com.table.per.hierchi;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("regularemployee")
public class Regular_Employee extends Employee {
	private float salary;
	private int bonus;

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public Regular_Employee(int id, String name, float salary, int bonus) {
		super(id, name);
		this.salary = salary;
		this.bonus = bonus;
	}

	public Regular_Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Regular_Employee [salary=" + salary + ", bonus=" + bonus + "]";
	}

}
