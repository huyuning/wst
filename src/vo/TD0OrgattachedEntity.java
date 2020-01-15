package vo;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author hyn
 * @create 2019-12-26-14:00
 */
@Entity
@Table(name = "t_d0_orgattached", schema = "wst", catalog = "")
public class TD0OrgattachedEntity {
	private int id;
	private int orgId;
	private String orgName;
	private String orgNo;
	private String orgCode;
	private Double onworkerNum;
	private Double supervisorNum;
	private Double zbbNum;
	private String ifPublicmanage;
	private Double retireNum;
	private Double officeBuildarea;
	private String buildingOwnership;
	private Double officeBuildingarea;
	private Double businessDivCount;
	private Double funDivCount;
	private Double orgCount;
	private Double equ3Count;
	private Double equ2Count;
	private Double equ1Count;
	private Double busCount;
	private Double rapidtestvehicleCount;
	private Double motorCount;
	private Double cameraCount;
	private Double videoCount;
	private Double copycatNum;
	private Double computerNum;
	private Double notepadNum;
	private Double serverCount;
	private Double pbxCount;
	private Double faxCount;
	private Double ohpCount;
	private String yearly;
	private Double vrcount;
	
	public TD0OrgattachedEntity(int id, int orgId, String orgName, String orgNo, String orgCode, Double onworkerNum, Double supervisorNum, Double zbbNum, String ifPublicmanage, Double retireNum, Double officeBuildarea, String buildingOwnership, Double officeBuildingarea, Double businessDivCount, Double funDivCount, Double orgCount, Double equ3Count, Double equ2Count, Double equ1Count, Double busCount, Double rapidtestvehicleCount, Double motorCount, Double cameraCount, Double videoCount, Double copycatNum, Double computerNum, Double notepadNum, Double serverCount, Double pbxCount, Double faxCount, Double ohpCount, String yearly, Double vrcount) {
		this.id = id;
		this.orgId = orgId;
		this.orgName = orgName;
		this.orgNo = orgNo;
		this.orgCode = orgCode;
		this.onworkerNum = onworkerNum;
		this.supervisorNum = supervisorNum;
		this.zbbNum = zbbNum;
		this.ifPublicmanage = ifPublicmanage;
		this.retireNum = retireNum;
		this.officeBuildarea = officeBuildarea;
		this.buildingOwnership = buildingOwnership;
		this.officeBuildingarea = officeBuildingarea;
		this.businessDivCount = businessDivCount;
		this.funDivCount = funDivCount;
		this.orgCount = orgCount;
		this.equ3Count = equ3Count;
		this.equ2Count = equ2Count;
		this.equ1Count = equ1Count;
		this.busCount = busCount;
		this.rapidtestvehicleCount = rapidtestvehicleCount;
		this.motorCount = motorCount;
		this.cameraCount = cameraCount;
		this.videoCount = videoCount;
		this.copycatNum = copycatNum;
		this.computerNum = computerNum;
		this.notepadNum = notepadNum;
		this.serverCount = serverCount;
		this.pbxCount = pbxCount;
		this.faxCount = faxCount;
		this.ohpCount = ohpCount;
		this.yearly = yearly;
		this.vrcount = vrcount;
	}
	
	public int getOrgId() {
		return orgId;
	}
	
	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}
	
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
	@Column(name = "onworkerNum")
	public Double getOnworkerNum() {
		return onworkerNum;
	}
	
	public void setOnworkerNum(Double onworkerNum) {
		this.onworkerNum = onworkerNum;
	}
	
	@Basic
	@Column(name = "supervisorNum")
	public Double getSupervisorNum() {
		return supervisorNum;
	}
	
	public void setSupervisorNum(Double supervisorNum) {
		this.supervisorNum = supervisorNum;
	}
	
	@Basic
	@Column(name = "zbbNum")
	public Double getZbbNum() {
		return zbbNum;
	}
	
	public void setZbbNum(Double zbbNum) {
		this.zbbNum = zbbNum;
	}
	
	@Basic
	@Column(name = "ifPublicmanage")
	public String getIfPublicmanage() {
		return ifPublicmanage;
	}
	
	public void setIfPublicmanage(String ifPublicmanage) {
		this.ifPublicmanage = ifPublicmanage;
	}
	
	@Basic
	@Column(name = "retireNum")
	public Double getRetireNum() {
		return retireNum;
	}
	
	public void setRetireNum(Double retireNum) {
		this.retireNum = retireNum;
	}
	
	@Basic
	@Column(name = "officeBuildarea")
	public Double getOfficeBuildarea() {
		return officeBuildarea;
	}
	
	public void setOfficeBuildarea(Double officeBuildarea) {
		this.officeBuildarea = officeBuildarea;
	}
	
	@Basic
	@Column(name = "buildingOwnership")
	public String getBuildingOwnership() {
		return buildingOwnership;
	}
	
	public void setBuildingOwnership(String buildingOwnership) {
		this.buildingOwnership = buildingOwnership;
	}
	
	@Basic
	@Column(name = "officeBuildingarea")
	public Double getOfficeBuildingarea() {
		return officeBuildingarea;
	}
	
	public void setOfficeBuildingarea(Double officeBuildingarea) {
		this.officeBuildingarea = officeBuildingarea;
	}
	
	@Basic
	@Column(name = "businessDivCount")
	public Double getBusinessDivCount() {
		return businessDivCount;
	}
	
	public void setBusinessDivCount(Double businessDivCount) {
		this.businessDivCount = businessDivCount;
	}
	
	@Basic
	@Column(name = "funDivCount")
	public Double getFunDivCount() {
		return funDivCount;
	}
	
	public void setFunDivCount(Double funDivCount) {
		this.funDivCount = funDivCount;
	}
	
	@Basic
	@Column(name = "orgCount")
	public Double getOrgCount() {
		return orgCount;
	}
	
	public void setOrgCount(Double orgCount) {
		this.orgCount = orgCount;
	}
	
	@Basic
	@Column(name = "equ3Count")
	public Double getEqu3Count() {
		return equ3Count;
	}
	
	public void setEqu3Count(Double equ3Count) {
		this.equ3Count = equ3Count;
	}
	
	@Basic
	@Column(name = "equ2Count")
	public Double getEqu2Count() {
		return equ2Count;
	}
	
	public void setEqu2Count(Double equ2Count) {
		this.equ2Count = equ2Count;
	}
	
	@Basic
	@Column(name = "equ1Count")
	public Double getEqu1Count() {
		return equ1Count;
	}
	
	public void setEqu1Count(Double equ1Count) {
		this.equ1Count = equ1Count;
	}
	
	@Basic
	@Column(name = "busCount")
	public Double getBusCount() {
		return busCount;
	}
	
	public void setBusCount(Double busCount) {
		this.busCount = busCount;
	}
	
	@Basic
	@Column(name = "rapidtestvehicleCount")
	public Double getRapidtestvehicleCount() {
		return rapidtestvehicleCount;
	}
	
	public void setRapidtestvehicleCount(Double rapidtestvehicleCount) {
		this.rapidtestvehicleCount = rapidtestvehicleCount;
	}
	
	@Basic
	@Column(name = "motorCount")
	public Double getMotorCount() {
		return motorCount;
	}
	
	public void setMotorCount(Double motorCount) {
		this.motorCount = motorCount;
	}
	
	@Basic
	@Column(name = "cameraCount")
	public Double getCameraCount() {
		return cameraCount;
	}
	
	public void setCameraCount(Double cameraCount) {
		this.cameraCount = cameraCount;
	}
	
	@Basic
	@Column(name = "videoCount")
	public Double getVideoCount() {
		return videoCount;
	}
	
	public void setVideoCount(Double videoCount) {
		this.videoCount = videoCount;
	}
	
	@Basic
	@Column(name = "copycatNum")
	public Double getCopycatNum() {
		return copycatNum;
	}
	
	public void setCopycatNum(Double copycatNum) {
		this.copycatNum = copycatNum;
	}
	
	@Basic
	@Column(name = "computerNum")
	public Double getComputerNum() {
		return computerNum;
	}
	
	public void setComputerNum(Double computerNum) {
		this.computerNum = computerNum;
	}
	
	@Basic
	@Column(name = "notepadNum")
	public Double getNotepadNum() {
		return notepadNum;
	}
	
	public void setNotepadNum(Double notepadNum) {
		this.notepadNum = notepadNum;
	}
	
	@Basic
	@Column(name = "serverCount")
	public Double getServerCount() {
		return serverCount;
	}
	
	public void setServerCount(Double serverCount) {
		this.serverCount = serverCount;
	}
	
	@Basic
	@Column(name = "pbxCount")
	public Double getPbxCount() {
		return pbxCount;
	}
	
	public void setPbxCount(Double pbxCount) {
		this.pbxCount = pbxCount;
	}
	
	@Basic
	@Column(name = "faxCount")
	public Double getFaxCount() {
		return faxCount;
	}
	
	public void setFaxCount(Double faxCount) {
		this.faxCount = faxCount;
	}
	
	@Basic
	@Column(name = "ohpCount")
	public Double getOhpCount() {
		return ohpCount;
	}
	
	public void setOhpCount(Double ohpCount) {
		this.ohpCount = ohpCount;
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
	@Column(name = "VRCOUNT")
	public Double getVrcount() {
		return vrcount;
	}
	
	public void setVrcount(Double vrcount) {
		this.vrcount = vrcount;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		TD0OrgattachedEntity that = (TD0OrgattachedEntity) o;
		return Objects.equals(id, that.id) &&
				Objects.equals(orgName, that.orgName) &&
				Objects.equals(orgNo, that.orgNo) &&
				Objects.equals(orgCode, that.orgCode) &&
				Objects.equals(onworkerNum, that.onworkerNum) &&
				Objects.equals(supervisorNum, that.supervisorNum) &&
				Objects.equals(zbbNum, that.zbbNum) &&
				Objects.equals(ifPublicmanage, that.ifPublicmanage) &&
				Objects.equals(retireNum, that.retireNum) &&
				Objects.equals(officeBuildarea, that.officeBuildarea) &&
				Objects.equals(buildingOwnership, that.buildingOwnership) &&
				Objects.equals(officeBuildingarea, that.officeBuildingarea) &&
				Objects.equals(businessDivCount, that.businessDivCount) &&
				Objects.equals(funDivCount, that.funDivCount) &&
				Objects.equals(orgCount, that.orgCount) &&
				Objects.equals(equ3Count, that.equ3Count) &&
				Objects.equals(equ2Count, that.equ2Count) &&
				Objects.equals(equ1Count, that.equ1Count) &&
				Objects.equals(busCount, that.busCount) &&
				Objects.equals(rapidtestvehicleCount, that.rapidtestvehicleCount) &&
				Objects.equals(motorCount, that.motorCount) &&
				Objects.equals(cameraCount, that.cameraCount) &&
				Objects.equals(videoCount, that.videoCount) &&
				Objects.equals(copycatNum, that.copycatNum) &&
				Objects.equals(computerNum, that.computerNum) &&
				Objects.equals(notepadNum, that.notepadNum) &&
				Objects.equals(serverCount, that.serverCount) &&
				Objects.equals(pbxCount, that.pbxCount) &&
				Objects.equals(faxCount, that.faxCount) &&
				Objects.equals(ohpCount, that.ohpCount) &&
				Objects.equals(yearly, that.yearly) &&
				Objects.equals(vrcount, that.vrcount);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, orgName, orgNo, orgCode, onworkerNum, supervisorNum, zbbNum, ifPublicmanage, retireNum, officeBuildarea, buildingOwnership, officeBuildingarea, businessDivCount, funDivCount, orgCount, equ3Count, equ2Count, equ1Count, busCount, rapidtestvehicleCount, motorCount, cameraCount, videoCount, copycatNum, computerNum, notepadNum, serverCount, pbxCount, faxCount, ohpCount, yearly, vrcount);
	}
}
