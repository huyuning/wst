package vo;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author hyn
 * @create 2019-12-26-14:00
 */
@Entity
@Table(name = "t_d0_fund", schema = "wst", catalog = "")
public class TD0FundEntity {
	private int id;
	private String orgName;
	private String orgNo;
	private String orgCode;
	private String yearly;
	private Double preFund;
	private Double businessFund;
	private Double dutyFund;
	private Double buildFund;
	
	@Id
	@Column(name = "id")
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@Basic
	@Column(name = "orgName")
	public String getOrgName() {
		return orgName;
	}
	
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	
	@Basic
	@Column(name = "orgNo")
	public String getOrgNo() {
		return orgNo;
	}
	
	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}
	
	@Basic
	@Column(name = "orgCode")
	public String getOrgCode() {
		return orgCode;
	}
	
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	
	@Basic
	@Column(name = "yearly")
	public String getYearly() {
		return yearly;
	}
	
	public void setYearly(String yearly) {
		this.yearly = yearly;
	}
	
	@Basic
	@Column(name = "preFund")
	public Double getPreFund() {
		return preFund;
	}
	
	public void setPreFund(Double preFund) {
		this.preFund = preFund;
	}
	
	@Basic
	@Column(name = "businessFund")
	public Double getBusinessFund() {
		return businessFund;
	}
	
	public void setBusinessFund(Double businessFund) {
		this.businessFund = businessFund;
	}
	
	@Basic
	@Column(name = "dutyFund")
	public Double getDutyFund() {
		return dutyFund;
	}
	
	public void setDutyFund(Double dutyFund) {
		this.dutyFund = dutyFund;
	}
	
	@Basic
	@Column(name = "buildFund")
	public Double getBuildFund() {
		return buildFund;
	}
	
	public void setBuildFund(Double buildFund) {
		this.buildFund = buildFund;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		TD0FundEntity that = (TD0FundEntity) o;
		return Objects.equals(id, that.id) &&
				Objects.equals(orgName, that.orgName) &&
				Objects.equals(orgNo, that.orgNo) &&
				Objects.equals(orgCode, that.orgCode) &&
				Objects.equals(yearly, that.yearly) &&
				Objects.equals(preFund, that.preFund) &&
				Objects.equals(businessFund, that.businessFund) &&
				Objects.equals(dutyFund, that.dutyFund) &&
				Objects.equals(buildFund, that.buildFund);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, orgName, orgNo, orgCode, yearly, preFund, businessFund, dutyFund, buildFund);
	}
}
