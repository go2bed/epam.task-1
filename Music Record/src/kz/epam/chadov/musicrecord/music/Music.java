package kz.epam.chadov.musicrecord.music;

/**
 * 
 * @author Chadov Andrey 
 * 
 * Parent abstract class "Music" 
 * Contains 4 parameters for  all genre classes
 * 
 * @artist
 * @genre
 * @title
 * @duration
 */
public abstract class Music {
	private String artist;
	private String genre;
	private String title;
	private int duration;

	// Constructor for parameters of class Music
	Music(String artist, String genre, String title, int duration) {
		this.artist = artist;
		this.genre = genre;
		this.title = title;
		this.duration = duration;
	}

	public Music() {
		// super() for each extend class
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "\n\tMusic [artist = " + artist + ", " + " " + 
	                      "genre = " + genre + ", title = " + 
				           title + ", duration = "+ duration + 
				           " seconds ]";
	}

}
