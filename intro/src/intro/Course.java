package intro;

public class Course {
	
	private int id;
	private String cName;
	private String cTeacher;
	private String detail;
	
	public Course(int id,String cName,String cTeacher,String detail) {
		this.setId(id);
		this.setcName(cName);
		this.setcTeacher(cTeacher);
		this.setDetail(detail);
	}

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getcName() {
		return cName;
	}

	void setcName(String cName) {
		this.cName = cName;
	}

	String getcTeacher() {
		return cTeacher;
	}

	void setcTeacher(String cTeacher) {
		this.cTeacher = cTeacher;
	}

	String getDetail() {
		return detail;
	}

	void setDetail(String detail) {
		this.detail = detail;
	}
}
