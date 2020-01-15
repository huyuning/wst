package vo;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author hyn
 * @create 2019-12-26-14:00
 */
@Entity
@Table(name = "sequence", schema = "wst", catalog = "")
public class SequenceEntity {
	private String name;
	private int currentValue;
	private int increment;
	
	@Id
	@Column(name = "name")
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Basic
	@Column(name = "current_value")
	public int getCurrentValue() {
		return currentValue;
	}
	
	public void setCurrentValue(int currentValue) {
		this.currentValue = currentValue;
	}
	
	@Basic
	@Column(name = "increment")
	public int getIncrement() {
		return increment;
	}
	
	public void setIncrement(int increment) {
		this.increment = increment;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		SequenceEntity that = (SequenceEntity) o;
		return currentValue == that.currentValue &&
				increment == that.increment &&
				Objects.equals(name, that.name);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, currentValue, increment);
	}
}
