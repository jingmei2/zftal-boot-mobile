package zfsoft.service.base;

import zfsoft.dao.annotation.BaseAnDao;

import java.util.List;


public abstract class BaseAnServiceImpl<T> implements BaseAnService<T> {

	public abstract BaseAnDao<T> getDao();

	@Override
	public void add(T entity) {
		getDao().insert(entity);
	}

	@Override
	public void removeById(T entity) {
		getDao().delete(entity);
	}

	@Override
	public void modify(T entity) {
		getDao().update(entity);
	}

	@Override
	public <Q> T getById(Q entity) {
		return getDao().findById(entity);
	}

	@Override
	public <Q> List<T> getList(Q query) {
		return getDao().findList(query);
	}

}
