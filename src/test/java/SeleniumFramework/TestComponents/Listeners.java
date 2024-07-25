package SeleniumFramework.TestComponents;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	
	@Override  
	public void onTestStart(ITestResult result) {  
	  
	}  
	  
	@Override  
	public void onTestSuccess(ITestResult result) {  
	  
	System.out.println("Success of test cases and its details are : "+result.getName());  
	}  
	  
	@Override  
	public void onTestFailure(ITestResult result) {  
	  
	
		//code to add failed tets screenshot to report
	}  
	  
	@Override  
	public void onTestSkipped(ITestResult result) {  
	  
	System.out.println("Skip of test cases and its details are : "+result.getName());  
	}  
	  
	@Override  
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {  
  
	System.out.println("Failure of test cases and its details are : "+result.getName());  
	}  
	  
	@Override  
	public void onStart(ITestContext context) {  
	 
	}  
	  
	@Override  
	public void onFinish(ITestContext context) { 
		
		//extent.flush();
	  
	}  
	
	
	

}
