package kz.epam.chadov.musicrecord.sort;

import java.util.Comparator;
import kz.epam.chadov.musicrecord.music.Music;

/**
 * @author Chadov Andrey
 *
 * Sorting songs in play list 
 * by parameter @artist of each song 
 */
public final class SortByGenre implements Comparator<Music> {

	@Override
	public int compare(Music o1, Music o2) {
		String genre1 = o1.getGenre();
		String genre2 = o2.getGenre();
		return genre1.compareToIgnoreCase(genre2);
	}
}


