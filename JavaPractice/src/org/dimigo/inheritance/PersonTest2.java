/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.basic
 *		|_ PersonTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 8.
 * </pre>
 *
 * @author		: 신주영
 * @version 	: 1.0
 */
public class PersonTest2 {


	public static void main(String[] args) {
		Person p = new Person("Tom");
		Korean k = new Korean("홍길동");
		Japanese j = new Japanese("다나카");
		Chinese c = new Chinese("왕밍");
		
		Person [] person = { new Person ("Tom"),
							 new Korean("홍길동"),
							 new Japanese("다나카"),
							 new Chinese("왕밍")
							};
		
		for(Person pp : person) {
			greeting(pp);
		}
	}
	
	public static void greeting(Person p){
		System.out.println(p.toString());
		p.sayHello();
		p.sayBye();
		System.out.println();
	}

}
