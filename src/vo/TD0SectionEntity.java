package vo;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author hyn
 * @create 2019-12-26-14:00
 */
@Entity
@Table(name = "t_d0_section", schema = "wst", catalog = "")
public class TD0SectionEntity {
	private int id;
	private String orgNo;
	private String divCode;
	private String divNameCode;
	private String divName;
	private String ifSub;
	private String dutyTel;
	private String fax;
	private String divRoomNo;
	private String exetype;
	
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
	@Column(name = "divCode")
	public String getDivCode() {
		return divCode;
	}
	
	public void setDivCode(String divCode) {
		this.divCode = divCode;
	}
	
	@Basic
	@Column(name = "divNameCode")
	public String getDivNameCode() {
		return divNameCode;
	}
	
	public void setDivNameCode(String divNameCode) {
		this.divNameCode = divNameCode;
	}
	
	@Basic
	@Column(name = "divName")
	public String getDivName() {
		return divName;
	}
	
	public void setDivName(String divName) {
		this.divName = divName;
	}
	
	@Basic
	@Column(name = "ifSub")
	public String getIfSub() {
		return ifSub;
	}
	
	public void setIfSub(String ifSub) {
		this.ifSub = ifSub;
	}
	
	@Basic
	@Column(name = "dutyTel")
	public String getDutyTel() {
		return dutyTel;
	}
	
	public void setDutyTel(String dutyTel) {
		this.dutyTel = dutyTel;
	}
	
	@Basic
	@Column(name = "fax")
	public String getFax() {
		return fax;
	}
	
	public void setFax(String fax) {
		this.fax = fax;
	}
	
	@Basic
	@Column(name = "divRoomNo")
	public String getDivRoomNo() {
		return divRoomNo;
	}
	
	public void setDivRoomNo(String divRoomNo) {
		this.divRoomNo = divRoomNo;
	}
	
	@Basic
	@Column(name = "EXETYPE")
	public String getExetype() {
		return exetype;
	}
	
	public void setExetype(String exetype) {
		this.exetype = exetype;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		TD0SectionEntity that = (TD0SectionEntity) o;
		return Objects.equals(id, that.id) &&
				Objects.equals(orgNo, that.orgNo) &&
				Objects.equals(divCode, that.divCode) &&
				Objects.equals(divNameCode, that.divNameCode) &&
				Objects.equals(divName, that.divName) &&
				Objects.equals(ifSub, that.ifSub) &&
				Objects.equals(dutyTel, that.dutyTel) &&
				Objects.equals(fax, that.fax) &&
				Objects.equals(divRoomNo, that.divRoomNo) &&
				Objects.equals(exetype, that.exetype);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, orgNo, divCode, divNameCode, divName, ifSub, dutyTel, fax, divRoomNo, exetype);
	}
}
