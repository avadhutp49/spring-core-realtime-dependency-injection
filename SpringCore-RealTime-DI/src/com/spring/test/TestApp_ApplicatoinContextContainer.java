package com.spring.test;

import java.io.IOException;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.comp.Flipkart;

public class TestApp_ApplicatoinContextContainer {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
	
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("com/spring/cfg/applicationContext.xml");
		System.out.println("\n ++++ Container Started. ++++");
		
		
		
		System.out.println("\n\tOrder :: 1");
		
		Flipkart flipkart = factory.getBean("fpkt", Flipkart.class);
		System.out.println(flipkart);
		String result = flipkart.doShopping(new String[] {"Watch","Pen","NoteBook"}, new float[] {100.0f, 200.0f, 300.00f});
		System.out.println(result);
		
	
	
	}
}
