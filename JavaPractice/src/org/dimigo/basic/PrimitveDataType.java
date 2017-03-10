/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *		|_ PrimitveDataType
 *
 * 1. 개요 : 아이유 프로필
 * 2. 작성일 : 2017. 3. 10.
 * </pre>
 *
 * @author		: 신주영
 * @version 	: 1.0
 */
public class PrimitveDataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("<< 아이유 프로필 >>");
		
		String name = "아이유";
		boolean isMale = true;
		int age = 25;
		double height = 161.8;
		float weight = 44.3f;
		char bloodType = 'A';
		
		
		
		System.out.println("이름 : " + name);
		if(true){
			System.out.println("성별 : 여자");
		}
		else {
			System.out.println("성별 : 남자");
		}
		System.out.println("나이 : " + age +"세");
		System.out.println("키 : " + height + "cm");
		System.out.println("몸무게 : " + weight + "kg");
		System.out.println("혈액형 : " + bloodType + "형");
		
	

	}

}
