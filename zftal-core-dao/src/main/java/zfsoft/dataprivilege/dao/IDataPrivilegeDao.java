package zfsoft.dataprivilege.dao;


import zfsoft.dataprivilege.entity.DataPrivilege;

import java.util.List;

public interface IDataPrivilegeDao {
	public List<DataPrivilege> findByQuery(DataPrivilege query);

	public void insert(DataPrivilege dataPrivilege);

	public void update(DataPrivilege dataPrivilege);

	public void delete(DataPrivilege dataPrivilege);
}
