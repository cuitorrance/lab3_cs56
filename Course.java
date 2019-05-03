package lab03;

public class Course {
	
	private String code = "";
	private String name = "";
	private int currEnroll = 0;
	private int maxEnroll = 50;
	
	private Student[] studentsEnrolled;
	
	public Course() {
		studentsEnrolled = new Student [50];
	}
	
	public Course(String code, String name) {
		studentsEnrolled = new Student [50];
		this.code = code;
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getCourseName() {
		return name;
	}
	
	public String getCourseCode() {
		return code;
	}
	
	public int getEnroll() {
		return currEnroll;
	}
	
	public void addStudent(Student s) /*throws StudentLimitException, DuplicateStudentException*/ {
		studentsEnrolled[currEnroll].assign(s);
		currEnroll++;
	}
	
	public void removeStudent(int studentId) /* throws EmptyStudentListException, StudentNotFoundException*/ {
		for (int i = 0; i < currEnroll;i++) {
			if (studentsEnrolled[i].getPerm() == studentId) {
				studentsEnrolled[i].assign(studentsEnrolled[currEnroll]);
			}
		}
		currEnroll--;
	}
	public void printCourseRoster() {
		for (int i = 0; i < currEnroll; i++) {
			System.out.println("	" + studentsEnrolled[i].getPerm() + " | " + studentsEnrolled[i].getLastName() + ", " + studentsEnrolled[i].getFirstName());
		}
	}
	
	//assignment operator
	public void assign(Course c) {
		this.code = c.getCourseCode();
		this.name = c.getCourseName();
		this.currEnroll = c.getEnroll();
	}
	
}
