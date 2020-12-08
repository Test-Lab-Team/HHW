package Test.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Test.dao.ProductDAO;
import Test.entity.Product;
import Test.utils.HibernateUtils;

public class GameServiceImpl implements GameService {

	SessionFactory factory = HibernateUtils.getSessionFactory();
	ProductDAO dao = new ProductDAO();

	@Override
	public boolean checkGame(int productId) {
		boolean result = false;
		Session session = factory.getCurrentSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			return dao.checkGame(productId);
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Product SearchGame(int productId) {

		Product p = null;
		Session session = factory.getCurrentSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			p = dao.SearchGame(productId);
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		return p;
	}

	@Override
	public List<Product> SearchAllGame() {

		List<Product> p = new ArrayList<>();
		Session session = factory.getCurrentSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			p = dao.SearchAllGame();
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		return p;
	}

	@Override
	public Integer createGame(Product gb) {

		int count = 0;
		Session session = factory.getCurrentSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			dao.createGame(gb);
			count++;
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public Integer deleteGame(int productId) {

		int count = 0;
		Session session = factory.getCurrentSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			dao.deleteGame(productId);
			count++;
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public Integer updateGame(Product p) {

		int count = 0;
		Session session = factory.getCurrentSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			dao.updateGame(p);
			count++;
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public List<Product> AdvancedSearch(Product p) {
		List<Product> list = new ArrayList<>();
		Session session = factory.getCurrentSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			list = dao.AdvancedSearch(p);
//			session.createQuery(hql);
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Product> SearchGame(String C_name) {
		List<Product> list = new ArrayList<Product>();
		Session session = factory.getCurrentSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			list = dao.SearchGame(C_name);
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Product> SearchGame1(String G_maker) {
		List<Product> list = new ArrayList<Product>();
		Session session = factory.getCurrentSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			list = dao.SearchGame1(G_maker);
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Product> SearchGame2(String iss) {
		List<Product> list = new ArrayList<Product>();
		Session session = factory.getCurrentSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			list = dao.SearchGame2(iss);
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		return list;
	}

}
