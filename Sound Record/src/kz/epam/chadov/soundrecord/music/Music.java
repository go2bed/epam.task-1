package kz.epam.chadov.soundrecord.music;

public abstract class Music { // parent class for genres
	// parameter fields
	private String artist;
	private String genre;
	private String title;
	private double time;

	Music(String artist, String genre, String title, double time) { // constructor
																	// for Music
																	// variables
		this.artist = artist;
		this.genre = genre;
		this.title = title;
		this.time = time;
	}

	public Music() {
		// super() for each style of music
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

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

}
