package vo;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

/**
 * @author hyn
 * @create 2019-12-26-14:00
 */
@Entity
@Table(name = "t_d0_leader", schema = "wst", catalog = "")
public class TD0LeaderEntity {
	private int id;
	private String orgName;
	private String orgNo;
	private String orgCode;
	private String formFillingMan;
	private String linkTel;
	private String leaderName;
	private String gender;
	private String folk;
	private Date birthDate;
	private String pol;
	private String edu;
	private String degree;
	private String manageJob;
	private String title;
	private String memo;
	private Date serDate;
	private Date leaveDate;
	private String yearly;
	
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
	@Column(name = "formFillingMan")
	public String getFormFillingMan() {
		return formFillingMan;
	}
	
	public void setFormFillingMan(String formFillingMan) {
		this.formFillingMan = formFillingMan;
	}
	
	@Basic
	@Column(name = "linkTel")
	public String getLinkTel() {
		return linkTel;
	}
	
	public void setLinkTel(String linkTel) {
		this.linkTel = linkTel;
	}
	
	@Basic
	@Column(name = "leaderName")
	public String getLeaderName() {
		return leaderName;
	}
	
	public void setLeaderName(String leaderName) {
		this.leaderName = leaderName;
	}
	
	@Basic
	@Column(name = "gender")
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Basic
	@Column(name = "folk")
	public String getFolk() {
		return folk;
	}
	
	public void setFolk(String folk) {
		this.folk = folk;
	}
	
	@Basic
	@Column(name = "birthDate")
	public Date getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	@Basic
	@Column(name = "pol")
	public String getPol() {
		return pol;
	}
	
	public void setPol(String pol) {
		this.pol = pol;
	}
	
	@Basic
	@Column(name = "edu")
	public String getEdu() {
		return edu;
	}
	
	public void setEdu(String edu) {
		this.edu = edu;
	}
	
	@Basic
	@Column(name = "degree")
	public String getDegree() {
		return degree;
	}
	
	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	@Basic
	@Column(name = "manageJob")
	public String getManageJob() {
		return manageJob;
	}
	
	public void setManageJob(String manageJob) {
		this.manageJob = manageJob;
	}
	
	@Basic
	@Column(name = "title")
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Basic
	@Column(name = "memo")
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	@Basic
	@Column(name = "serDate")
	public Date getSerDate() {
		return serDate;
	}
	
	public void setSerDate(Date serDate) {
		this.serDate = serDate;
	}
	
	@Basic
	@Column(name = "leaveDate")
	public Date getLeaveDate() {
		return leaveDate;
	}
	
	public void setLeaveDate(Date leaveDate) {
		this.leaveDate = leaveDate;
	}
	
	@Basic
	@Column(name = "yearly")
	public String getYearly() {
		return yearly;
	}
	
	public void setYearly(String yearly) {
		this.yearly = yearly;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		TD0LeaderEntity that = (TD0LeaderEntity) o;
		return Objects.equals(id, that.id) &&
				Objects.equals(orgName, that.orgName) &&
				Objects.equals(orgNo, that.orgNo) &&
				Objects.equals(orgCode, that.orgCode) &&
				Objects.equals(formFillingMan, that.formFillingMan) &&
				Objects.equals(linkTel, that.linkTel) &&
				Objects.equals(leaderName, that.leaderName) &&
				Objects.equals(gender, that.gender) &&
				Objects.equals(folk, that.folk) &&
				Objects.equals(birthDate, that.birthDate) &&
				Objects.equals(pol, that.pol) &&
				Objects.equals(edu, that.edu) &&
				Objects.equals(degree, that.degree) &&
				Objects.equals(manageJob, that.manageJob) &&
				Objects.equals(title, that.title) &&
				Objects.equals(memo, that.memo) &&
				Objects.equals(serDate, that.serDate) &&
				Objects.equals(leaveDate, that.leaveDate) &&
				Objects.equals(yearly, that.yearly);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, orgName, orgNo, orgCode, formFillingMan, linkTel, leaderName, gender, folk, birthDate, pol, edu, degree, manageJob, title, memo, serDate, leaveDate, yearly);
	}
}
