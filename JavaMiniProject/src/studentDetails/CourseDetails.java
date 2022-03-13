package studentDetails;

import java.util.Scanner;
class Course
{
	 String course[] = {"Java","Web Designing","Selenium","Python","PHP"};
	 int courseid[] = {1,2,3,4,5};
	 int days[]  = {90, 30, 20, 60, 45};
	 int fees[] = {30000, 15000, 10000, 25000, 20000};
	 void displayCourseList()
	 {
		 	System.out.println("Courses Offered:");
			for(String c : course)
			{
				System.out.println(c);
			}
	 }
}
class Student
{
	String studentName;
	String courseName;
	String date;
	Course courseObj;
	Student(String studentName, String courseName, String date, Course courseObj)
	{
		this.studentName = studentName;
		this.courseName = courseName;
		this.date = date;
		this.courseObj = courseObj;
	}
 	void displayStudentDetails()
	{
		System.out.println("Details:");
		System.out.println("Student Name:"+studentName);
		System.out.println("Course Enquired:"+courseName);
		for(int i=0;i<courseObj.course.length;i++)
		{
			if (courseName.equals(courseObj.course[i]))
			{
				System.out.println("Training Days:"+courseObj.days[i]);
				System.out.println("Fees:"+courseObj.fees[i]);
			}
		}
		System.out.println("Joining date:"+date);
	}
}
public class CourseDetails {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Course courseDet = new Course();
		courseDet.displayCourseList();
		System.out.println("Enter your name:");
		String studName = s.next();
		System.out.println("Enter the course you need:");
		String course = s.next();
		System.out.println("Enter the joining date:");
		String joiningDate = s.next();
		Student stud = new Student(studName,course,joiningDate,courseDet);
		stud.displayStudentDetails();
	}
}