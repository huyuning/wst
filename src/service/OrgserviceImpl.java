package service;

import dao.*;
import tools.Mytools;
import vo.OrgCondition;
import vo.TD0OrganizationEntity;
import vo.TD0OrgattachedEntity;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author hyn
 * @create 2019-12-27-16:39
 */
public class OrgserviceImpl implements OrgService {
	OrgDao orgDao =new OrgDaoImpl();
	OrgInfoDao orgInfoDao = new OrgInfoDaoImpl();
	SequenDao seq = new SequenDaoImpl();
	@Override
	public boolean addOrg(TD0OrganizationEntity organizationEntity, TD0OrgattachedEntity orgattachedEntity) throws SQLException{
		BaseDao baseDao = new BaseDao();
		Connection conn = baseDao.getConnetion();
		//设置自动提交为false
		try {
			conn.setAutoCommit(false);
			//事务操作
			Long nextval = seq.getNextvalByName("orgseq");
			String orgno = organizationEntity.getAreaCode()+ Mytools.liuShui3(nextval);
			//生成orgno
			organizationEntity.setOrgNo(orgno);
			orgattachedEntity.setOrgNo(orgno);
			//向表中添加数据
			orgDao.addone(organizationEntity,conn);
			long iid = seq.last_insert_id(conn);
			System.out.println(iid);
			orgattachedEntity.setOrgId(Integer.parseInt(iid+""));
			orgInfoDao.addone(orgattachedEntity,conn);
			//事务提交
			conn.commit();
			return true;
		}catch (Exception e){
			
			e.printStackTrace();
			conn.rollback();//事务处理失败，事务回滚
		}
		
		
		
		return false;
	}
	
	@Override
	public List<TD0OrganizationEntity> getByCondition(OrgCondition con) {
	
		return orgDao.getByCondition(con);
	}
	
	@Override
	public List<TD0OrganizationEntity> getByPage(int page, int count) {
		
		return orgDao.getByPage(page, count);
	}
}
