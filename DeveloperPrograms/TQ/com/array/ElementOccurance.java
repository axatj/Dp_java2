package com.array;

public class ElementOccurance {

	public void findOccurance(int a[]) {
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			boolean isvisited = false;
			for (int k = i - 1; k >= 0; k--) {
				if (a[i] == a[k]) {
					isvisited = true;
					break;
				}
			}
			if (isvisited == false) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						count++;
					}
				}
				System.out.println(a[i] + " " + count);
			}
		}
	}

	public static void main(String[] args) {
		int a[] = { 1, 4, 1, 3, 6, 4, 4 };
		ElementOccurance e = new ElementOccurance();
		e.findOccurance(a);

	}

}
