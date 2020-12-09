package a;



import java.sql.Date;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import ch01.model.MemberBean;
import a.HibernateUtils;

public class createMemberTable {

	public static void main(String[] args) {
				
				
//		Employee emp1 = new Employee();

	
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.getCurrentSession();
		Transaction tx = null;
		
		try {
			tx = session.beginTransaction();
//			session.save(dep1);
//			session.save(dep2);
//			session.save(emp1);
			tx.commit();
			System.out.println("正常結束............");
		} catch(Exception ex) {
			if(tx !=null) {
				tx.rollback();
			}
			ex.printStackTrace();
		}
	
	}

}
