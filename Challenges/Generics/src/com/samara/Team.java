package com.samara;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
	// properties
	private String name;
	int played = 0;
	int won = 0;
	int lost = 0;
	int tied = 0;

	private ArrayList<T> members = new ArrayList<>();

	// constructors
	public Team(String name) {
		this.name = name;
	}

	// getters
	public String getName() {
		return name;
	}

	// overriding
	@Override
	public int compareTo(Team<T> team) {
		if (this.ranking() > team.ranking()) {
			return -1;
		} else if (this.ranking() < team.ranking()) {
			return 1;
		}
		return 0;
	}

	// methods
	public boolean addPlayer(T player) {
		if (this.members.contains(player)) {
			System.out.println(player.getName() + " is already on this team");
			return false;
		}
		this.members.add(player);
		System.out.println(player.getName() + " picked for team " + this.name);
		return true;
	}

	public int numPlayers() {
		return this.members.size();
	}

	public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
		String message;
		if (ourScore > theirScore) {
			this.won++;
			message = " beat ";
		} else if (ourScore == theirScore) {
			this.tied++;
			message = " drew with ";
		} else {
			this.lost++;
			message = " lose to ";
		}
		this.played++;
		if (opponent != null) {
			System.out.println(this.getName() + message + opponent.getName());
			opponent.matchResult(null, theirScore, ourScore);
		}
	}

	public int ranking() {
		return (won * 2) + tied;
	}
}
