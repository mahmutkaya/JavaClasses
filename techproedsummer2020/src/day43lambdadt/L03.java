package day43lambdadt;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class L03 {

	public static void main(String[] args) {

		// create 4 objects by using Course class
		Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
		Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
		Course courseEnglishDay = new Course("Sprint", "English Day", 95, 132);
		Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);

		// Add them into a list
		// 1st way:
//		List<Course> list = new ArrayList<>();
//		list.add(courseTurkishDay);
//		list.add(courseTurkishNight);
//		list.add(courseEnglishDay);
//		list.add(courseEnglishNight);

		// 2nd way:
		List<Course> list = Arrays.asList(courseTurkishDay, courseTurkishNight, courseEnglishDay, courseEnglishNight);

		System.out.println(list);

		// check if all average scores are less than 98
		boolean bo = list.stream()
			.allMatch(t-> t.getAverageScore()<98);
		System.out.println(bo);
		
		//check if all course names contain "Day" word.
		boolean bo2 = list.stream()
			.anyMatch(p -> p.getCourseName().contains("Day"));
		System.out.println(bo2);
		
		//check if any number of students is 154
		boolean bo3 = list.stream()
				.anyMatch(p -> p.getNumberOfStudents()==154);
		System.out.println(bo3);
		
		//check if any season is "Winter"
		boolean bo4 = list.stream()
				.anyMatch(p -> p.getSeason().equals("Winter"));
		System.out.println(bo4);
		
		//check if no number of students is 100
		boolean bo5 = list.stream()
				.noneMatch(p -> p.getNumberOfStudents()==100);
		System.out.println(bo5);
		
		//sort the elements in natural order according to the average score
		list.stream()
			.sorted(Comparator.comparing(t->t.getAverageScore()))
			.forEach(t->System.out.println(t+" "));
		
		System.out.println("------------------------------");
		//sort the elements in reverse order according to the number of students
		list.stream()
			.sorted(Comparator.comparing(Course::getNumberOfStudents).reversed())
			.forEach(t->System.out.println(t+" "));
		
		System.out.println("------------------------------");
		//sort the elements in reverse order according to the course names
		list.stream()
			.sorted(Comparator.comparing(Course::getCourseName).reversed())
			.forEach(System.out::println);
					

	}

}
