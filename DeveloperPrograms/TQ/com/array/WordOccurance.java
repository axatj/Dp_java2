package com.array;

public class WordOccurance {

	public static void main(String[] args) {
		String s = "India is my country I love my India";
		String st[] = s.split(" ");

		for (int i = 0; i < st.length; i++) {
			int count = 1;
			boolean isVisited = true;
			for (int k = i - 1; k >= 0; k--) {
				if (st[i].equals(st[k]))

				{
					isVisited = false;
					break;
				}
			}
			if (isVisited) {
				for (int j = i + 1; j < st.length; j++) {
					if (st[j].equals(st[i])) {
						count++;
					}
				}


				if (count >= 1) {
					System.out.println(st[i] + " " + count);
				}
			}

		}
	}
}
