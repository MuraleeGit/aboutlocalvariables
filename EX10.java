//

package com.k2js.aboutlocalvariables.practice;

class EX10{
	 public static void m(){
		 {
		 int i=10;
		 {
			 i=20;
			 
		 }
		 System.out.println(i);
	 }
		System.out.println(i);
				 	
}
}
			 
//
//D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\aboutlocalvariables\src>javac -d  ..\bin com\k2js\aboutlocalvariables\practice\EX10.java
//com\k2js\aboutlocalvariables\practice\EX10.java:15: error: cannot find symbol
//                System.out.println(i);
//                                  ^
// symbol:   variable i
// location: class EX10
//1 error
