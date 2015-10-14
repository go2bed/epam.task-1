package kz.epam.chadov.soundrecord.music;

public class Metal extends Music {

	Metal(String artist, String genre, String title, double time) {
		super(artist, "Metal", title, time);

	}

	public Metal() {
		// super(); from music
	}

	public static Metal MetalBuilder(String artist, String title, double time) {
		return new Metal(artist, "Metal", title, time);
	}

	public Metal build() {
		return Metal.this;
	}

}
