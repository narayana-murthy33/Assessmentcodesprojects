package com;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WisherImplTest {
	
	private  WisherImpl WISHER_IMPL;
	
	@Before
	public void preSetUp() {
		System.out.println("Before test invoked");
		WISHER_IMPL=new WisherImpl();
	}

	@Test
	public void sayHello() {
		System.out.println("sayHelloNullCheck");
		WisherImpl serviceObject=new WisherImpl();
		String result = serviceObject.sayhi("upendra");
		//Hi upendra --> known o/p
		assertNotNull(result);
		assertEquals("Helloupendra", result);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSayHelloShouldThrowException() {
		System.out.println("testSayHelloShouldThrowException");
		
		WisherImpl impl=WISHER_IMPL;
		WisherImpl wisherObject=new WisherImpl();
		String response = wisherObject.sayhi("");
	}
	@Test(expected = IllegalArgumentException.class)
	public void testSayHelloShouldThrowExceptionForNullInput() {
		WisherImpl impl=WISHER_IMPL;
		System.out.println("testSayHelloShouldThrowExceptionForNullInput");
		
		WisherImpl wisherObject=new WisherImpl();
		
		String response = wisherObject.sayhi("Harish");
	}
	@After
	public void cleanUp() {
		System.out.println("After test invoked");
		WISHER_IMPL=null;
	}
	
	
	@Test
	public void testingMyOwnMethod() {
		
	}

}