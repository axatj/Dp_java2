package com.opps;

public class AccessModifier {

	private int a=20;
	int b=10;
	protected int c=30;
	public int d=40;
	public void getPublic() {
		System.out.println("This is public");
	}
	protected void getProtected() {
		System.out.println("This is protected");
	}
	void getDefault() {
		System.out.println("This is default");
	}
	private void getPrivate(){
		System.out.println("This is private");
	}
	public static void main(String[] args) {
		AccessModifier am=new AccessModifier();
		System.out.println(am.a);
		am.getPrivate();
		System.out.println(am.b);
		am.getDefault();
		System.out.println(am.c);
		am.getProtected();
		System.out.println(am.d);
		am.getPublic();
		
		// TODO Auto-generated method stub

	}

}
