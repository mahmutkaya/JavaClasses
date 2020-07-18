package day_07;

public class Movie {
	/*
	 * 1. Create a class: Movie create variables and methods and create getter
	 * setter for private variables: 
	 * private String name; 
	 * int duration; 
	 * boolean isGood; 
	 * public void shortOrLong() { 
	 * //Print: name+" was short!" 
	 * if duration is less than 90 minutes 
	 * //Print: name+" was long!" otherwise
	 *  }
	 * public void movieInfo() { 
	 * print the movie name, duration and isGood 
	 * } 
	 * 
	 * 2.
	 * Create another class: MovieRunner and do the followings Create main method
	 * Create 3 Movie objects and assign values of your choice. Example: Move
	 * name=starWars duration=120 isGood=true And print the movie info
	 */
	
	private String name;
	int duration;
	boolean isGood;
	public void shortOrLong() {
		if(duration<90) {
			System.out.println(name + " was short");
		}else {
			System.out.println(name + " was long");
		}
	}

	public void movieInfo() {
		System.out.println("Movie Name: "+name
				+"\nMovie Duration: "+ duration
				+"\nMovie was good: "+isGood);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
