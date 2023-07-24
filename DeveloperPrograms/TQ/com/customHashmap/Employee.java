package com.customHashmap;

public class Employee {
	private int id;
	private String name;
	private int salary;

	public Employee(int id, String name, int salary)

	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;

		if (id != other.id)
			return false;
		else if (!name.equals(other.name))
			return false;
		else if (salary != other.salary)
			return false;
		else
			return true;
	}

}
