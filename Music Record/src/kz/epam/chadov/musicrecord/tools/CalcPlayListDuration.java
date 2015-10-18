package kz.epam.chadov.musicrecord.tools;

import java.util.ArrayList;
import java.util.List;

import kz.epam.chadov.musicrecord.music.Music;
import kz.epam.chadov.musicrecord.playlist.PlayList;

/** 
 * 
 * @author Chadov Andrey
 * 
 * Counting total play list duration
 * and print result of calculation
 * 
 */
public final class CalcPlayListDuration {
	
	public static void calcPlayListDuration(PlayList playList) {
	        List<Music> duration = new ArrayList<>();
	        duration.addAll(playList.getMusic());
	        int totalDuration = 0;
	        for (Music dur : duration) {
	            totalDuration +=  dur.getDuration() ;
	        }
	        System.out.println("\nPlaylist total duration is   " 
	        		           + (totalDuration/3600)%360 + " : " 
	        		           + (totalDuration/60)%60 +  " : " 
	                           + (totalDuration/60) + " " +
	        		           "hh:mm:ss");
	    }
}
