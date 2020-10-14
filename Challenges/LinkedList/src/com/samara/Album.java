package com.samara;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
	// properties
	private String name;
	private String artist;
	private ArrayList<Song> songs;

	// constructors
	public Album(String name, String artist) {
		this.name = name;
		this.artist = artist;
		this.songs = new ArrayList<Song>();
	}

	// methods
	public boolean addSong(String title, double duration) {
		if (this.findSong(title) == null) {
			this.songs.add(new Song(title, duration));
			return true;
		}
		return false;
	}

	public Song findSong(String title) {
		for (Song checkedSong : this.songs) {
			if (checkedSong.getTitle().equals(title)) {
				return checkedSong;
			}
		}
		return null;
	}

	public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
		int index = trackNumber - 1;
		if ((index >= 0) && (index <= this.songs.size())) {
			playlist.add(this.songs.get(index));
			return false;
		}
		System.out.println("This album does not have a track " + trackNumber);
		return false;
	}

	public boolean addToPlayList(String title, LinkedList<Song> playList) {
		Song checkedSong = this.findSong(title);
		if (checkedSong != null) {
			playList.add(checkedSong);
			return true;
		}
		System.out.println("The song " + title + " is not in this album");
		return false;
	}
}
