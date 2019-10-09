//

package com.k2js.aboutlocalvariables.practice;

class EX9{
	 public static void m(int a, int b){
		 
		 try{
			 int i=10;
			 System.out.println(i);
		 }
		 catch(NullPointerException e){
			 //System.out.println(i);
		 }
	 }
	 
	 public static void main(String...abc){
		 m(10,10);
	 }
	 
		 	
}
			 
//D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\aboutlocalvariables\src>javac -d  ..\bin com\k2js\aboutlocalvariables\practice\EX7.java
//
//D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\aboutlocalvariables\src>java -cp ..\bin com.k2js.aboutlocalvariables.practice.EX7
//20
//20
