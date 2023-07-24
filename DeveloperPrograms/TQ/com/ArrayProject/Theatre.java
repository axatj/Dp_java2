package com.ArrayProject;

import java.util.Arrays;

public class Theatre {
	private int t_id;
	private String t_name;
	private Movie[] m;

	public int getT_id() {
		return t_id;
	}

	public void setT_id(int t_id) {
		this.t_id = t_id;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	public Movie[] getM() {
		return m;
	}

	public void setM(Movie[] m) {
		this.m = m;
	}

	public String toString() {
		return t_id + " " + t_name + " " +Arrays.toString(m);
	}

}
