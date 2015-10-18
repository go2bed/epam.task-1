package kz.epam.chadov.musicrecord.music;

/**
 * @author Chadov Andrey 
 * 
 * Class extends common class Music Has extend redefined
 * constructor and Builder
 */
public final class HipHop extends Music {
	
	/**
	 * Extending constructor from class Music with called parameters
	 * 
	 * @param artist
	 * @param genre is redefined           
	 * @param title
	 * @param duration 
	 */
	private HipHop(String artist, String genre, String title, int duration) {
		super(artist, "HipHop", title, duration);
	}

	public HipHop() { // super(); from music
	}

	/**
	 * Builder return called parameters to constructor:
	 * 
	 * @param artist
	 * @param title
	 * @param duration
	 */
	public static HipHop HipHopBuilder(String artist, String title, int duration) {
		return new HipHop(artist, "HipHop", title, duration);
	}

	public HipHop build() {
		return HipHop.this;
	}

}
