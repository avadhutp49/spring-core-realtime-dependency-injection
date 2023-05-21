package com.spring.test;

import java.io.IOException;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.comp.Flipkart;

public class TestApp {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("/com/spring/cfg/applicationContext.xml");
		System.out.println("\n ++++ Container Started. ++++");
		
		
		
		System.out.println("\n\tOrder :: 1");
		
		Flipkart flipkart = factory.getBean("fpkt", Flipkart.class);
		System.out.println(flipkart);
		String result = flipkart.doShopping(new String[] {"Watch","Pen","NoteBook"}, new float[] {100.0f, 200.0f, 300.0f});
		System.out.println(result);
		
		System.out.println("\n\tOrder :: 2");
		
		System.out.println("\n ++++ Container Stopped. ++++");
		Flipkart flipkart1 = factory.getBean("fpkt1", Flipkart.class);
		System.out.println(flipkart1);
		String result1 = flipkart.doShopping(new String[] {"AAAA","BBB","CCC"}, new float[] {10.0f, 20.0f, 30.0f});
		System.out.println(result1);
		System.out.println("\n ++++ Container Stopped. ++++");
	}
}
