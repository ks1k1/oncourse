package oncourse.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "classes")
public class Class implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long class_id;

    private String class_name;

    private int units;

    public Class()
    {
    }

	public Long getClass_id() {
		return class_id;
	}

	public void setClass_id(Long class_id) {
		this.class_id = class_id;
	}

	public String getClass_name() {
		return class_name;
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}
    
    

   
}
