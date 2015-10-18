package kz.epam.chadov.musicrecord.playlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import kz.epam.chadov.musicrecord.music.Music;
import kz.epam.chadov.musicrecord.sort.SortByArtist;
import kz.epam.chadov.musicrecord.sort.SortByDuration;
import kz.epam.chadov.musicrecord.sort.SortByGenre;
import kz.epam.chadov.musicrecord.sort.SortByTitle;
import kz.epam.chadov.musicrecord.tools.CalcPlayListDuration;

/**
 * @author Chadov Andrey
 * 
 * Contains lists for filling by collections of songs
 * Also has methods calling  a sorting
 */
public final class PlayList {

	private List<Music> playList = new ArrayList<Music>();

	public PlayList() {
		playList = new ArrayList<>();
	}

	public List<Music> getMusic() {
		return playList;
	}

	/**
	 * Adding collections of songs in play list
	 * 
	 * @param listOfSongs
	 */
	public void add(List<Music> listOfSongs) {
		for (Music songs : listOfSongs) {
			playList.add(songs);
		}
	}
	
	  /**
     * Calling  a sorting
     * 
     * @param comp - get a Comparator that collects in package "sort".
     */
    private void sort(Comparator<Music> comp) {
		Collections.sort(playList, comp);
	}	
    
    
    /**
     * Calculate one field of PlayList and calls method of sort.
     * For example - sort Music  by Artist in play list.
     */
    public static void sortMusic(PlayList obj, String sortBy) {
        switch (sortBy) {
            case "Artist":
                obj.sort(new SortByArtist());
                break;
            case "Title":
                obj.sort(new SortByTitle());
                break;
            case "Duration":
                obj.sort(new SortByDuration());
                break;
            case "Genre":
                obj.sort(new SortByGenre());
                break;    
            default:
                System.out.println("This is not method of sort");
                break;
        }
    }

    /**
     * Calling a method that calculate total duration
     * of play list
     * 
     * @param playList transmitted in class "CalcPlayListDuration"
     */
	public static void totalDuration(PlayList playList) {
		CalcPlayListDuration.calcPlayListDuration(playList);
	}
	
	@Override
	public String toString() {
		return "PlayList  playList= " + playList + "";
	}
}
