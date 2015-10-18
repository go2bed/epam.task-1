package kz.epam.chadov.musicrecord.music;

/**
 * @author Chadov Andrey 
 * 
 * Class extends common class Music Has extend redefined
 * constructor and Builder
 */
public final class Rock extends Music {
	
	/**
	 * Extending constructor from class Music with called parameters
	 * 
	 * @param artist
	 * @param genre is redefined           
	 * @param title
	 * @param duration 
	 */
	private Rock(String artist, String genre, String title, int duration) {
		super(artist, "Rock", title, duration);
	}

	public Rock() { // super(); from music
	}

	/**
	 * Builder return called parameters to constructor:
	 * 
	 * @param artist
	 * @param title
	 * @param duration
	 */
	public static Rock RockBuilder(String artist, String title, int duration) {
		return new Rock(artist, "Rock", title, duration);
	}

	public Rock build() {
		return Rock.this;
	}

}
