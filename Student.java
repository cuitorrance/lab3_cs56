package lab03;

public class Student {
	
	private int perm = 0;
	private String first = "";
	private String last = "";
	
	public Student() {
		
	}
	
	public Student ( int n, String f, String l) {
		perm = n;
		first = f;
		last = l;
	}
	
	public int getPerm() {
		return perm;
	}
	
	public String getFirstName() {
		return first;
	}
	
	public String getLastName() {
		return last;
	}

	public void assign(Student student) {
		perm = student.getPerm();
		first = student.getFirstName();
		last = student.getLastName();	
	}
}
