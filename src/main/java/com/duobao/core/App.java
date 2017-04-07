package com.duobao.core;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.duobao.core.entity.product.ProductEntity;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {		
		FileSystemXmlApplicationContext fileSys = new FileSystemXmlApplicationContext("C:/Users/WangBin/git/core/src/main/java/springTest.xml");
		ProductEntity product = (ProductEntity)fileSys.getBean("product");
		System.out.println(product.getName());
	}
}
