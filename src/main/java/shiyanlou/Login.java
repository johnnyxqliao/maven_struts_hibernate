package shiyanlou;

import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ModelDriven;

import employeeManager.Employee;
import serviceInterfaces.EmployeeInter;

public class Login implements ModelDriven<userBean> {

	private userBean user = new userBean();

	// ģ������
	public userBean getModel() {
		return user;
	}

	public userBean getUser() {
		return user;
	}

	public void setUser(userBean user) {
		this.user = user;
	}

	public String execute() throws Exception {
		ServletContext cxt = ServletActionContext.getServletContext();
		WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(cxt);
		EmployeeInter employ = (EmployeeInter) context.getBean("EmployeeService");
		Employee employee = new Employee(4, "liaoxiaoqiang", "liaoxiaoqiang@outlook.com", new Date(), 156.3f);
		employ.addEmployee(employee);
		System.out.println(employee.getName()+"��ӳɹ�");
		System.out.println(this.toString());
		String hql = "FROM userBean WHERE  name =? AND password = ?";
		List<userBean> userBean = DBconnect.getuserBean(hql, user);
		if (userBean.size() > 0) {
			System.out.println("���ݿ��д����û���" + user.getName());
			return "success";
		} else {
			System.out.println("���ݿ��в������û���" + user.getName() + ",��˶��û���֮�����µ�½");
			return "error";
		}
	}

}