package vo;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author hyn
 * @create 2019-12-26-14:00
 */
@Entity
@Table(name = "cnarea", schema = "wst", catalog = "")
public class CnareaEntity {
	private Object id;
	private byte level;
	private long parentCode;
	private long areaCode;
	private String cityCode;
	private String name;
	private String shortName;
	private String mergerName;
	private String icode;
	
	@Id
	@Column(name = "id")
	public Object getId() {
		return id;
	}
	
	public void setId(Object id) {
		this.id = id;
	}
	
	@Basic
	@Column(name = "level")
	public byte getLevel() {
		return level;
	}
	
	public void setLevel(byte level) {
		this.level = level;
	}
	
	@Basic
	@Column(name = "parent_code")
	public long getParentCode() {
		return parentCode;
	}
	
	public void setParentCode(long parentCode) {
		this.parentCode = parentCode;
	}
	
	@Basic
	@Column(name = "area_code")
	public long getAreaCode() {
		return areaCode;
	}
	
	public void setAreaCode(long areaCode) {
		this.areaCode = areaCode;
	}
	
	@Basic
	@Column(name = "city_code")
	public String getCityCode() {
		return cityCode;
	}
	
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	
	@Basic
	@Column(name = "name")
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Basic
	@Column(name = "short_name")
	public String getShortName() {
		return shortName;
	}
	
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	
	@Basic
	@Column(name = "merger_name")
	public String getMergerName() {
		return mergerName;
	}
	
	public void setMergerName(String mergerName) {
		this.mergerName = mergerName;
	}
	
	@Basic
	@Column(name = "icode")
	public String getIcode() {
		return icode;
	}
	
	public void setIcode(String icode) {
		this.icode = icode;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CnareaEntity that = (CnareaEntity) o;
		return level == that.level &&
				parentCode == that.parentCode &&
				areaCode == that.areaCode &&
				Objects.equals(id, that.id) &&
				Objects.equals(cityCode, that.cityCode) &&
				Objects.equals(name, that.name) &&
				Objects.equals(shortName, that.shortName) &&
				Objects.equals(mergerName, that.mergerName) &&
				Objects.equals(icode, that.icode);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, level, parentCode, areaCode, cityCode, name, shortName, mergerName, icode);
	}
}
