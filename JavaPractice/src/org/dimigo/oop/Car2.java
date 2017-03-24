/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *		|_ Car
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 *
 * @author		: 신주영
 * @version 	: 1.0
 */
public class Car2 {
	
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public Car2(){
		
	}
	
	public Car2(String newcompany,String newmodel,String newcolor,int newMaxSpeed, int newPrice){
		company = newcompany;
		model = newmodel;
		color = newcolor;
		maxSpeed = newMaxSpeed;
		price = newPrice;
	}
	
	public String getCompany(){
		return company;
	}
	public String getModel(){
		return model;
	}
	public String getColor(){
		return color;
	}
	public int getMaxspeed(){
		return maxSpeed;
	}
		public int getPrice(){
		return price;
	}	
	

}
