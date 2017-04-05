package com.lucky.core;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.lucky.core.entity.product.Product;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {		
		FileSystemXmlApplicationContext fileSys = new FileSystemXmlApplicationContext("C:/Users/WangBin/git/core/src/main/java/springTest.xml");
		Product product = (Product)fileSys.getBean("product");
		System.out.println(product.getName());
	}
}
