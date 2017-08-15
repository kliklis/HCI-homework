package org.eclipse.wb.swing;

public class Car {

	private String owner;
	private String id;
	private String brand;
	private String todo;
	private String car_com;
	
	public Car(String o,String id, String b, String td, String cc){
		
		this.owner=o;
		this.id=id;
		this.brand=b;
		this.todo=td;
		this.car_com=cc;
		
	}
	
	public String getID(){
		return this.id;
	}
	
	
}
