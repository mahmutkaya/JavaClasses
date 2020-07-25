package day_08;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
	/* 1. Create a Map :
     * Map<String,Integer> salaryMap=new HashMap<> ();
     * 2. add the job title and salary pairs:
     * "doctor", 500000
     * "nurse", 70000
     * "developer", 110000
     * "president", 200000
     * "tester", 100000
     * "lawyer", 150000
     * "teacher", 50000
     * 3. print the value of a doctor's salary only
     * 4. replace the nurce's salary with 75000
     * 5. replace the developer's salary with 120000 using put method
     * 6. remove lawyer from the list
     * 7. print true if there is a key called "judge". print false otherwise
     * 8. print true if there is a value called 10000. print false otherwise
     * 
     */

	public static void main(String[] args) {
		
		Map<String, Integer> salary = new HashMap<>();
		salary.put("doctor", 500000);
		salary.put("nurse", 70000);
		salary.put("developer", 110000);
		salary.put("president", 200000);
		salary.put("tester", 100000);
		salary.put("lawyer", 150000);
		salary.put("teacher", 50000);
		
		System.out.println(salary.get("doctor"));
		
		salary.replace("nurse", 75000);
		System.out.println(salary);
		
		salary.put("developer", 120000);
		System.out.println(salary);
		
		salary.remove("lawyer");
		System.out.println(salary);
		
		System.out.println(salary.containsKey("judge"));
		
		System.out.println(salary.containsValue(10000));
		

	}

}
