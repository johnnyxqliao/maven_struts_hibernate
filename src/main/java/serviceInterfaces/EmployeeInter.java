package serviceInterfaces;

import java.util.List;

import employeeManager.Employee;

public interface EmployeeInter {

	public void addEmployee(Employee e);

	public List<Employee> shoeEmployee();

	public void updateEmployee(Employee e);

	public void delEmployee(java.io.Serializable id);
}
