package shiyanlou;

import java.util.List;

import com.opensymphony.xwork2.ModelDriven;

public class register implements ModelDriven<userBean> {
	private userBean userRegister = new userBean();

	public userBean getUserRegister() {
		return userRegister;
	}

	public void setUserRegister(userBean userRegister) {
		this.userRegister = userRegister;
	}

	public userBean getModel() {
		return userRegister;
	}

	public String execute() {
		String hql = "FROM userBean WHERE name = ?";
		List<userBean> userBean = DBconnect.getuserBeanByName(hql, userRegister);
		if (userBean.size() > 0) {
			System.out.println("数据库中存在用户：" + userRegister.getName() + ",不能注册");
			return "error";
		} else {
			System.out.println("数据库中不存在用户：" + userRegister.getName() + ",可以注册");
			DBconnect.adduserBean(userRegister);
			return "success";
		}
	}
}
