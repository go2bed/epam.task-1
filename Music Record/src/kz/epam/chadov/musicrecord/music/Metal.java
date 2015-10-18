package kz.epam.chadov.musicrecord.music;

/**
 * @author Chadov Andrey 
 * 
 * Class extends common class Music Has extend redefined
 * constructor and Builder
 */
public final class Metal extends Music {

	/**
	 * Extending constructor from class Music with called parameters
	 * 
	 * @param artist
	 * @param genre is redefined           
	 * @param title
	 * @param duration 
	 */
	private Metal(String artist, String genre, String title, int duration) {
		super(artist, "Metal", title, duration);
	}

	public Metal() { // super(); from music
	}

	/**
	 * Builder return called parameters to constructor:
	 * 
	 * @param artist
	 * @param title
	 * @param duration
	 */
	public static Metal MetalBuilder(String artist, String title, int duration) {
		return new Metal(artist, "Metal", title, duration);
	}

	public Metal build() {
		return Metal.this;
	}

}
