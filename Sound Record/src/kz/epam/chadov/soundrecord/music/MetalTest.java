package kz.epam.chadov.soundrecord.music;

public class MetalTest extends Music {

	MetalTest(String artist, String genre, String title, double time) {
		super(artist, "Metal", title, time);

	}

	public MetalTest() {
		// super(); from music
	}

	public static MetalBuilder newBuilder() {
	
	 // Creation an object Metal for creation and invocation of MetalBuilder
	 	
	return new MetalTest().new MetalBuilder();
}
	
	
	

	public class MetalBuilder { // We'r using builder for our constructor
								// with many of same type parameters
                          		// because if we have a lot of parameters,
	                         	//  we can confusing on one of them
		private MetalBuilder() {
			// private constructor
			// it's private, because we could have an acces to class
			// Metal and throw it we could create a Builder
			// and again change our fields of already created object - we don't
			// need this shit =)
		}

		public MetalBuilder setArtist(String artist) {
			MetalTest.super.setArtist(artist);
			return this;
		}

		public MetalBuilder setGenre(String genre) {
			MetalTest.super.setGenre(genre);
			return this;
		}

		public MetalBuilder setTitle(String title) {
			MetalTest.super.setTitle(title);
			return this;
		}

		public MetalBuilder setTime(double time) {
			MetalTest.super.setTime(time);
			return this;
		}

		public MetalTest build() {
			return MetalTest.this;
		}
	}

}
