package vo;

/**
 * @author hyn
 * @create 2020-01-02-13:54
 */
public class OrgCondition {
	String exetype_query ;
	String orgname_query ;
	String addr_query ;
	String orgno_query;
	String areacode_query;
	String zipcode_query;
	String orgPro_query  ;
	
	public OrgCondition(String exetype_query, String orgname_query, String addr_query, String orgno_query, String areacode_query, String zipcode_query, String orgPro_query) {
		this.exetype_query = exetype_query;
		this.orgname_query = orgname_query;
		this.addr_query = addr_query;
		this.orgno_query = orgno_query;
		this.areacode_query = areacode_query;
		this.zipcode_query = zipcode_query;
		this.orgPro_query = orgPro_query;
	}
	
	public String getExetype_query() {
		return exetype_query;
	}
	
	public void setExetype_query(String exetype_query) {
		this.exetype_query = exetype_query;
	}
	
	public String getOrgname_query() {
		return orgname_query;
	}
	
	public void setOrgname_query(String orgname_query) {
		this.orgname_query = orgname_query;
	}
	
	public String getAddr_query() {
		return addr_query;
	}
	
	public void setAddr_query(String addr_query) {
		this.addr_query = addr_query;
	}
	
	public String getOrgno_query() {
		return orgno_query;
	}
	
	public void setOrgno_query(String orgno_query) {
		this.orgno_query = orgno_query;
	}
	
	public String getAreacode_query() {
		return areacode_query;
	}
	
	public void setAreacode_query(String areacode_query) {
		this.areacode_query = areacode_query;
	}
	
	public String getZipcode_query() {
		return zipcode_query;
	}
	
	public void setZipcode_query(String zipcode_query) {
		this.zipcode_query = zipcode_query;
	}
	
	public String getOrgPro_query() {
		return orgPro_query;
	}
	
	public void setOrgPro_query(String orgPro_query) {
		this.orgPro_query = orgPro_query;
	}
}
