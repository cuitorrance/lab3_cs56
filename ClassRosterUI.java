package lab03;
import java.util.Scanner;

public class ClassRosterUI {
	
	private static String command;
	private static String courseCode;
	private static String sCourseCode;
	private static String courseName;
	private static int perm;
	private static String first;
	private static String last;
	private static Scanner reader;
	
	public ClassRosterUI() {
		reader = new Scanner(System.in);
	}
	public static void printMenu() {
		System.out.println("----------");
		System.out.println("ac: Add Course");
		System.out.println("dc: Drop Course");
		System.out.println("as: Add Student");
		System.out.println("ds: Drop Student");
		System.out.println(" p: Print ClassRoster");
		System.out.println(" q: Quit Program");
		
	}
	public static String getCommand() {
		System.out.println("----------");
		System.out.print("Enter Command: ");
		command = reader.nextLine();
		return command;
	}
	public static String getCourseCode() {
		System.out.print("Enter Course Code: ");
		courseCode = reader.nextLine();
		return courseCode;
	}
	public static String getCourseName() {
		System.out.print("Enter Course Name: ");
		courseName = reader.nextLine();
		return courseName;
	}
	
	public static String getStudentCourseCode() {
		System.out.print("Enter course code for Student: ");
		sCourseCode = reader.nextLine();
		return sCourseCode;
	}
	public static int getPerm() {
		System.out.print("Enter PERM: ");
		perm = reader.nextInt();
		return perm;
	}
	public static String getFirst() {
		System.out.print("Enter first name: ");
		first = reader.nextLine();
		return first;
	}
	public static String getLast() {
		System.out.print("Enter last name: ");
		last = reader.nextLine();
		return last;
	}
	public void closeScanner() {
		reader.close();
	}
}
