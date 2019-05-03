package lab03;

public class RosterManager {

	private int numCourses;
	private Course[] courses;
	private ClassRosterUI ui;
	private String courseCode;
	private String courseName;
	private String studentCourseCode;
	private int perm;
	private String first;
	private String last;
	private boolean keepGoing = true;
	
	public RosterManager() {
		numCourses = 0;
		courses = new Course[10];
		ui = new ClassRosterUI();
	}
	
	public void run() {
		System.out.println("Welcome to Class Roster Manager!");
		System.out.println("Select an action based on the following menu: ");
		
		do {
		
			ClassRosterUI.printMenu();
			
			String command = ClassRosterUI.getCommand();
			
			if (command.equals("ac")){
				courseCode = ClassRosterUI.getCourseCode();
				courseName = ClassRosterUI.getCourseName();
				
				addCourse(new Course(courseCode,courseName));
				
			}else if (command.equals("dc")) {
				courseCode = ClassRosterUI.getCourseCode();
				
				deleteCourse(courseCode);
				
			}else if (command.equals("as")) {
				
				studentCourseCode = ClassRosterUI.getStudentCourseCode();
				perm = ClassRosterUI.getPerm();		
				
				first = ClassRosterUI.getFirst();
				last = ClassRosterUI.getLast();
				
				addStudent(studentCourseCode, new Student(perm,first,last));
				
			}else if (command.equals("ds")) {
				studentCourseCode = ClassRosterUI.getStudentCourseCode();
				perm = ClassRosterUI.getPerm();
				
				deleteStudent(perm,studentCourseCode);
				
			}else if (command.equals("p")) {
				
				printRoster();
				
			}else if (command.equals("q")) {
				//do nothing quit
				keepGoing = false;	
				ui.closeScanner();
				
			}else {
				
				System.out.println("Error. Please enter an option from the menu.");
				
			}
		}while(keepGoing);
		
	
	}
	
	public void addCourse(Course c) /*throws DuplicateCourseException, CourseLimitException*/ {
		courses[numCourses].assign(c);
		
		numCourses++;
	}
	
	public void deleteCourse(String courseCode) /*throws CourseNotFoundException, EmptyCourseListException*/ {
		
		for (int i = 0; i < numCourses; i++) {
			if (courses[i].getCourseCode().equals(courseCode)) {
				courses[i].assign(courses[numCourses]);
			}
		}
		
		numCourses--;
	}
	
	public void addStudent(String courseCode, Student s) /*throws StudentLimitException, DuplicateStudentException, CourseNotFoundException*/ {
		for (int i = 0; i < numCourses ; i++) {
			if (courses[i].getCourseCode().equals(courseCode)) {
				courses[i].addStudent(s);
			}
		}
	}
	
	public void deleteStudent(int id, String courseCode) /*throws EmptyStudentListException, StudentNotFoundException, CourseNotFoundException */{
		
		
	}
	
	public void printRoster() {
		System.out.println("********************");
		
		for (int i = 0; i < numCourses; i++) {
			System.out.println(courses[i].getCourseCode() + ": " + courses[i].getCourseName());
			System.out.println("Enrolled: " + courses[i].getEnroll());
			courses[i].printCourseRoster();
		}
		
		System.out.println("********************");
	}
}
