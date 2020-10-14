package com.samara;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
	// properties
	private String name;
	private String artist;
	private SongList songs;

	// constructors
	public Album(String name, String artist) {
		this.name = name;
		this.artist = artist;
		this.songs = new SongList();
	}

	// methods
	public boolean addSong(String title, double duration) {
		return this.songs.add(new Song(title, duration));
	}

	public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
		Song checkedSong = this.songs.findSong(trackNumber);
		if (checkedSong != null) {
			playList.add(checkedSong);
			return true;
		}
		System.out.println("This album does not have a track " + trackNumber);
		return false;
	}

	public boolean addToPlayList(String title, LinkedList<Song> playList) {
		Song checkedSong = this.songs.findSong(title);
		if (checkedSong != null) {
			playList.add(checkedSong);
			return true;
		}
		System.out.println("The song " + title + " is not in this album");
		return false;
	}

	// inner classes
	private class SongList {
		// properties
		private ArrayList<Song> songs;

		// constructors
		public SongList() {
			this.songs = new ArrayList<Song>();
		}

		// methods
		public boolean add(Song song) {
			if (this.songs.contains(song)) {
				return false;
			}
			this.songs.add(song);
			return true;
		}

		private Song findSong(String title) {
			for (Song checkedSong : this.songs) {
				if (checkedSong.getTitle().equals(title)) {
					return checkedSong;
				}
			}
			return null;
		}

		private Song findSong(int trackNumber) {
			int index = trackNumber - 1;
			if ((index > 0) && (index < songs.size())) {
				return this.songs.get(index);
			}
			return null;
		}
	}
}
