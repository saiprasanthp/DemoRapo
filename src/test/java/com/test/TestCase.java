package com.test;

import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.PagesDemo;

public class TestCase extends BaseClass{
	
	
	
	@Test
	public void testPage() {
		super.setUp();
		PagesDemo j=new PagesDemo();
		j.img_dispalyed();
		j.type();
	}
}
