package shiyanlou;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import employeeManager.Employee;
import serviceInterfaces.EmployeeInter;

public class testSpring {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//		EmployeeInter uu = (EmployeeInter) context.getBean("EmployeeService");
//		Employee employee = new Employee(4, "liaoxiaoqiang", "liaoxiaoqiang@outlook.com", new Date(), 156.3f);
//		uu.addEmployee(employee);
//		WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(this.getServlet().getServletContext());
	}
}