package dao;

import vo.TD0OrgattachedEntity;

import java.sql.Connection;

/**
 * @author hyn
 * @create 2019-12-27-16:34
 */
public interface OrgInfoDao {
	void addone(TD0OrgattachedEntity info, Connection connection);
	
}
