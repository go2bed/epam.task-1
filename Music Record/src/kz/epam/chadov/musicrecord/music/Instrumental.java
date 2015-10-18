package kz.epam.chadov.musicrecord.music;

/**
 * @author Chadov Andrey 
 * 
 * Class extends common class Music Has extend redefined
 * constructor and Builder
 */
public final class Instrumental extends Music {
	
	/**
	 * Extending constructor from class Music with called parameters
	 * 
	 * @param artist
	 * @param genre is redefined           
	 * @param title
	 * @param duration 
	 */
	private Instrumental(String artist, String genre, String title, int duration) {
		super(artist, "Instrumental", title, duration);
	}

	public Instrumental() { // super(); from music
	}

	/**
	 * Builder return called parameters to constructor:
	 * 
	 * @param artist
	 * @param title
	 * @param duration
	 */
	public static Instrumental InstrumentalBuilder(String artist, String title, int duration) {
		return new Instrumental(artist, "Instrumental", title, duration);
	}

	public Instrumental build() {
		return Instrumental.this;
	}

}
