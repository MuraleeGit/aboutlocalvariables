//

package com.k2js.aboutlocalvariables.practice;

class EX8{
	 public static void m(int a, int b){
		
		final int i;
		{
			i=20;
			System.out.println(i);//Here also it will print 20
		}
		System.out.println(i);//Here also it will print 20
	 }
		public static void main(String...abc){
				m(10,20);
		}
			
	 
}
	 
//D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\aboutlocalvariables\src>javac -d  ..\bin com\k2js\aboutlocalvariables\practice\EX7.java
//
//D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\aboutlocalvariables\src>java -cp ..\bin com.k2js.aboutlocalvariables.practice.EX7
//20
//20
