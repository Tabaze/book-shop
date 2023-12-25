package com.crjj.idao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.crjj.model.User;
import com.crjj.utils.HibernateUtils;

public class DaoUser implements IDAO<User> {

	@Override
	public List<User> getAll() {
		Session s = HibernateUtils.getSessionfactory().getCurrentSession();
		Transaction t = s.beginTransaction();

		List<User> commande = s.createQuery("from User").getResultList();

		t.commit();
		s.close();

		return commande;
	}

	@Override
	public User getOne(Long id) {
		Session session = HibernateUtils.getSessionfactory().getCurrentSession();
		Transaction t = session.beginTransaction();
		System.out.println(id);
		User commande = session.get(User.class, id);
		t.commit();
		session.close();
		return commande;
	}

	@Override
	public boolean save(User obj) {
		try {
			Session s = HibernateUtils.getSessionfactory().getCurrentSession();
			Transaction t = s.beginTransaction();

			s.save(obj);
			t.commit();
			s.close();

			return true;
		} catch (Exception ex) {
			System.out.println("Error " + ex.getMessage());
			return false;
		}
	}

	@Override
	public boolean update(User obj) {
		try {
			Session session = HibernateUtils.getSessionfactory().getCurrentSession();
			Transaction t = session.beginTransaction();

			session.update(obj);

			t.commit();
			session.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean delete(User obj) {
		try {
			Session session = HibernateUtils.getSessionfactory().getCurrentSession();
			Transaction t = session.beginTransaction();

			session.delete(obj);

			t.commit();
			session.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
