package com.opps;

public class Student {

	int id;
	int name;
    int science,maths,english;
    double percentage;   
   public void accept_student_details(int sid,int sname,int sscience,int smaths,int senglish)
   {
	   id=sid;
	   name=sname;
	   science=sscience;
	   maths=smaths;
	   english=senglish;
	   System.out.println(id+""+name+""+science+""+maths+""+english);
   }
   public void percent(int spercentage)
   {
	   percentage=maths+science+english/300;
	   System.out.println(percentage+"");
	   
   }
    
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}

}
