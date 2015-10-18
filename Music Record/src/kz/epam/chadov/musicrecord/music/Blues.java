package kz.epam.chadov.musicrecord.music;

/**
 * @author Chadov Andrey 
 * 
 * Class extends common class Music Has extend redefined
 * constructor and Builder
 */
public final class Blues extends Music{
	
	/**
	 * Extending constructor from class Music with called parameters
	 * 
	 * @param artist
	 * @param genre is redefined           
	 * @param title
	 * @param duration 
	 */
	private Blues(String artist, String genre, String title, int duration) {
		super(artist, "Blues", title, duration);
	}

	public Blues() { // super(); from music
	}

	/**
	 * Builder return called parameters to constructor:
	 * 
	 * @param artist
	 * @param title
	 * @param duration
	 */
	public static Blues BluesBuilder(String artist, String title, int duration) {
		return new Blues(artist, "Blues", title, duration);
	}

	public Blues build() {
		return Blues.this;
	}

}
