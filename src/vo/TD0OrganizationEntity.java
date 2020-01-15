package vo;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * @author hyn
 * @create 2019-12-26-14:00
 */
@Entity
@Table(name = "t_d0_organization", schema = "wst", catalog = "")
public class TD0OrganizationEntity {
	private int id;
	private String orgNo;
	private String orgCode;
	private String orgName;
	private String exeType;
	private String areaCode;
	private String linkAdd;
	private Date listingDate;
	private Date standaloneDate;
	private String areaType;
	private Date zbbdocDate;
	private String orgLevel;
	private String orgPro;
	private String zipcode;
	
	@Id
	@Column(name = "id")
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
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
	@Column(name = "orgName")
	public String getOrgName() {
		return orgName;
	}
	
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	
	public TD0OrganizationEntity(int id, String orgNo, String orgCode, String orgName, String exeType, String areaCode, String linkAdd, Date listingDate, Date standaloneDate, String areaType, Date zbbdocDate, String orgLevel, String orgPro, String zipcode) {
		this.id = id;
		this.orgNo = orgNo;
		this.orgCode = orgCode;
		this.orgName = orgName;
		this.exeType = exeType;
		this.areaCode = areaCode;
		this.linkAdd = linkAdd;
		this.listingDate = listingDate;
		this.standaloneDate = standaloneDate;
		this.areaType = areaType;
		this.zbbdocDate = zbbdocDate;
		this.orgLevel = orgLevel;
		this.orgPro = orgPro;
		this.zipcode = zipcode;
	}
	
	@Basic
	@Column(name = "exeType")
	public String getExeType() {
		return exeType;
	}
	
	public void setExeType(String exeType) {
		this.exeType = exeType;
	}
	
	@Basic
	@Column(name = "areaCode")
	public String getAreaCode() {
		return areaCode;
	}
	
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	
	@Basic
	@Column(name = "linkAdd")
	public String getLinkAdd() {
		return linkAdd;
	}
	
	public void setLinkAdd(String linkAdd) {
		this.linkAdd = linkAdd;
	}
	
	@Basic
	@Column(name = "listingDate")
	public Date getListingDate() {
		return listingDate;
	}
	
	public TD0OrganizationEntity() {
	
	}
	
	public void setListingDate(Date listingDate) {
		this.listingDate = listingDate;
	}
	
	@Basic
	@Column(name = "standaloneDate")
	public Date getStandaloneDate() {
		return standaloneDate;
	}
	
	public void setStandaloneDate(Date standaloneDate) {
		this.standaloneDate = standaloneDate;
	}
	
	@Basic
	@Column(name = "areaType")
	public String getAreaType() {
		return areaType;
	}
	
	public void setAreaType(String areaType) {
		this.areaType = areaType;
	}
	
	@Basic
	@Column(name = "zbbdocDate")
	public Date getZbbdocDate() {
		return zbbdocDate;
	}
	
	public void setZbbdocDate(Date zbbdocDate) {
		this.zbbdocDate = zbbdocDate;
	}
	
	@Basic
	@Column(name = "orgLevel")
	public String getOrgLevel() {
		return orgLevel;
	}
	
	public void setOrgLevel(String orgLevel) {
		this.orgLevel = orgLevel;
	}
	
	@Basic
	@Column(name = "orgPro")
	public String getOrgPro() {
		return orgPro;
	}
	
	public void setOrgPro(String orgPro) {
		this.orgPro = orgPro;
	}
	
	@Basic
	@Column(name = "ZIPCODE")
	public String getZipcode() {
		return zipcode;
	}
	
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		TD0OrganizationEntity that = (TD0OrganizationEntity) o;
		return Objects.equals(id, that.id) &&
				Objects.equals(orgNo, that.orgNo) &&
				Objects.equals(orgCode, that.orgCode) &&
				Objects.equals(orgName, that.orgName) &&
				Objects.equals(exeType, that.exeType) &&
				Objects.equals(areaCode, that.areaCode) &&
				Objects.equals(linkAdd, that.linkAdd) &&
				Objects.equals(listingDate, that.listingDate) &&
				Objects.equals(standaloneDate, that.standaloneDate) &&
				Objects.equals(areaType, that.areaType) &&
				Objects.equals(zbbdocDate, that.zbbdocDate) &&
				Objects.equals(orgLevel, that.orgLevel) &&
				Objects.equals(orgPro, that.orgPro) &&
				Objects.equals(zipcode, that.zipcode);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, orgNo, orgCode, orgName, exeType, areaCode, linkAdd, listingDate, standaloneDate, areaType, zbbdocDate, orgLevel, orgPro, zipcode);
	}
}
