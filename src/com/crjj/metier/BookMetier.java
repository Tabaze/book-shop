package com.crjj.metier;

import java.util.List;

import com.crjj.idao.DaoBook;
import com.crjj.idao.IDAO;
import com.crjj.model.Books;

public class BookMetier implements IMerier<Books> {

	IDAO<Books> dao=new DaoBook();
	
	@Override
	public List<Books> getAll() {
		return dao.getAll();
	}

	@Override
	public Books getOne(Long id) {
		return dao.getOne(id);
	}

	@Override
	public boolean save(Books obj) {
		return dao.save(obj);
	}

	@Override
	public boolean update(Books obj) {
		return dao.update(obj);
	}

	@Override
	public boolean delete(Books obj) {
		return dao.delete(obj);
	}

}
