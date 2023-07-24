package com.hashmaplab;

import java.util.*;
import java.util.HashSet;

class Movie {
	int id;
	String name;
	double rating;

	public Movie() {
	}

	public Movie(int id, String name, double rating) {
		this.id = id;
		this.name = name;
		this.rating = rating;
	}

	public String toString() {
		return id + " " + name + " " + rating;
	}
}

class MymovieComparator implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {

		if (o2.rating > o1.rating)
			return 1;
		if (o2.rating < o1.rating)
			return -1;
		if (o2.rating == o1.rating)
			return 0;

		return 0;
	}

}

public class Hashset {

	public static void main(String[] args) {
		ArrayList<Movie> al = new ArrayList<Movie>();
		Movie M1 = new Movie(1, "rrr", 7.8);

		// al.add(M1);
		// al.add(M1);

		HashSet<Movie> hs = new HashSet<Movie>();

		hs.add(M1);
		hs.add(M1);
		System.out.println(hs);
		System.out.println("----------");

		// TreeSet<Movie>ts=new TreeSet<Movie>(new MymovieComparator());
		// ts.addAll(al);
		// System.out.println(ts);

	}

}
