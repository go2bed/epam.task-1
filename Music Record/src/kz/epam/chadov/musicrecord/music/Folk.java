package kz.epam.chadov.musicrecord.music;

/**
 * @author Chadov Andrey 
 * 
 * Class extends common class Music Has extend redefined
 * constructor and Builder
 */
public final class Folk extends Music {
	
	/**
	 * Extending constructor from class Music with called parameters
	 * 
	 * @param artist
	 * @param genre is redefined           
	 * @param title
	 * @param duration 
	 */
	private Folk(String artist, String genre, String title, int duration) {
		super(artist, "Folk", title, duration);
	}

	public Folk() { // super(); from music
	}

	/**
	 * Builder return called parameters to constructor:
	 * 
	 * @param artist
	 * @param title
	 * @param duration
	 */
	public static Folk FolkBuilder(String artist, String title, int duration) {
		return new Folk(artist, "Folk", title, duration);
	}

	public Folk build() {
		return Folk.this;
	}

}
