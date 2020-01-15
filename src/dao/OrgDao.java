package dao;

import vo.OrgCondition;
import vo.TD0OrganizationEntity;

import java.sql.Connection;
import java.util.List;

/**
 * @author hyn
 * @create 2019-12-27-16:23
 */
public interface OrgDao {
	void addone(TD0OrganizationEntity org, Connection connection);
//	void update(TD0OrganizationEntity org,Connection connection);
//	List<TD0OrganizationEntity>getAll();
	public List<TD0OrganizationEntity> getByCondition(OrgCondition con);
	List<TD0OrganizationEntity>getByPage(int page,int count);
}
