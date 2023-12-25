package com.crjj.metier;

import java.util.List;

import com.crjj.idao.DaoBook;
import com.crjj.idao.IDAO;
import com.crjj.model.Books;

public class BookMetier implements IMerier<Books> {

	IDAO<Books> dao=new DaoBook();
	@Override
	public List<Books> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public Books getOne(Long id) {
		// TODO Auto-generated method stub
		return dao.getOne(id);
	}

	@Override
	public boolean save(Books obj) {
		// TODO Auto-generated method stub
		return dao.save(obj);
	}

	@Override
	public boolean update(Books obj) {
		// TODO Auto-generated method stub
		return dao.update(obj);
	}

	@Override
	public boolean delete(Books obj) {
		// TODO Auto-generated method stub
		return dao.delete(obj);
	}

}
