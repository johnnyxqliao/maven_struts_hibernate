package employeeManager;

import java.util.Date;

public class Employee {
	private int id;
	private String name;
	private String email;
	private java.util.Date hireDate;
	private float salary;

	public Employee() {

	}

	public Employee(int id, String name, String email, Date hireDate, float salary) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.hireDate = hireDate;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public java.util.Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(java.util.Date hireDate) {
		this.hireDate = hireDate;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
