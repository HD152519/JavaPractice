/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *		|_ SnackTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 6.
 * </pre>
 *
 * @author		: 신주영
 * @version 	: 1.0
 */
public class SnackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Snack[] snacks = null;
		snacks = new Snack[3];
		
		snacks[0] = new Snack("새우깡","농심",1100,2);
		snacks[1] = new Snack("콘칩","크라운",1200,1);
		snacks[2] = new Snack("허니버터칩","해태",1500,4);
		
		int sum = 0;
		
		for(int i = 0; i < snacks.length; i++){
			System.out.println("이름 : " + snacks[i].getName());
			System.out.println("제조사 : " + snacks[i].getCompany());
			System.out.println("가격 : " + String.format("%,d",snacks[i].getPrice()));
			System.out.println("개수 : " + snacks[i].getNumber());
			sum += snacks[i].calcPrice();
		}
		
		System.out.println("총 구매 금액 : " + String.format("%,d", sum));
		
		
		
		
		
	}

}
