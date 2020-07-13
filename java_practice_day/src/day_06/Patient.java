package day_06;

public class Patient {
	/*
	 * Create a class: Patient Create 3 instance variables String firstName; String
	 * lastName; Case caseOptions; using encapsulation And create getters and
	 * setters Go to CaseRunner class Set your first and last name And print your
	 * current case using the Case class objects
	 *
	 */
	
	private String firstName, lastName;
	private Case caseOptions;
	

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * @return the caseOptions
	 */
	public Case getCaseOptions() {
		return caseOptions;
	}


	/**
	 * @param caseOptions the caseOptions to set
	 */
	public void setCaseOptions(Case caseOptions) {
		this.caseOptions = caseOptions;
	}

}
