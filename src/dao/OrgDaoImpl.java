package dao;

import vo.OrgCondition;
import vo.TD0OrganizationEntity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author hyn
 * @create 2019-12-27-16:26
 */
public class OrgDaoImpl extends BaseDao implements OrgDao{
	@Override
	public void addone(TD0OrganizationEntity org, Connection connection) {
		String sql = "insert into t_d0_organization value(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		this.executeUpdate(connection,sql,org.getId(),org.getOrgNo(),org.getOrgCode(),org.getOrgName(),org.getExeType(),org.getAreaCode(),org.getLinkAdd(),org.getListingDate(),org.getStandaloneDate(),org.getAreaType(),org.getZbbdocDate(),org.getOrgLevel(),org.getOrgPro(),org.getZipcode());
		
	}
	public List<TD0OrganizationEntity>getByPage(int page,int count){
		List<TD0OrganizationEntity>list = new ArrayList<TD0OrganizationEntity>();
		String sql = "select * from t_d0_organization order by id limit ?,?";
		ResultSet rs   =  this.executeQuery(sql,(page-1)*count,count);
		try {
			while (rs.next()){
				TD0OrganizationEntity org=new TD0OrganizationEntity();
				org.setAreaCode(rs.getString("areaCode"));
				org.setAreaType(rs.getString("areaType"));
				org.setExeType(rs.getString("exeType"));
				org.setId(rs.getInt("id"));
				org.setLinkAdd(rs.getString("linkAdd"));
				org.setListingDate(rs.getDate("listingDate"));
				org.setOrgCode(rs.getString("orgCode"));
				org.setOrgLevel(rs.getString("orgLevel"));
				org.setOrgName(rs.getString("orgName"));
				org.setOrgNo(rs.getString("orgNo"));
				org.setOrgPro(rs.getString("orgPro"));
				org.setStandaloneDate(rs.getDate("standaloneDate"));
				org.setZbbdocDate(rs.getDate("zbbdocDate"));
				org.setZipcode(rs.getString("zipCode"));
				System.out.println(org);
				list.add(org);
			}
			
		}catch (Exception e){
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public List<TD0OrganizationEntity> getByCondition(OrgCondition con) {
		List<TD0OrganizationEntity>list = new ArrayList<TD0OrganizationEntity>();
		String sql = "select * from t_d0_organization where 1=1 ";
		
		if (con.getAddr_query()!=null&&con.getAddr_query().length()>0)
			sql+="and linkAdd like '%"+con.getAddr_query()+"%'";
		if (con.getAreacode_query()!=null&&con.getAddr_query().length()>0)
			sql+="and areaCode ='"+con.getAreacode_query()+"'";
		if (con.getExetype_query()!=null&&con.getAddr_query().length()>0)
			sql+="and exeType ='"+con.getExetype_query()+"'";
		if (con.getOrgname_query()!=null&&con.getAddr_query().length()>0)
			sql+="and orgName ='"+con.getOrgname_query()+"'";
		if (con.getOrgno_query()!=null&&con.getAddr_query().length()>0)
			sql+="and orgNo ='"+con.getOrgno_query()+"'";
		if (con.getOrgPro_query()!=null&&con.getAddr_query().length()>0)
			sql+="and orgPro ='"+con.getOrgPro_query()+"'";
		if (con.getZipcode_query()!=null&&con.getAddr_query().length()>0)
			sql+="and ZIPCODE ='"+con.getZipcode_query()+"'";
	ResultSet rs = this.executeQuery(sql);
		try{
			while (rs.next()){
				TD0OrganizationEntity org=new TD0OrganizationEntity();
				org.setAreaCode(rs.getString("areaCode"));
				org.setAreaType(rs.getString("areaType"));
				org.setExeType(rs.getString("exeType"));
				org.setId(rs.getInt("id"));
				org.setLinkAdd(rs.getString("linkAdd"));
				org.setListingDate(rs.getDate("listingDate"));
				org.setOrgCode(rs.getString("orgCode"));
				org.setOrgLevel(rs.getString("orgLevel"));
				org.setOrgName(rs.getString("orgName"));
				org.setOrgNo(rs.getString("orgNo"));
				org.setOrgPro(rs.getString("orgPro"));
				org.setStandaloneDate(rs.getDate("standaloneDate"));
				org.setZbbdocDate(rs.getDate("zbbdocDate"));
				org.setZipcode(rs.getString("zipCode"));
				list.add(org);
				
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		return list;
	}
}
