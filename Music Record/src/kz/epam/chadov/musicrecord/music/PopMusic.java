package kz.epam.chadov.musicrecord.music;

/**
 * @author Chadov Andrey 
 * 
 * Class extends common class Music Has extend redefined
 * constructor and Builder
 */
public final class PopMusic extends Music {
	
	/**
	 * Extending constructor from class Music with called parameters
	 * 
	 * @param artist
	 * @param genre is redefined           
	 * @param title
	 * @param duration 
	 */
	private PopMusic(String artist, String genre, String title, int duration) {
		super(artist, "PopMusic", title, duration);
	}

	public PopMusic() { // super(); from music
	}

	/**
	 * Builder return called parameters to constructor:
	 * 
	 * @param artist
	 * @param title
	 * @param duration
	 */
	public static PopMusic PopMusicBuilder(String artist, String title, int duration) {
		return new PopMusic(artist, "PopMusic", title, duration);
	}

	public PopMusic build() {
		return PopMusic.this;
	}

}
