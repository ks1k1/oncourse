package oncourse.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "degree_programs")
@Embeddable

public class DegreeProgram implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long program_id;

    private String program_name;

    @ElementCollection
    @ManyToMany
    private List<Class> classes;

    public DegreeProgram()
    {
    }

	public Long getProgram_id() {
		return program_id;
	}

	public void setProgram_id(Long program_id) {
		this.program_id = program_id;
	}

	public String getProgram_name() {
		return program_name;
	}

	public void setProgram_name(String program_name) {
		this.program_name = program_name;
	}

	public List<Class> getClasses() {
		return classes;
	}

	public void setClasses(List<Class> classes) {
		this.classes = classes;
	}

   
}
