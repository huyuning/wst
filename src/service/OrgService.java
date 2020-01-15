package service;

import vo.OrgCondition;
import vo.TD0OrganizationEntity;
import vo.TD0OrgattachedEntity;

import java.sql.SQLException;
import java.util.List;

/**
 * @author hyn
 * @create 2019-12-27-16:37
 */
public interface OrgService {
	boolean addOrg(TD0OrganizationEntity organizationEntity,TD0OrgattachedEntity orgattachedEntity)throws SQLException;
	List<TD0OrganizationEntity> getByCondition(OrgCondition con);
	List<TD0OrganizationEntity> getByPage(int page,int count);
}
