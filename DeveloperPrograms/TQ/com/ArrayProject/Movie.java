package com.ArrayProject;

public class Movie {
	private int m_id;
	private String m_name;
	private float rating;

	public int getMid() {
		return m_id;
	}

	public void setM_id(int m_id) {
		this.m_id = m_id;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public void setRating(float rating) {
		this.rating = rating;

	}

	public float getRating() {

		return rating;
	}

	public String toString() {

		return m_id + " " + m_name + " " + rating;
	}

}
