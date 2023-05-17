package com.inheritanceDemo;

 class Csk extends IPLTeam{
	 void Csk() {
		 System.out.println("Csk");
		 
	 }
}
 class Rcb extends IPLTeam{
	void Rcb()
	{
		System.out.println("Rcb");
	}
}
 public class IPLTeam {
	 void play(){
		  
		 System.out.println("Play");
		 
	 }

 public static void main(String[] args) {
     Rcb r=new Rcb();
     r.Rcb();
     r.play();
     
 }
}

