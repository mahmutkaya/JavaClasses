package day_07;

public class MovieRunner extends Movie{

	public static void main(String[] args) {
		MovieRunner movie = new MovieRunner();
		
		movie.setName("star wars");
		movie.duration = 120;
		movie.isGood = true;
		
		movie.movieInfo();
		movie.shortOrLong();
	}

}
