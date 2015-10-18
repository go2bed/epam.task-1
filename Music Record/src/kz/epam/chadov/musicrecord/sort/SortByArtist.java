package kz.epam.chadov.musicrecord.sort;

import java.util.Comparator;
import kz.epam.chadov.musicrecord.music.Music;

/**
 * @author Chadov Andrey
 *
 * Sorting songs in play list 
 * by parameter @artist of each song 
 */
public final class SortByArtist implements Comparator<Music> {

	@Override
	public int compare(Music o1, Music o2) {
		String artist1 = o1.getArtist();
		String artist2 = o2.getArtist();
		return artist1.compareToIgnoreCase(artist2);
	}
}
