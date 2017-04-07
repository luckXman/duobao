package com.duobao.core.dao;

import java.util.List;

/**
 * 通用泛型DAO基类
 * 
 * @author g
 *
 * @param <T>
 */
public interface BaseDao<T> {
	/**
	 * 对对象进行持久化操作，如果成功则返回持久化后的ID 失败则返回null
	 * 
	 * @param obj
	 * @return
	 */
	void save(T obj);

	/**
	 * 删除指定id的持久化对象
	 * 
	 * @param id
	 */
	void delete(T obj);

	/**
	 * 修改指定的持久化对象
	 * 
	 * @param id
	 * @param obj
	 */
	void update(T obj);

	/**
	 * 返回持久化对象
	 * 
	 * @param id
	 * @return 找到则返回，否则返回空
	 */
	T get(Integer id);

	/**
	 * 返回所有持久化对象
	 * 
	 * @return
	 */
	List<T> list();

	/**
	 * 传入页码对象，进行分页查询
	 * 
	 * @param pn
	 * @return
	 */
	List<T> list(PageNumber pn);
}