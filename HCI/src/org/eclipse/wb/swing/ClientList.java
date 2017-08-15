package org.eclipse.wb.swing;

import java.util.ArrayList;

public class ClientList{

	public ArrayList<Client> clients = new ArrayList<>();
	
	public ClientList(){
		
	}
	
	public void newClient(String n, String p, String d, String cc){
		Client c1=new Client(n,p,d,cc);
		clients.add(c1);
		
	
	}
	
	public void deleteClient(String name){
		
		for(int i = 0; i < clients.size(); i++){
			if(clients.get(i).getName().equals(name)){
				clients.remove(i);
			}
		}
	}

	public int getSize() {
		return clients.size();
	}

	public Client getItem(int i) {
		// TODO Auto-generated method stub
		return clients.get(i);
	}
	
	
}
