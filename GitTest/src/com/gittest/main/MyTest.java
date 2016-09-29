package com.gittest.main;

#import com.gittest.util.MyUtil;

public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello world");
		
		
		System.out.println("This is an update that is done in Updates branch locally\n");

		System.out.println("Change to test automated Jenkins Build on GIT COMMIT!!");
		
		// ToDO:  ADD more classes in the project , in update branch. Then do selective Merge, and Push
		
		// Also create another project under the same repo,  and push it to Remote.
		
		#MyUtil m = new MyUtil();
		
		#m.getSysInfo();
		
		
		

	}

}
