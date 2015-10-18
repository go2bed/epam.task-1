package kz.epam.chadov.musicrecord.sort;

import java.util.Comparator;

import kz.epam.chadov.musicrecord.music.Music;

/**
 * @author Chadov Andrey
 *
 * Sorting songs in play list 
 * by parameter @duration of each song
 */
public final class SortByDuration implements Comparator<Music> {

	@Override
	public int compare(Music o1, Music o2) {
		int duration1 = o1.getDuration();
		int duration2 = o2.getDuration();
		if (duration1 < duration2)
			return -1;
		else if (duration1 > duration2)
			return 1;
		else
			return 0;
	}

}
