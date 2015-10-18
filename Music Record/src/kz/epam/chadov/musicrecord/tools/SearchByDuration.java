package kz.epam.chadov.musicrecord.tools;

import java.util.ArrayList;
import java.util.List;

import kz.epam.chadov.musicrecord.music.Music;
import kz.epam.chadov.musicrecord.playlist.PlayList;

/**
 * @author Chadov Andrey
 *  
 * Class of searching songs from Play List
 * with called parameters
 */
public final class SearchByDuration {
    
	/**
	 * Searching a songs than get into range of two parameters of duration in seconds
	 *
	 * @param minDuration - minimal value of duration
	 * @param maxDuration - maximum values of duration
	 */
	public static void searchByDuration(PlayList playList, int minDuration, int maxDuration) {
        List<Music> duration = new ArrayList<>();
        duration.addAll(playList.getMusic());
        System.out.print("\nThis songs matches to range of duration " + 
                          minDuration + " seconds" + " and " + 
        		          maxDuration + " seconds : \n");
        for (Music dur : duration) {
            if (dur.getDuration() >= minDuration && dur.getDuration() <= maxDuration)
                System.out.print(dur.getGenre() +": " + dur.getArtist() + ": "  + dur.getTitle() + "; "+ "\n");
        }
     }
}
