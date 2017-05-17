/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 *		|_ SmartPhoneTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 12.
 * </pre>
 *
 * @author		: 신주영
 * @version 	: 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SmartPhone [] phone = {
				new IPhone("iPhone 7","애플",900000),
				new Galaxy("갤럭시 S8","삼성",800000)
		};
		
		for(SmartPhone sp : phone) {
			System.out.println(sp.toString());
			sp.trunOn();
			sp.useSpecialFunction();
			sp.pay();
			sp.turnOff();
			System.out.println();
		}
	}
	
}