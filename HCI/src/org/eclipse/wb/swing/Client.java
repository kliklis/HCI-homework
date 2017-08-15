package org.eclipse.wb.swing;

public class Client {


	private String name;
	private String phone;
	private String cost;
	private String client_com;
	
	public Client(String n,String p,String c,String cc) {
		this.name=n;
		this.phone=p;
		this.cost=c;
		this.client_com=cc;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getCost(){
		return this.cost;
	}
}
