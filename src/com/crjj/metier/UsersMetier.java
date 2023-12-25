package com.crjj.metier;

import java.util.List;

import com.crjj.idao.DaoUser;
import com.crjj.idao.IDAO;
import com.crjj.model.User;

public class UsersMetier implements IMerier<User> {
	IDAO<User> dao = new DaoUser();

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public User getOne(Long id) {
		// TODO Auto-generated method stub
		return dao.getOne(id);
	}

	@Override
	public boolean save(User obj) {
		// TODO Auto-generated method stub
		return dao.save(obj);
	}

	@Override
	public boolean update(User obj) {
		// TODO Auto-generated method stub
		return dao.update(obj);
	}

	@Override
	public boolean delete(User obj) {
		// TODO Auto-generated method stub
		return dao.delete(obj);
	}

	public boolean Login(String username, String pass) {
		User user = this.getAll().stream()
				.filter(use -> username.equals(use.getUsername()) && pass.equals(use.getPassword())).findAny()
				.orElse(null);
		if (user != null)
			return true;
		return false;
	}

}
