package SchoolProject;

import java.util.ArrayList;
import java.util.List;

public class CoursesClass {
	/*
	 * 6) Courses class 
	 * * there should be a list to store all courses 
	 * * there should be a method to add courses to courses list 
	 * * there should be a method to print all courses 
	 * * there should be a method to print numbers of courses
	 */
	
	List<CourseClass> coursesList = new ArrayList<>();
	
	public void addCourseToList(CourseClass course) {
		coursesList.add(course);
	}
	public void printCourses() {
		System.out.println("====course list from corses class");
		for(CourseClass w : coursesList) {
			System.out.println(w.toString(w));
		}
	}
	public int numbersOfCourses() {
		return coursesList.size();
	}

	public static void main(String[] args) {

	}

}
