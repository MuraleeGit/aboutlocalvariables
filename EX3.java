//to check the i value
package com.k2js.aboutlocalvariables.practice;

class test{
	 
	 public static void main(String...abc){
		 int i=10;
		 {
			 i=20;
			 System.out.println(i);
		 }
		 System.out.println(i);
		 
 	 }
	 
	

}
//Output
//
//D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\aboutlocalvariables\src>javac -cp ..\bin com\k2js\aboutlocalvariables\practice\EX2.java
//com\k2js\aboutlocalvariables\practice\EX2.java:7: error: illegal start of expression
//                 public int i;