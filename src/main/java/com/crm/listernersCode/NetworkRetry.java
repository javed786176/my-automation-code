package com.crm.listernersCode;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class NetworkRetry implements IRetryAnalyzer {
	int start=0;int end=5;
	@Override
	public boolean retry(ITestResult result) {
	
			
			if(start<end)
			{
			start++;
				return true;
			}
					return false;
	}

}
