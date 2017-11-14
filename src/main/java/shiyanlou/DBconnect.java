package shiyanlou;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class DBconnect {
	// ��ȡ�����ļ���ʵ�������ö���
	private static Configuration config = new Configuration().configure("hibernate.cfg.xml");

	// ���ɻỰ����
	private static SessionFactory sessionFactory = config.buildSessionFactory();

	// ���ɻỰ
	private static Session session;

	// ��ʼ�������
	private static Transaction transaction;

	// ����session��transation
	static void createSessionTransation() {
		session = sessionFactory.getCurrentSession();
		transaction = session.beginTransaction();
	}

	// �����û����������ȡ�û�
	@SuppressWarnings({ "rawtypes", "unchecked" })
	static List<userBean> getuserBean(String hql, userBean user) {
		createSessionTransation();
		Query query = session.createQuery(hql);
		query.setParameter(0, user.getName()).setParameter(1, user.getPassword());
		List<userBean> list = query.list();
		session.close();
		return list;
	}

	// �����û���Ϣ��ȡ�û�
	@SuppressWarnings({ "rawtypes", "unchecked" })
	static List<userBean> getuserBeanByName(String hql, userBean user) {
		createSessionTransation();
		Query query = session.createQuery(hql);
		query.setParameter(0, user.getName());
		List<userBean> list = query.list();
		session.close();
		return list;
	}

	// ɾ���û���Ϣ
	static void deleteuserBean() {
		userBean s = session.get(userBean.class, 789);
		session.delete(s);
	}

	// ����û���Ϣ
	static void adduserBean(userBean new_student) {
		// �����󱣴浽���ݿ���
		createSessionTransation();
		session.save(new_student);
		transaction.commit();
		System.out.println("�û���" + new_student.getName() + " has already added to MYSQL successfully");
		session.close();
	}
}
