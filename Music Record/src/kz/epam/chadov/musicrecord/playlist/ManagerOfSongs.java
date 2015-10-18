package kz.epam.chadov.musicrecord.playlist;

import kz.epam.chadov.musicrecord.base.SongsBase;
import kz.epam.chadov.musicrecord.tools.SearchByDuration;

/**
 * @author Chadov Andrey
 * 
 * Managing and composition of play list
 * Calling sort of songs and search 
 */
public final class ManagerOfSongs {
	
    /**
    * Composition of play list
    * with calling objects of collections
    * from base
    */
	public static PlayList makePLayList() {
		PlayList playList = new PlayList();
		playList.add(SongsBase.newMetalSongsCollection());
		playList.add(SongsBase.newBluesSongsCollection());
		playList.add(SongsBase.newFolkSongsCollection());
		playList.add(SongsBase.newHipHopSongsCollection());
		playList.add(SongsBase.newInstrumentalSongsCollection());
		playList.add(SongsBase.newPopMusicSongsCollection());
		playList.add(SongsBase.newRockSongsCollection());
		
		return playList;
	}

    /**
    * Calling sort songs in play list
    * by called parameters:
    * 	
    * @param playList
    * @param sortBy
    */
	public static void sortMusic(PlayList playList, String sortBy) {
		PlayList.sortMusic(playList, sortBy);
		System.out.println(playList);
	}

    /**
    * Calling search of songs in play list
    * by parameters transmitted to class SearchByDuration
    */
	public static void searchByDuration() {
		SearchByDuration.searchByDuration(makePLayList(), 200, 300);
	}

}
