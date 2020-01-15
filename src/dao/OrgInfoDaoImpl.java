package dao;

import vo.TD0OrgattachedEntity;

import java.sql.Connection;

/**
 * @author hyn
 * @create 2019-12-27-16:37
 */
public class OrgInfoDaoImpl extends BaseDao implements OrgInfoDao{
	@Override
	public void addone(TD0OrgattachedEntity info, Connection connection) {
	String sql = "insert into t_d0_orgattached value(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	this.executeUpdate(connection,sql,
			info.getId(),info.getOrgId(),info.getOrgName(),
			info.getOrgNo(),info.getOrgCode(),info.getOnworkerNum(),
			info.getSupervisorNum(),info.getZbbNum(),
			info.getIfPublicmanage(),info.getRetireNum(),info.getOfficeBuildarea(),
			info.getBuildingOwnership(),info.getOfficeBuildingarea(),info.getBusinessDivCount(),
			info.getFunDivCount(),info.getOrgCount(),info.getEqu3Count(),
			info.getEqu2Count(),info.getEqu1Count(),info.getBusCount(),
			info.getRapidtestvehicleCount(),info.getMotorCount(),info.getCameraCount(),
			info.getVideoCount(),info.getCopycatNum(),info.getComputerNum(),
			info.getNotepadNum(),info.getServerCount(),info.getPbxCount(),
			info.getFaxCount(),info.getOhpCount(),info.getYearly(),
			info.getVrcount());
	}
}
