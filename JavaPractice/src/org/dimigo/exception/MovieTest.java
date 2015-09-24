package org.dimigo.exception;

public class MovieTest {
	
	public static void main(String[] args) {
		Movie[] movies = {
			new Movie("베테랑", 15),
			new Movie("사도", 12),
			new Movie("앤트맨", 12)
		};
		int age = 13;
		for(Movie movie : movies) {
			try {
				buyTicket(movie, age);
			} catch(Exception e) {
				e.getMessage();
			}
		} 
	} 
	
	private static void buyTicket(Movie movie, int age) throws AgeCheckException {
		if (age < movie.getLimitAge()) {
			throw new AgeCheckException(movie);
		} else {
			System.out.println(movie.getTitle() + " 영화 즐감하세용~~");
		}
	}

}
