package com.duobao.core;

import java.io.ByteArrayInputStream;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.QName;
import org.dom4j.io.SAXReader;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		assertTrue(true);
	}
	
	public static void main(String[] args) {
		String x = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><body><balance>999992390</balance><lotteryId>JSK3</lotteryId><issue>170118004</issue><records><record><id>33218015</id><result>0</result><printResult>0</printResult></record><record><id>33218016</id><result>0</result><printResult>0</printResult></record></records></body>";
		ByteArrayInputStream in = new ByteArrayInputStream(x.getBytes());
		SAXReader saxReader = new SAXReader();
		try {
			
			Document doc = saxReader.read(in);
			Element root = doc.getRootElement();
			//showEle(root);
			Element record= root.element("records");
			List<Element> records = record.elements();
			System.out.println(records.size());
			for(Element e:records){
				System.out.println(e.getName());
			}
			
			
			/*List<Element> eles= root.elements();
			for(Element e:eles){
				
				
				
				
				
			}*/
			
			
			
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void showEle(Element e){
		List<Element> eles= e.elements();
		for(Element el:eles){
			if(!el.isTextOnly()){
				showEle(el);
			}else{
				QName name = el.getQName();
				System.out.println(name.getName());
			}
			
		}
	} 
	
}
