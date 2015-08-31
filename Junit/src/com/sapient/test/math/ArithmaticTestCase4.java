package com.sapient.test.math;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.math.Arithmatic;

public class ArithmaticTestCase4 {
	int firstNumber, secondNumber;
	
	/**
	 * Test method for {@link com.sapient.math.Arithmatic#sum(int, int)}.
	 */
	public void testSum() {
		int expectedResult = 6;
		Arithmatic arithmaticObjectRef = new Arithmatic();
		int actualResult = arithmaticObjectRef.sum(firstNumber, secondNumber);
		assertEquals(expectedResult, actualResult);
	}

	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		firstNumber = 2;
		secondNumber = 4;
	}

	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		firstNumber = 0;
		secondNumber = 0;
	}

}