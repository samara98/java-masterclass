package com.samara;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
	// properties
	private String name;
	private ArrayList<T> leagues = new ArrayList<T>();

	// constructors
	public League(String name) {
		this.name = name;
	}

	// getters
	public String getName() {
		return name;
	}

	// methods
	public boolean add(T team) {
		if (this.leagues.contains(team)) {
			return false;
		}
		this.leagues.add(team);
		return true;
	}

	public void showLeagueTable() {
		Collections.sort(leagues);
		for (T t : this.leagues) {
			System.out.println(t.getName() + ": " + t.ranking());
		}
	}
}
