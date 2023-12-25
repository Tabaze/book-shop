package com.crjj.metier;

import java.util.List;

public interface IMerier<T> {

	List<T> getAll();
	T getOne(Long id);
	boolean save(T obj);
	boolean update(T obj);
	boolean delete(T obj);
}
