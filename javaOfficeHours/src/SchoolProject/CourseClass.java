package SchoolProject;

/*
 *  5) Course class
 		 there should be course id, season, name, cost variables
		there should be constructors to create course objects
		 there should be a method for printing course information
 */
public class CourseClass {
	private String season, courseName;
	private int id, cost;
	
	CourseClass(int id, String season, String courseName, int cost){
		this.id=id;
		this.cost=cost;
		this.courseName=courseName;
		this.season=season;
		
	}
	CourseClass(){
		
	}
	public String toString(CourseClass course) {
		return "Course Name: " + courseName +", " + "Course Id: " + id + ", " + "Course Season: " + season + ", " + "$"+cost;
	}

}
