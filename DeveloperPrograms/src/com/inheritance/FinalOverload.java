//yes it is possible to overload final method

package com.inheritance;
class parent 
{
public final void show(int x)
{
	System.out.println("Parent");
}
}
class child extends parent{
	public void show()
	{
		super.show(15);
		System.out.println("child");
	}
}

public class FinalOverload {

	public static void main(String[] args) {
     child c =new child();
     c.show();
     c.show(15);
	}

}
