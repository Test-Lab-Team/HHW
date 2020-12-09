package BoardGames;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class DAOImpl implements DisDAO2 {

	@Override
	public void insert(SetDis dis) {
		Session session = HibernateUtils.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(dis);
		transaction.commit();
		session.close();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<SetDis> ShowAllComments() {
		List<SetDis> disList = new ArrayList<SetDis>();
		Session session = HibernateUtils.getSessionFactory().openSession();
		org.hibernate.query.Query query = session.createQuery("From SetDis");
		disList = query.list();
		return disList;
	}

	@Override
	public void update(String id, String comment) {
		Session session = HibernateUtils.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		SetDis dis = (SetDis) session.load(SetDis.class, id);
		dis.setId(id);
		dis.setComment(comment);
		session.update(dis);
		transaction.commit();
		session.close();
	}
	
	@Override
	
	public void delete(SetDis dis) {
		Session session = HibernateUtils.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(dis);
		transaction.commit();
		session.close();

	}

	@Override
	public List<SetDis> getDis() {
		
		return  getDis();
	}
	

}
