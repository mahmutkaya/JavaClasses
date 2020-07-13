package day_06;

public class CaseRunner {

	/*
	 * Create CaseRunner class actualCase=Covid 19 isTested=true conclusion=Tested
	 * Negative if conclusion contains "negative" print "You can go to work"
	 * otherwise print "15 days quarantine"
	 */
	public static void main(String[] args) {
		// I must use setter method to assign values
		Case caseObject = new Case();

		// Using the Case class object, we can assign the values using setter method
		caseObject.setActualCase("Covid 19");
		caseObject.setTested(true);
		caseObject.setConclusion("Tested Positive");

		System.out.println("Actual Case : " + caseObject.getActualCase());
		System.out.println("Tested : " + caseObject.isTested());
		System.out.println("Conclusion : " + caseObject.getConclusion());

		if (caseObject.getConclusion().toLowerCase().contains("negative")) {
			System.out.println("You can go to work");
		} else {
			System.out.println("15 days quarantine");
		}
		
		//Patient case..
		Patient patient = new Patient();
		patient.setFirstName("mahmut");
		patient.setLastName("kaya");
		patient.setCaseOptions(caseObject);
		
		System.out.println(patient.getFirstName()+" "+patient.getLastName());
		
		System.out.println(patient.getCaseOptions().getActualCase());
		System.out.println(patient.getCaseOptions().isTested());
		System.out.println(patient.getCaseOptions().getConclusion());
		

	}

}
