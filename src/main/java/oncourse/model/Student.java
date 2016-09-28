package oncourse.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long student_id;

    private String user_id;
    
    @ElementCollection
    private List<DegreeProgram> majors;
    
    @ElementCollection
    private List<DegreeProgram> minor;
    
    @ElementCollection
    @ManyToMany(mappedBy="classes")
    private List<Class> req_classes;

    
    
    public Student()
    {
    }



	public Long getStudent_id() {
		return student_id;
	}



	public void setStudent_id(Long student_id) {
		this.student_id = student_id;
	}



	public String getUser_id() {
		return user_id;
	}



	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}



	public List<DegreeProgram> getMajors() {
		return majors;
	}



	public void setMajors(List<DegreeProgram> majors) {
		this.majors = majors;
	}



	public List<DegreeProgram> getMinor() {
		return minor;
	}



	public void setMinor(List<DegreeProgram> minor) {
		this.minor = minor;
	}



	public List<Class> getReq_classes() {
		return req_classes;
	}



	public void setReq_classes(List<Class> req_classes) {
		this.req_classes = req_classes;
	}






	
   

}
