package mavenTest;

import org.testng.annotations.Test;

public class SeleniumTest {
	
	@Test
	public void mavenTestTutorial() {
		System.out.println("Testing Maven");
		System.out.println("Testing Maven2");
		System.out.println("Testing Maven3");
		
		//commit from Git
		System.out.println("Testing Maven4");
	}
	
	//created by develope branch from GitPractise i.e. IST
	@Test
	public void mavenTestTutorialDevelope() {
		System.out.println("Testing Maven from Develope branch");
		System.out.println("Testing Maven2 from Develope branch");
		System.out.println("Testing Maven3 from Develope branch");
		
		//commit from Git
		System.out.println("Testing Maven4 from Develope branch");
	}
	
	
	//created by new brach develope from Git i.e. EST
	@Test
	public void mavenTestTutorialGitDevelope() {
		System.out.println("Testing Maven from Develope branch of Git");
		System.out.println("Testing Maven2 from Develope branch of Git");
		System.out.println("Testing Maven3 from Develope branch of Git");
		
		//commit from Git
		System.out.println("Testing Maven4 from Develope branch of Git");
	}

}
