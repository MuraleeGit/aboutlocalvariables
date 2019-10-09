//Number 15, th biggerst digit multiplied with 15

package com.k2js.aboutlocalvariables.practice;

class B{
	 public static void main(String...abc){
		 int r1;
		 int r2;
		 Comparable c=15;
		  int d = (int)c/10;
		  int e =(int)c%10;
		  if(d>e){
			  r1 = d*15;
			  System.out.println("The bigest number multiplied by 15 is " +r1);
		  }
		  else{
			   r2= e*15;
			  System.out.println("The bigest number multiplied by 15 is " +r2);
		  }
	 }
}
	 
	 
