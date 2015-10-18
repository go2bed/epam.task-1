package kz.epam.chadov.musicrecord.main;

import kz.epam.chadov.musicrecord.playlist.ManagerOfSongs;
import kz.epam.chadov.musicrecord.playlist.PlayList;;

/**
 * Created by Andrey Chadov task 1 for Epam Systems lab#17
 * 
 * Task: Music Record
 * @author Chadov Andrey
 *
 */
public final class Main {

	/**
     * Application starting point.
     *
     * @param args input arguments array
     */
	public static void main(String[] args) {
		PlayList playList = ManagerOfSongs.makePLayList();
		ManagerOfSongs.sortMusic(playList, "Genre");
		PlayList.totalDuration(playList);
		ManagerOfSongs.searchByDuration();
	}

}
