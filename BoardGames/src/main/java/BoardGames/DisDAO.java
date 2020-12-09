package BoardGames;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javassist.bytecode.stackmap.BasicBlock.Catch;

public class DisDAO {

	SessionFactory factory = HibernateUtils.getSessionFactory();
	Transaction transaction = null;

	// Save
	public void insert(SetDis dis) {
		Session session = factory.getCurrentSession();
		try {
			transaction = session.beginTransaction();
			session.save(dis); // save object
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public void update(String id,String comment) {

		Session session = factory.getCurrentSession();
		try {
			// Start transaction
			transaction = session.beginTransaction();
			session.get(SetDis.class, id).setComment(comment);// update object
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public void delete(String id) {
		Session session = factory.getCurrentSession();
		try {
		// Start transaction
		transaction = session.beginTransaction();
		// delete object
		SetDis dis = session.get(SetDis.class, id);
		if (dis != null) {
			session.delete(dis);
			System.out.println(" comment deleted");
		}
		transaction.commit();
	}catch(

	Exception e)
	{
		if (transaction != null) {
			transaction.rollback();
		}
		e.printStackTrace();
	}
		}

	public void get(Integer id) {
		Session session = factory.getCurrentSession();
		SetDis dis = null;
		try {
			// Start transaction
			transaction = session.beginTransaction();
			// get object by ID
			dis = session.get(SetDis.class, id);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public List<SetDis> getDis() {
		Transaction transaction = null;
		List<SetDis> listofDis = null;
		Session session = factory.getCurrentSession();
		try {
			// Start transaction
			transaction = session.beginTransaction();
			// get object by ID
			listofDis = session.createQuery("from SetDis ").getResultList();
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return listofDis;
	}

}
