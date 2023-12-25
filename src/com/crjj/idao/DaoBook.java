package com.crjj.idao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.crjj.model.Books;

import com.crjj.utils.HibernateUtils;

public class DaoBook implements IDAO<Books> {
	@Override
	public List<Books> getAll() {
		Session s = HibernateUtils.getSessionfactory().getCurrentSession();
		Transaction t = s.beginTransaction();

		List<Books> commande = s.createQuery("from Books").getResultList();

		t.commit();
		s.close();

		return commande;
	}

	@Override
	public Books getOne(Long id) {
		Session session = HibernateUtils.getSessionfactory().getCurrentSession();
		Transaction t = session.beginTransaction();
		System.out.println(id);
		Books commande = session.get(Books.class, id);
		t.commit();
		session.close();
		return commande;
	}

	@Override
	public boolean save(Books obj) {
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
	public boolean update(Books obj) {
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
	public boolean delete(Books obj) {
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
