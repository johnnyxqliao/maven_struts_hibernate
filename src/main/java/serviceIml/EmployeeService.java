package serviceIml;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import employeeManager.Employee;
import serviceInterfaces.EmployeeInter;

@Transactional
public class EmployeeService implements EmployeeInter {
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		System.out.println(sessionFactory);
		this.sessionFactory = sessionFactory;
	}

	public void addEmployee(Employee e) {
		Session session = sessionFactory.openSession();
		session.save(e);
		session.close();
		
	}

	public List<Employee> shoeEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateEmployee(Employee e) {
		// TODO Auto-generated method stub

	}

	public void delEmployee(Serializable id) {
		// TODO Auto-generated method stub

	}

}
