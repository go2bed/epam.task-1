package kz.epam.chadov.musicrecord.sort;

import java.util.Comparator;

import kz.epam.chadov.musicrecord.music.Music;

/**
 * @author Chadov Andrey
 *
 * Sorting songs in play list 
 * by parameter @title of each song 
 */
public final class SortByTitle implements Comparator<Music> {

	@Override
	public int compare(Music o1, Music o2) {
		String title1 = o1.getTitle();
		String title2 = o2.getTitle();
		return title1.compareToIgnoreCase(title2);
	}
}


