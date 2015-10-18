package kz.epam.chadov.musicrecord.base;

import java.util.ArrayList;
import java.util.List;

import kz.epam.chadov.musicrecord.music.Blues;
import kz.epam.chadov.musicrecord.music.Folk;
import kz.epam.chadov.musicrecord.music.HipHop;
import kz.epam.chadov.musicrecord.music.Instrumental;
import kz.epam.chadov.musicrecord.music.Metal;
import kz.epam.chadov.musicrecord.music.Music;
import kz.epam.chadov.musicrecord.music.PopMusic;
import kz.epam.chadov.musicrecord.music.Rock;

/**
 * @author Chadov Andrey
 * 
 * Adding songs to collection lists 
 * in called parameters
 */
public final class SongsBase {

	/**
	 * Add song as parameters(artist,title, duration) 
	 * of each song to MetalSong Collection.
	 * Each parameter of duration entered in seconds
	 */
	public static List<Music> newMetalSongsCollection() {
				
		List<Music> metalSongCollection = new ArrayList<>();
		{
			metalSongCollection.add(Metal.MetalBuilder
					               ("Our Last Night", "White Tiger", 205)
					               .build());
			metalSongCollection.add(Metal.MetalBuilder
					               ("Black Veil Brides", "In The End", 228)
					               .build());
			metalSongCollection.add(Metal.MetalBuilder
					               ("Metallica", "Enter Sandman", 330)
					               .build());
			metalSongCollection.add(Metal.MetalBuilder
					               ("Serj Tankian", "Butterfly", 250)
					               .build());
			metalSongCollection.add(Metal.MetalBuilder
					               ("Nightwish", "Ghost Love Score", 603)
					               .build());
		}
		return metalSongCollection;
	}
	
	
	/**
	 * Add song as parameters(artist,title, duration) 
	 * of each song to BluesSong Collection.
	 * Each parameter of duration entered in seconds
	 */
	public static List<Music> newBluesSongsCollection() {
				
		List<Music> bluesSongCollection = new ArrayList<>();
		{
			bluesSongCollection.add(Blues.BluesBuilder
					               ("Garry Moore", "Still got the blues", 407)
					               .build());
			bluesSongCollection.add(Blues.BluesBuilder
					               ("John Lee Hooker ", "Boom Boom", 148)
					               .build());
			bluesSongCollection.add(Blues.BluesBuilder
					               ("Muddy Waters", "Mannish Boy", 175)
					               .build());
			bluesSongCollection.add(Blues.BluesBuilder
					               ("Howlin' Wolf", "Smokestack Lightnin'", 188)
					               .build());
			bluesSongCollection.add(Blues.BluesBuilder
					               ("Screamin' Jay Hawkins", "I Put a Spell On You", 155)
					               .build());
		}
		return bluesSongCollection;
	}
	
	
	/**
	 * Add song as parameters(artist,title, duration) 
	 * of each song to FolkSong Collection.
	 * Each parameter of duration entered in seconds
	 */
	public static List<Music> newFolkSongsCollection() {
				
		List<Music> folkSongCollection = new ArrayList<>();
		{
			folkSongCollection.add(Folk.FolkBuilder
					               ("Dustin Tebbutt", "The Breach", 255)
					               .build());
			folkSongCollection.add(Folk.FolkBuilder
					               ("Joan Baez", "House of the rising Sun", 168)
					               .build());
			folkSongCollection.add(Folk.FolkBuilder
					               ("Pete Seeger", "If I had A Hammer", 108)
					               .build());
			folkSongCollection.add(Folk.FolkBuilder
					               ("Tom Dooley", "Kingston trio", 208)
					               .build());
			folkSongCollection.add(Folk.FolkBuilder
					               ("Woody Guthrie", "Jesus Christ", 155)
					               .build());
		}
		return folkSongCollection;
	}
	
	
	/**
	 * Add song as parameters(artist,title, duration) 
	 * of each song to MetalSong Collection.
	 * Each parameter of duration entered in seconds
	 */
	public static List<Music> newHipHopSongsCollection() {
				
		List<Music> hipHopSongCollection = new ArrayList<>();
		{
			hipHopSongCollection.add(HipHop.HipHopBuilder
					               ("Eminem", "Not Afraid", 258)
					               .build());
			hipHopSongCollection.add(HipHop.HipHopBuilder
					               ("2Pac", "Ghetto Gospel", 235)
					               .build());
			hipHopSongCollection.add(HipHop.HipHopBuilder
					               ("Dr. Dre", "Still D.R.E.", 270)
					               .build());
			hipHopSongCollection.add(HipHop.HipHopBuilder
					               ("50 Cent", "In Da Club", 250)
					               .build());
			hipHopSongCollection.add(HipHop.HipHopBuilder
					               ("Akon", "Smack That", 253)
					               .build());
		}
		return hipHopSongCollection;
	}
	
		
	/**
	 * Add song as parameters(artist,title, duration) 
	 * of each song to Instrumental Collection.
	 * Each parameter of duration entered in seconds
	 */
	public static List<Music> newInstrumentalSongsCollection() {
				
		List<Music> instrumentalSongCollection = new ArrayList<>();
		{
			instrumentalSongCollection.add(Instrumental.InstrumentalBuilder
					               ("Ludovico Einaudi", "Una Mattina", 400)
					               .build());
			instrumentalSongCollection.add(Instrumental.InstrumentalBuilder
					               ("Yiruma", "River Flows in You", 240)
					               .build());
			instrumentalSongCollection.add(Instrumental.InstrumentalBuilder
					               ("Beethoven", "Moonlight Sonata", 900)
					               .build());
			instrumentalSongCollection.add(Instrumental.InstrumentalBuilder
					               ("Hans Zimmer", "Time", 274)
					               .build());
			instrumentalSongCollection.add(Instrumental.InstrumentalBuilder
					               ("James Horner", "The Gift of Mortality", 381)
					               .build());
		}
		return instrumentalSongCollection;
	}
	
		
	/**
	 * Add song as parameters(artist,title, duration) 
	 * of each song to PopMusicSong Collection.
	 * Each parameter of duration entered in seconds
	 */
	public static List<Music> newPopMusicSongsCollection() {
				
		List<Music> popMusicSongCollection = new ArrayList<>();
		{
			popMusicSongCollection.add(PopMusic.PopMusicBuilder
					               ("Michael Jackson", "Earth Song", 402)
					               .build());
			popMusicSongCollection.add(PopMusic.PopMusicBuilder
					               ("Robbie Williams", "Mr Bojangles", 220)
					               .build());
			popMusicSongCollection.add(PopMusic.PopMusicBuilder
					               ("Sting", "Fields of gold", 220)
					               .build());
			popMusicSongCollection.add(PopMusic.PopMusicBuilder
					               ("James Blunt", "You're beautiful", 205)
					               .build());
			popMusicSongCollection.add(PopMusic.PopMusicBuilder
					               ("Third Eye Blind", "Jumper", 270)
					               .build());
		}
		return popMusicSongCollection;
	}
	
		
	/**
	 * Add song as parameters(artist,title, duration) 
	 * of each song to RockSong Collection.
	 * Each parameter of duration entered in seconds
	 */
	public static List<Music> newRockSongsCollection() {
				
		List<Music> rockSongCollection = new ArrayList<>();
		{
			rockSongCollection.add(Rock.RockBuilder
					               ("Green Day", "Boulevard Of Broken Dreams", 290)
					               .build());
			rockSongCollection.add(Rock.RockBuilder
					               ("Red Hot Chili Peppers", "Otherside", 257)
					               .build());
			rockSongCollection.add(Rock.RockBuilder
					               ("30 Seconds to Mars", "From Yesterday", 248)
					               .build());
			rockSongCollection.add(Rock.RockBuilder
					               ("Queen", "We Are The Champions", 218)
					               .build());
			rockSongCollection.add(Rock.RockBuilder
					               ("Scorpions", "Send Me An Angel", 270)
					               .build());
		}
		return rockSongCollection;
	}

}
