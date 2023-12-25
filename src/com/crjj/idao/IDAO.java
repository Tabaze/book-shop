package com.crjj.idao;

import java.util.List;

public interface IDAO<T> {

	List<T> getAll();
	T getOne(Long id);
	boolean save(T obj);
	boolean update(T obj);
	boolean delete(T obj);
}
