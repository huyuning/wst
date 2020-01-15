package vo;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

/**
 * @author hyn
 * @create 2019-12-26-14:00
 */
@Entity
@Table(name = "t_d0_stuff", schema = "wst", catalog = "")
public class TD0StuffEntity {
	private int id;
	private String divCode;
	private String orgId;
	private String orgNo;
	private String repManName;
	private String gender;
	private Date birthDate;
	private String folk;
	private String pol;
	private String mobile;
	private String workTel;
	private String email;
	private String edu;
	private String graCollege;
	private String choiceSpe;
	private String spe;
	private String beforeSpe;
	private Date beginWorkDate;
	private String manageJob;
	private String jobLevel;
	private String title;
	private Date getInDate;
	private String perPro;
	private String perType;
	private String enfCardNo;
	private Date getCardDate;
	private String healthPerNo;
	private Date getQuaDate;
	private String healthCardNo;
	private Date cardDay;
	private String ifStaffPer;
	private String perCode;
	
	@Id
	@Column(name = "id")
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@Basic
	@Column(name = "divCode")
	public String getDivCode() {
		return divCode;
	}
	
	public void setDivCode(String divCode) {
		this.divCode = divCode;
	}
	
	@Basic
	@Column(name = "orgId")
	public String getOrgId() {
		return orgId;
	}
	
	public void setOrgId(String orgId) {
		this.orgId = orgId;
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
	@Column(name = "repManName")
	public String getRepManName() {
		return repManName;
	}
	
	public void setRepManName(String repManName) {
		this.repManName = repManName;
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
	@Column(name = "birthDate")
	public Date getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
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
	@Column(name = "pol")
	public String getPol() {
		return pol;
	}
	
	public void setPol(String pol) {
		this.pol = pol;
	}
	
	@Basic
	@Column(name = "mobile")
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	@Basic
	@Column(name = "workTel")
	public String getWorkTel() {
		return workTel;
	}
	
	public void setWorkTel(String workTel) {
		this.workTel = workTel;
	}
	
	@Basic
	@Column(name = "email")
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
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
	@Column(name = "graCollege")
	public String getGraCollege() {
		return graCollege;
	}
	
	public void setGraCollege(String graCollege) {
		this.graCollege = graCollege;
	}
	
	@Basic
	@Column(name = "choiceSpe")
	public String getChoiceSpe() {
		return choiceSpe;
	}
	
	public void setChoiceSpe(String choiceSpe) {
		this.choiceSpe = choiceSpe;
	}
	
	@Basic
	@Column(name = "spe")
	public String getSpe() {
		return spe;
	}
	
	public void setSpe(String spe) {
		this.spe = spe;
	}
	
	@Basic
	@Column(name = "beforeSpe")
	public String getBeforeSpe() {
		return beforeSpe;
	}
	
	public void setBeforeSpe(String beforeSpe) {
		this.beforeSpe = beforeSpe;
	}
	
	@Basic
	@Column(name = "beginWorkDate")
	public Date getBeginWorkDate() {
		return beginWorkDate;
	}
	
	public void setBeginWorkDate(Date beginWorkDate) {
		this.beginWorkDate = beginWorkDate;
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
	@Column(name = "jobLevel")
	public String getJobLevel() {
		return jobLevel;
	}
	
	public void setJobLevel(String jobLevel) {
		this.jobLevel = jobLevel;
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
	@Column(name = "getInDate")
	public Date getGetInDate() {
		return getInDate;
	}
	
	public void setGetInDate(Date getInDate) {
		this.getInDate = getInDate;
	}
	
	@Basic
	@Column(name = "perPro")
	public String getPerPro() {
		return perPro;
	}
	
	public void setPerPro(String perPro) {
		this.perPro = perPro;
	}
	
	@Basic
	@Column(name = "perType")
	public String getPerType() {
		return perType;
	}
	
	public void setPerType(String perType) {
		this.perType = perType;
	}
	
	@Basic
	@Column(name = "enfCardNo")
	public String getEnfCardNo() {
		return enfCardNo;
	}
	
	public void setEnfCardNo(String enfCardNo) {
		this.enfCardNo = enfCardNo;
	}
	
	@Basic
	@Column(name = "getCardDate")
	public Date getGetCardDate() {
		return getCardDate;
	}
	
	public void setGetCardDate(Date getCardDate) {
		this.getCardDate = getCardDate;
	}
	
	@Basic
	@Column(name = "healthPerNo")
	public String getHealthPerNo() {
		return healthPerNo;
	}
	
	public void setHealthPerNo(String healthPerNo) {
		this.healthPerNo = healthPerNo;
	}
	
	@Basic
	@Column(name = "getQuaDate")
	public Date getGetQuaDate() {
		return getQuaDate;
	}
	
	public void setGetQuaDate(Date getQuaDate) {
		this.getQuaDate = getQuaDate;
	}
	
	@Basic
	@Column(name = "healthCardNo")
	public String getHealthCardNo() {
		return healthCardNo;
	}
	
	public void setHealthCardNo(String healthCardNo) {
		this.healthCardNo = healthCardNo;
	}
	
	@Basic
	@Column(name = "cardDay")
	public Date getCardDay() {
		return cardDay;
	}
	
	public void setCardDay(Date cardDay) {
		this.cardDay = cardDay;
	}
	
	@Basic
	@Column(name = "ifStaffPer")
	public String getIfStaffPer() {
		return ifStaffPer;
	}
	
	public void setIfStaffPer(String ifStaffPer) {
		this.ifStaffPer = ifStaffPer;
	}
	
	@Basic
	@Column(name = "perCode")
	public String getPerCode() {
		return perCode;
	}
	
	public void setPerCode(String perCode) {
		this.perCode = perCode;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		TD0StuffEntity that = (TD0StuffEntity) o;
		return Objects.equals(id, that.id) &&
				Objects.equals(divCode, that.divCode) &&
				Objects.equals(orgId, that.orgId) &&
				Objects.equals(orgNo, that.orgNo) &&
				Objects.equals(repManName, that.repManName) &&
				Objects.equals(gender, that.gender) &&
				Objects.equals(birthDate, that.birthDate) &&
				Objects.equals(folk, that.folk) &&
				Objects.equals(pol, that.pol) &&
				Objects.equals(mobile, that.mobile) &&
				Objects.equals(workTel, that.workTel) &&
				Objects.equals(email, that.email) &&
				Objects.equals(edu, that.edu) &&
				Objects.equals(graCollege, that.graCollege) &&
				Objects.equals(choiceSpe, that.choiceSpe) &&
				Objects.equals(spe, that.spe) &&
				Objects.equals(beforeSpe, that.beforeSpe) &&
				Objects.equals(beginWorkDate, that.beginWorkDate) &&
				Objects.equals(manageJob, that.manageJob) &&
				Objects.equals(jobLevel, that.jobLevel) &&
				Objects.equals(title, that.title) &&
				Objects.equals(getInDate, that.getInDate) &&
				Objects.equals(perPro, that.perPro) &&
				Objects.equals(perType, that.perType) &&
				Objects.equals(enfCardNo, that.enfCardNo) &&
				Objects.equals(getCardDate, that.getCardDate) &&
				Objects.equals(healthPerNo, that.healthPerNo) &&
				Objects.equals(getQuaDate, that.getQuaDate) &&
				Objects.equals(healthCardNo, that.healthCardNo) &&
				Objects.equals(cardDay, that.cardDay) &&
				Objects.equals(ifStaffPer, that.ifStaffPer) &&
				Objects.equals(perCode, that.perCode);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, divCode, orgId, orgNo, repManName, gender, birthDate, folk, pol, mobile, workTel, email, edu, graCollege, choiceSpe, spe, beforeSpe, beginWorkDate, manageJob, jobLevel, title, getInDate, perPro, perType, enfCardNo, getCardDate, healthPerNo, getQuaDate, healthCardNo, cardDay, ifStaffPer, perCode);
	}
}
