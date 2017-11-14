package shiyanlou;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class DBconnect {
	// 读取配置文件，实例化配置对象
	private static Configuration config = new Configuration().configure("hibernate.cfg.xml");

	// 生成会话工厂
	private static SessionFactory sessionFactory = config.buildSessionFactory();

	// 生成会话
	private static Session session;

	// 开始事务对象
	private static Transaction transaction;

	// 创建session和transation
	static void createSessionTransation() {
		session = sessionFactory.getCurrentSession();
		transaction = session.beginTransaction();
	}

	// 根据用户名和密码获取用户
	@SuppressWarnings({ "rawtypes", "unchecked" })
	static List<userBean> getuserBean(String hql, userBean user) {
		createSessionTransation();
		Query query = session.createQuery(hql);
		query.setParameter(0, user.getName()).setParameter(1, user.getPassword());
		List<userBean> list = query.list();
		session.close();
		return list;
	}

	// 根据用户信息获取用户
	@SuppressWarnings({ "rawtypes", "unchecked" })
	static List<userBean> getuserBeanByName(String hql, userBean user) {
		createSessionTransation();
		Query query = session.createQuery(hql);
		query.setParameter(0, user.getName());
		List<userBean> list = query.list();
		session.close();
		return list;
	}

	// 删除用户信息
	static void deleteuserBean() {
		userBean s = session.get(userBean.class, 789);
		session.delete(s);
	}

	// 添加用户信息
	static void adduserBean(userBean new_student) {
		// 将对象保存到数据库中
		createSessionTransation();
		session.save(new_student);
		transaction.commit();
		System.out.println("用户：" + new_student.getName() + " has already added to MYSQL successfully");
		session.close();
	}
}
