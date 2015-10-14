package kz.epam.chadov.soundrecord.songs;

import java.util.ArrayList;
import java.util.List;
import kz.epam.chadov.soundrecord.music.Metal;
import kz.epam.chadov.soundrecord.music.Music;

public class SongsBase {
	
	public static void main(String[] args) {
	
		
		 
	}

	public static List<Music> newMetalSongsCollection() {
		List<Music> song_collection1 = new ArrayList<>();
		{
			song_collection1.add(Metal.MetalBuilder("Our Last Night", "White Tiger", 3.25).build());
			/*song_collection1.add(Metal.MetalBuilder("Black Veil Brides", "In The End", 3.48).build());
			song_collection1.add(Metal.MetalBuilder("Metallica", "Enter Sandman", 5.30).build());
			song_collection1.add(Metal.MetalBuilder("Serj Tankian", "Butterfly", 4.10).build());
			song_collection1.add(Metal.MetalBuilder("Nightwish", "Ghost Love Score", 10.03).build());*/
		}
		
		
		return song_collection1;
	}
	

}

